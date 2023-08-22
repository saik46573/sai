package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.StudentDto;

public interface Student 
{
	public int insert(StudentDto s) throws ClassNotFoundException, SQLException;
	public int update(StudentDto s) throws ClassNotFoundException, SQLException;
	public ResultSet view(StudentDto s	) throws SQLException, ClassNotFoundException;
	public int delete(StudentDto s) throws SQLException, ClassNotFoundException;
	

}
