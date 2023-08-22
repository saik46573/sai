package DAO;
import java.sql.*;

import DTO.Bus_Reservation;
import FACTORY.ConnectionFactory;

public class Bus_Reservation_Impl implements Bus_Reservation_Dao 
{

	@Override
	public int insert(Bus_Reservation B) throws ClassNotFoundException, SQLException 
	{
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pst=con.prepareStatement
				("INSERT INTO Bus_Reservation(Reservation_id,Bus_No,Passenger_name,mobile_no,FromLocation,ToLocation,Ticket_No,Ticket_Price) VALUES (?,?,?,?,?,?,?,?);");
			pst.setInt(1,B.getReservation_id());
			pst.setString(2,B.getBus_No());
			pst.setString(3,B.getPassenger_name());
			pst.setString(4, B.getMobile_no());
			pst.setString(5, B.getFromLocation());
			pst.setString(6,B.getToLocation());
			pst.setInt(7,B.getTicket_No() );
			pst.setDouble(8,B.getTicket_Price());	
			int rows=pst.executeUpdate();
		return rows;
	}
	@Override
	public int update(Bus_Reservation B) throws ClassNotFoundException, SQLException
	{
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pst=con.prepareStatement
				("UPDATE Bus_Reservation SET Bus_No=?,Passenger_name=?,mobile_no=?,FromLocation=?,ToLocation=?,Ticket_No=?,Ticket_Price=? WHERE Reservation_id=? ;");
			pst.setString(1,B.getBus_No());
			pst.setString(2,B.getPassenger_name());
			pst.setString(3, B.getMobile_no());
			pst.setString(4, B.getFromLocation());
			pst.setString(5,B.getToLocation());
			pst.setInt(6,B.getTicket_No() );
			pst.setDouble(7,B.getTicket_Price());
//			System.out.println("enter the reservation_id to update");
			pst.setInt(8,B.getReservation_id());
			int rows=pst.executeUpdate();
		return rows;
	}

	@Override
	public ResultSet view(Bus_Reservation B) throws SQLException, ClassNotFoundException 
	{
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pst=con.prepareStatement("SELECT * FROM Bus_Reservation;");
		ResultSet rs=pst.executeQuery();
		return rs;
	}
	@Override
	public int delete(Bus_Reservation B) throws ClassNotFoundException, SQLException 
	{
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pst=con.prepareStatement("DELETE FROM Bus_Reservation WHERE Reservation_id=?;");
		pst.setInt(1,B.getReservation_id());
		int rows=pst.executeUpdate();
		return rows;
	}
	@Override
	public ResultSet show(Bus_Reservation B) throws ClassNotFoundException, SQLException 
	{
		Connection con=ConnectionFactory.getConnection();
	PreparedStatement pst=con.prepareStatement("SELECT Reservation_id FROM Bus_Reservation;");
	ResultSet rs=pst.executeQuery();
	return rs;
	}
	

}
