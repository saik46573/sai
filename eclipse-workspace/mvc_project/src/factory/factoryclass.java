package factory;
import java.sql.*;
public class factoryclass 
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
