package db_Operations_Programms;


import java.sql.*;
import java.util.Scanner;

public class Create_Datainto_Table {

	public static void CreateAndRegister(String Dburl,String DbUsername,String Password,String name,int age) throws SQLException
	{
		Connection conn=DriverManager.getConnection(Dburl,DbUsername,Password);
		
		Statement stmt=conn.createStatement();
		//stmt.execute("Create database Programming4;");
		stmt.execute("show databases");
		stmt.execute("use Programming4");
		//stmt.execute("create table Emp(Name varchar(50) Primary key,Age int(3))");
		stmt.execute("insert into Emp Values('"+name+"',"+age+")");
		
		ResultSet res=stmt.executeQuery("select Name,Age from Emp");
		while(res.next())
		{
			String Name=res.getString("Name");
			int Age=res.getInt("Age");
			if(Name.equals(name))
			{
				System.out.println(Name+" Data Stored successfully!!!");
				break;
			}
		}
		res=stmt.executeQuery("select * from Emp where name='"+name+"'");
		while(res.next())
		{
			System.out.println(res.getString("Name"));
			System.out.println(res.getInt("Age"));
		}
		
	}
	
	public static void main(String[] args) throws SQLException
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter Name here :");
		String name=scan.next();
		System.out.print("Enter Age here :");
		int age=scan.nextInt();
		CreateAndRegister("jdbc:mysql://127.0.0.1:3307/", "root", "root", name, age);
	}
	
	
	//| SQL Type | Method            |
	//| -------- | ----------------- |
	//| SELECT   | `executeQuery()`  |
	//| INSERT   | `executeUpdate()` |
	//| UPDATE   | `executeUpdate()` |
	//| DELETE   | `executeUpdate()` |
	//| CREATE   | `executeUpdate()` |
	//| DROP     | `executeUpdate()` |
	//| ALTER    | `executeUpdate()` |

	
	
}
