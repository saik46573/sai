package SERVICE;

import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.Bus_Reservation_Dao;
import DAO.connection_Bus_Reservation;
import DTO.Bus_Reservation;

public class Service_Bus_Reservation_Impl implements Bus_Reaservation_Service
{
	Bus_Reservation_Dao BRD=connection_Bus_Reservation.getConnection();
	@Override
	public int insertService(Bus_Reservation B) throws ClassNotFoundException, SQLException
	{
		
		int rows=BRD.insert(B);
		return rows;
	}

	@Override
	public int updateService(Bus_Reservation B) throws ClassNotFoundException, SQLException 
	{
		int rows=BRD.update(B);
		return rows;
	}

	@Override
	public ResultSet viewService(Bus_Reservation B) throws SQLException, ClassNotFoundException 
	{
		ResultSet rs=BRD.view(B);
		return rs;
	}

	@Override
	public int deleteService(Bus_Reservation B) throws ClassNotFoundException, SQLException 
	{
		int rows=BRD.delete(B);
		return rows;
		
	}

	@Override
	public ResultSet showService(Bus_Reservation B) throws ClassNotFoundException, SQLException 
	{
		ResultSet rs=BRD.show(B);
		return rs;		
	}

}