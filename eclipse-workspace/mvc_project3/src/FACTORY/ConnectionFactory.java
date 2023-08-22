package FACTORY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory 
{
	public static Connection getConnection() throws ClassNotFoundException, SQLException 
	{
		String url="jdbc:mysql://localhost:3306/sai";
		String u="root";
		String p="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, u, p);
		return con;		
	}

}
