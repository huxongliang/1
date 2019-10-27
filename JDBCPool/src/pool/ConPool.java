package pool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 * ���ݿ����ӳ�
 * �ó�Ϊ������
 * �û����ԴӴ˳��л�ȡ����״̬�����ݿ�����
 * @author caiguangzong
 *
 */
public class ConPool {
	
	private List<MyCon> MySqlfreeCons = new ArrayList<MyCon>(); //MySql���ݿ���������б�
	private List<MyCon> MySqlbuzyCons = new ArrayList<MyCon>(); //MySql���ݿⷱæ�����б�
	private int MySqlmax = 10; //MySql���������
	private int MySqlmin = 2; //MySql��С������
	private int MySqlcurrent = 0; //MySql��ǰ������	
	
	private List<MyCon> SqlServerfreeCons = new ArrayList<MyCon>(); //SqlServer���ݿ���������б�
	private List<MyCon> SqlServerbuzyCons = new ArrayList<MyCon>(); //SqlServer���ݿⷱæ�����б�
	private int SqlServermax = 10; //SqlServer���������
	private int SqlServermin = 2; //SqlServer��С������
	private int SqlServercurrent = 0; //SqlServer��ǰ������	
	
	private static ConPool instance; //����ʵ��	
	/**
	 * ˽�еĹ��췽�����ڹ����ʵ��ʱ����鵱ǰ�����Ƿ�С����С���ӣ����С�ڣ��򴴽��µ�����ֱ�����ڻ������С����
	 */
	private ConPool(){ 
		while(this.MySqlmin>this.MySqlcurrent){
			this.MySqlfreeCons.add(this.createCon("MySql"));
		}
		while(this.SqlServermin>this.SqlServercurrent){
			this.SqlServerfreeCons.add(this.createCon(("SqlServer")));
		}
	}	
	/**
	 * ��ȡ��ʵ��
	 */
	public static ConPool getIntance(){
		if(instance == null)
			instance = new ConPool();
		return instance;
	}
	/**
	 * ��ȡ�������ݿ�����
	 * �ȴӿ����б����ҳ�һ������
	 * ��������б���û�����ӣ�����ͼ����һ������
	 */
	public MyCon getCon(String s) {
		MyCon myCon = this.getFreeCon(s);
		if (myCon != null) {
			return myCon;
		} else {
			return this.getNewCon(s);
		}
	}	
	/**
	 * ��ȡһ����������
	 */
	private MyCon getFreeCon(String s) {
		if (s == "MySql") {
			if (MySqlfreeCons.size() > 0) {
				MyCon con = MySqlfreeCons.remove(0);
				con.setState(MyCon.BUZY);
				this.MySqlbuzyCons.add(con);
				return con;
			} else {
				return null;
			}
		} else {
			if (SqlServerfreeCons.size() > 0) {
				MyCon con = SqlServerfreeCons.remove(0);
				con.setState(MyCon.BUZY);
				this.SqlServerbuzyCons.add(con);
				return con;
			} else {
				return null;
			}
		}
	}

	/**
	 * ��ͼ��ȡһ��������
	 * �����ǰ������С������򴴽��µ����ӣ����򷵻�null
	 */
	private MyCon getNewCon(String s) {
		if (s == "MySql") {
			if (this.MySqlcurrent < this.MySqlmax) {
				MyCon myCon = this.createCon("MySql");
				myCon.setState(MyCon.BUZY);
				this.MySqlbuzyCons.add(myCon);
				return myCon;
			} else {
				return null;
			}
		} else {
			if (this.SqlServercurrent < this.SqlServermax) {
				MyCon myCon = this.createCon(("SqlServer"));
				myCon.setState(MyCon.BUZY);
				this.SqlServerbuzyCons.add(myCon);
				return myCon;
			} else {
				return null;
			}
		}
	}	
	
	/**
	 * �����µ����ӣ������µ�ǰ��������
	 */
	private MyCon createCon(String s) {
		if (s == "MySql") {
			try {
				Connection con = MySqlDAO.getMySqlConnection();
				MyCon myCon = new MyCon(con);
				this.MySqlcurrent++;
				return myCon;
			} catch (Exception e) {
			}
			return null;
		} else {
			try {
				Connection con = MySqlDAO.getSqlServerConnection();
				MyCon myCon = new MyCon(con);
				this.SqlServercurrent++;
				return myCon;
			} catch (Exception e) {
			}
			return null;
		}
	}	
	/**
	 * ��������Ϊ����״̬
	 * @param con
	 */
	public void setFree(MyCon con, String s) {
		if (s == "MySql") {
			this.MySqlbuzyCons.remove(con);
			con.setState(MyCon.FREE);
			this.MySqlfreeCons.add(con);
		} else {
			this.SqlServerbuzyCons.remove(con);
			con.setState(MyCon.FREE);
			this.SqlServerfreeCons.add(con);
		}
	}	
	/**
	 * ���뵱ǰ�ص�����״̬
	 */
	public String toString(String s){
		String str;
		if(s=="MySql") {
			str="MySql���ݿ�\t��ǰ��������" + this.MySqlcurrent + "	������������" + this.MySqlfreeCons.size() + "	��æ��������" + this.MySqlbuzyCons.size();
		}else {
			str="SqlServer���ݿ�\t��ǰ��������" + this.SqlServercurrent + "	������������" + this.SqlServerfreeCons.size() + "	��æ��������" + this.SqlServerbuzyCons.size();
		}
		return str;
	}
}