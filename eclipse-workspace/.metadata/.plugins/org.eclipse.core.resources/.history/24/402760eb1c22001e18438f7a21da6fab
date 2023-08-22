package DAO;

import java.sql.*;

import DTO.Bean;
import factory.factoryclass;

public class ProductDaoimpl implements productDao
{
@Override
	public String add(Bean b) throws ClassNotFoundException, SQLException 
	{
	Connection con=factoryclass.getConnection();
	PreparedStatement pst=con.prepareStatement("INSERT INTO PRODUCT (PNAME,PID,PRICE,QUANTITY) VALUES (?,?,?,?);");
	pst.setString(1,b.pname);
	pst.setString(2,b.pid);
	pst.setInt(3,b.price);
	pst.setInt(4,b.quantity);
	int rows=pst.executeUpdate();
		return rows+" ";
	}
	public String update(Bean b) throws ClassNotFoundException, SQLException 
	{
		Connection con=factoryclass.getConnection();
		PreparedStatement pst=con.prepareStatement("UPDATE PRODUCT SET PNAME=?,PRICE=?,QUANTITY=? WHERE PID=?;");
		pst.setString(1,b.pname);
		pst.setInt(2,b.price);
		pst.setInt(3,b.quantity);
		pst.setString(4,b.pid);
		int rows=pst.executeUpdate();
			return rows+" ";
	}
	public ResultSet view(String pid) throws ClassNotFoundException, SQLException
	{
		Connection con=factoryclass.getConnection();
		PreparedStatement pst=con.prepareStatement("SELECT * PRODUCT WHERE PID=?;");
		ResultSet rs=pst.executeQuery();
		return rs;		
	}
	public String delete(String pid) throws ClassNotFoundException, SQLException
	{
		Connection con=factoryclass.getConnection();
		PreparedStatement pst=con.prepareStatement("DELETE FROM PRODUCT WHWRE PID=?;");
		int rows=pst.executeUpdate();
	 return rows+" ";
	}
}
