package jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class DAO
{
public static int data(bean b)throws Exception
{
	String Query="INSERT INTO PRODUCT2(pname,pid,salary,quantity) values(?,?,?,?);";
	Connection con=connectionfactory.getdata();
	PreparedStatement pst=con.prepareStatement(Query);
	pst.setString(1,b.getPname());
	pst.setInt(1,b.getPid());
	pst.setDouble(1,b.getSalary());
	pst.setInt(1,b.getQuantity());
	 int rows=pst.executeUpdate();	 
	 pst.close();
	 con.close();
	 return rows;
	
}

}
