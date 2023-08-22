package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String fullname="sai";
		String email="saik46573@gmail.com";
		String mobile="9581150118";
		String username="saikrishna";
		String password="saik46573";
		Class.forName("com.mysql.cj.jdbc.Driver");
		 String url="jdbc:mysql://localhost:3306/user";
		 String u="root";
		 String p="root";
		Connection con =DriverManager.getConnection(url,u,p);
		PreparedStatement pst=con.prepareStatement("INSERT INTO regis (FULLNAME,EMAIL,MOBILE,USERNAME,PASSWORD) VALUES (?,?,?,?,?) ;" );
		 pst.setString(1, fullname);
		 pst.setString(2, email);
		 pst.setString(3, mobile);
		 pst.setString(4, username);
		 pst.setString(5, password);
		int rows=pst.executeUpdate();
	

	}

}
