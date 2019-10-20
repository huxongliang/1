package sqlserver;

import java.sql.*;
public class ConnectToSQL {
public static void main(String[] args) {
// TODO Auto-generated method stub
String jdbcDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
String connectDB="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Test";//声明数据库Test的URL
try
{
Class.forName(jdbcDriver);//加载数据库驱动
}
catch(ClassNotFoundException e)
{
e.printStackTrace();
System.out.println("加载数据库引擎失败");
System.exit(0);
}
System.out.println("数据库驱动成功");
try
{
String user="sa";//数据库用户名
String password="123456";//数据库密码
Connection connection=DriverManager.getConnection(connectDB,user,password);//建立数据库连接，获得连接对象
System.out.println("连接数据库成功");
Statement statement=connection.createStatement();//创建一个Statement对象
System.out.println("开始创建表");
String query="CREATE TABLE Person(NAME CHAR(10),SEX NCHAR(2),AGE INT)";//生成一条SQL建表语句
statement.executeUpdate(query);//执行SQL建表语句
System.out.println("开始插入数据");
String a1="INSERT INTO Person VALUES('张三','男',18)";//生成一条SQL插入数据语句
String a2="INSERT INTO Person VALUES('李四','男',19)";//生成一条SQL插入数据语句
String a3="INSERT INTO Person VALUES('王五','男',20)";//生成一条SQL插入数据语句
statement.executeUpdate(a1);//执行SQL插入语句
statement.executeUpdate(a2);//执行SQL插入语句
statement.executeUpdate(a3);//执行SQL插入语句
System.out.println("插入数据成功");
System.out.println("开始读取数据");
ResultSet resultset=statement.executeQuery("SELECT *FROM Person");
System.out.println("姓名\t性别\t年龄");
while(resultset.next())//遍历结果集，输出每一条记录
{
System.out.println(resultset.getString("NAME")+"\t"+resultset.getString("SEX")+"\t"+resultset.getInt("AGE"));
}
System.out.println("读取完毕");
statement.close();//关闭命令对象连接
connection.close();//关闭数据库连接
}
catch(SQLException e)
{
e.printStackTrace();
System.out.println("数据库连接错误");
System.exit(0);
}

}


}
