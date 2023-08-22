package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class connectionfactory
{
	public static Connection getdata() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/school";
		System.out.println("enter the sql user name ");
		String username=sc.next();
		System.out.println("enter the sql password ");
		String password=sc.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, username, password);
		return con;
		
	}

}
