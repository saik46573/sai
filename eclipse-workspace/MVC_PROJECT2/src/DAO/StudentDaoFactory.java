package DAO;

public class StudentDaoFactory 
{
 static StudentImpl Student=new StudentImpl();
 	public static StudentImpl getStudentconnection()
 	{
	 return Student;
 	}
}
