package Service;

import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.StudentDto;

public interface StudentService 
{
	public int insertstudent(StudentDto s) throws ClassNotFoundException, SQLException;
	public int updatestudent(StudentDto s) throws ClassNotFoundException, SQLException;
	public ResultSet viewstudent(StudentDto s) throws SQLException, ClassNotFoundException;
	public int deletestudent(StudentDto s) throws SQLException, ClassNotFoundException;

}
