package pool;

import java.sql.*;

public class MySqlDAO {
	
	public static Connection getMySqlConnection()  throws Exception{
		String driverName = "com.mysql.cj.jdbc.Driver";
		String dbURL = "jdbc:mysql://localhost:3306/book?useSSL=false&serverTimezone=UTC";
		String userName = "root";
		String userPwd = "angm13y4-$";
		Connection DbCon = null;
		try {
			Class.forName(driverName);// 初始化驱动
			//System.out.println("加载驱动成功！");
			DbCon = DriverManager.getConnection(dbURL, userName, userPwd);// 建立JDBC和数据库之间的Connection连接
			//System.out.println("连接数据库成功！");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DbCon;	
	}
	
	 public static Connection getSqlServerConnection()
		{
		 String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		    String dbURL="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=STUDENT1";
		   String userName="sa";
		   String userPwd="123";
		   Connection DbCon=null;
		  try
		 {
		     Class.forName(driverName);//初始化驱动
		    // System.out.println("加载驱动成功！");
		     DbCon=DriverManager.getConnection(dbURL,userName,userPwd);//建立JDBC和数据库之间的Connection连接
	        // System.out.println("连接数据库成功！");	         
		 }catch(Exception e){
		     e.printStackTrace();
		 }
		return DbCon;
		}
	
}