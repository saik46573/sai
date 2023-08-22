package Service;

public class ServiceConnectionFactory
{
	 static StudentServiceImpl student=new  StudentServiceImpl();
	 public static StudentServiceImpl getService() 
			{
		 		return student;
			}

}
