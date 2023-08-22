package Service;

import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.Student;
import DAO.StudentDaoFactory;
import DTO.StudentDto;

public class StudentServiceImpl implements StudentService
{
@Override
	public int insertstudent(StudentDto s) throws ClassNotFoundException, SQLException 
	{
		Student student=StudentDaoFactory.getStudentconnection();
		int rows=student.insert(s);
		return rows;
	}

@Override
	public int updatestudent(StudentDto s) throws ClassNotFoundException, SQLException 
	{
	Student student=StudentDaoFactory.getStudentconnection();
	int rows=student.update(s);
		return rows;
	}

@Override
	public ResultSet viewstudent(StudentDto s) throws SQLException, ClassNotFoundException 
	{
	Student student=StudentDaoFactory.getStudentconnection();
	ResultSet rs=student.view(s);
	
		return rs;
	}

@Override
	public int deletestudent(StudentDto s) throws SQLException, ClassNotFoundException 
	{
	Student student=StudentDaoFactory.getStudentconnection();
	 int rows=student.delete(s);
		return rows;
	}
	
}



