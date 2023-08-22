package SERVICE;

import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.Bus_Reservation;

public interface Bus_Reaservation_Service 
{
	public int insertService(Bus_Reservation B) throws ClassNotFoundException, SQLException;
	public int updateService(Bus_Reservation B) throws ClassNotFoundException, SQLException;
	public ResultSet viewService(Bus_Reservation B) throws SQLException, ClassNotFoundException;
	public int deleteService(Bus_Reservation B) throws ClassNotFoundException, SQLException;
	public ResultSet showService(Bus_Reservation B) throws ClassNotFoundException, SQLException;
	
}
