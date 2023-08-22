package registrationUser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnectionFactory;

public class UserRegisterDao 
{
	public static int userRegister(String fullname,String mobile,String username,String password) throws ClassNotFoundException, SQLException
	{
		System.out.println(fullname);
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pst=con.prepareStatement("INSERT INTO USERREGISTER(FULLNAME,MOBILE,USERNAME,PASSWORD) VALUES (?,?,?,?);");
		pst.setString(1,fullname);
		pst.setString(2,mobile);
		pst.setString(3,username);
		pst.setString(4,password);
		return pst.executeUpdate();
	}

}
