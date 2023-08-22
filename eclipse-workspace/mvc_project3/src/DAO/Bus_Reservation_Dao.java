package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.Bus_Reservation;
public interface Bus_Reservation_Dao 
{
	public int insert(Bus_Reservation B) throws ClassNotFoundException, SQLException;
	public int update(Bus_Reservation B) throws ClassNotFoundException, SQLException;
	public ResultSet view(Bus_Reservation B) throws SQLException, ClassNotFoundException;
	public int delete(Bus_Reservation B) throws ClassNotFoundException, SQLException;
	public ResultSet show(Bus_Reservation B) throws ClassNotFoundException, SQLException;

}
