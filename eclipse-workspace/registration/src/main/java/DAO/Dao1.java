package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao1 
{
	public ResultSet DaoMethod1(String username,String password) throws ClassNotFoundException, SQLException
	 {
//		 System.out.println(fullname);
//		 System.out.println(fullname);
//		 System.out.println(fullname);
//		 System.out.println(fullname);
//		 System.out.println(fullname);
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 String url="jdbc:mysql://localhost:3306/user";
		 String u="root";
		 String p="root";
		Connection con =DriverManager.getConnection(url,u,p);
		PreparedStatement pst=con.prepareStatement("SELECT * FROM USER WHERE USERNAME=? && PASSWORD=?");
		return pst.executeQuery();
		
	 }
	

}
