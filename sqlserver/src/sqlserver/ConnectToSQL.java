package sqlserver;

import java.sql.*;
public class ConnectToSQL {
public static void main(String[] args) {
// TODO Auto-generated method stub
String jdbcDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
String connectDB="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Test";//�������ݿ�Test��URL
try
{
Class.forName(jdbcDriver);//�������ݿ�����
}
catch(ClassNotFoundException e)
{
e.printStackTrace();
System.out.println("�������ݿ�����ʧ��");
System.exit(0);
}
System.out.println("���ݿ������ɹ�");
try
{
String user="sa";//���ݿ��û���
String password="123456";//���ݿ�����
Connection connection=DriverManager.getConnection(connectDB,user,password);//�������ݿ����ӣ�������Ӷ���
System.out.println("�������ݿ�ɹ�");
Statement statement=connection.createStatement();//����һ��Statement����
System.out.println("��ʼ������");
String query="CREATE TABLE Person(NAME CHAR(10),SEX NCHAR(2),AGE INT)";//����һ��SQL�������
statement.executeUpdate(query);//ִ��SQL�������
System.out.println("��ʼ��������");
String a1="INSERT INTO Person VALUES('����','��',18)";//����һ��SQL�����������
String a2="INSERT INTO Person VALUES('����','��',19)";//����һ��SQL�����������
String a3="INSERT INTO Person VALUES('����','��',20)";//����һ��SQL�����������
statement.executeUpdate(a1);//ִ��SQL�������
statement.executeUpdate(a2);//ִ��SQL�������
statement.executeUpdate(a3);//ִ��SQL�������
System.out.println("�������ݳɹ�");
System.out.println("��ʼ��ȡ����");
ResultSet resultset=statement.executeQuery("SELECT *FROM Person");
System.out.println("����\t�Ա�\t����");
while(resultset.next())//��������������ÿһ����¼
{
System.out.println(resultset.getString("NAME")+"\t"+resultset.getString("SEX")+"\t"+resultset.getInt("AGE"));
}
System.out.println("��ȡ���");
statement.close();//�ر������������
connection.close();//�ر����ݿ�����
}
catch(SQLException e)
{
e.printStackTrace();
System.out.println("���ݿ����Ӵ���");
System.exit(0);
}

}


}
