package pool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 * 数据库连接池
 * 该池为单例池
 * 用户可以从此池中获取含有状态的数据库连接
 * @author caiguangzong
 *
 */
public class ConPool {
	
	private List<MyCon> MySqlfreeCons = new ArrayList<MyCon>(); //MySql数据库空闲连接列表
	private List<MyCon> MySqlbuzyCons = new ArrayList<MyCon>(); //MySql数据库繁忙连接列表
	private int MySqlmax = 10; //MySql最大连接数
	private int MySqlmin = 2; //MySql最小连接数
	private int MySqlcurrent = 0; //MySql当前链接数	
	
	private List<MyCon> SqlServerfreeCons = new ArrayList<MyCon>(); //SqlServer数据库空闲连接列表
	private List<MyCon> SqlServerbuzyCons = new ArrayList<MyCon>(); //SqlServer数据库繁忙连接列表
	private int SqlServermax = 10; //SqlServer最大连接数
	private int SqlServermin = 2; //SqlServer最小连接数
	private int SqlServercurrent = 0; //SqlServer当前链接数	
	
	private static ConPool instance; //单例实例	
	/**
	 * 私有的构造方法，在构造池实例时，检查当前连接是否小于最小连接，如果小于，则创建新的连接直到大于或等于最小连接
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
	 * 获取池实例
	 */
	public static ConPool getIntance(){
		if(instance == null)
			instance = new ConPool();
		return instance;
	}
	/**
	 * 获取空闲数据库连接
	 * 先从空闲列表中找出一个连接
	 * 如果空闲列表中没有连接，则试图创建一个连接
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
	 * 获取一个空闲连接
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
	 * 试图获取一个新连接
	 * 如果当前连接数小于最大，则创建新的连接，否则返回null
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
	 * 创建新的连接，并更新当前连接总数
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
	 * 将连接设为空闲状态
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
	 * 输入当前池的连接状态
	 */
	public String toString(String s){
		String str;
		if(s=="MySql") {
			str="MySql数据库\t当前连接数：" + this.MySqlcurrent + "	空闲连接数：" + this.MySqlfreeCons.size() + "	繁忙连接数：" + this.MySqlbuzyCons.size();
		}else {
			str="SqlServer数据库\t当前连接数：" + this.SqlServercurrent + "	空闲连接数：" + this.SqlServerfreeCons.size() + "	繁忙连接数：" + this.SqlServerbuzyCons.size();
		}
		return str;
	}
}