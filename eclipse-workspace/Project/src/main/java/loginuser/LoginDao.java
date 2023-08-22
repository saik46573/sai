package loginuser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionFactory;

public class LoginDao
{
	public static ResultSet userLoginDao(String username,String password) throws ClassNotFoundException, SQLException
	{
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pst=con.prepareStatement("SELECT * FROM USERREGISTER WHERE USERNAME=? AND PASSWORD=?");
		pst.setString(1,username);
		pst.setString(2,password);
		return pst.executeQuery();
	}


}
