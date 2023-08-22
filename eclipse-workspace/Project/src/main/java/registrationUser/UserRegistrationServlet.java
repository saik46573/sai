package registrationUser;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/userRegister")
public class UserRegistrationServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String Fullname=request.getParameter("fullname");
		String mobile=request.getParameter("mobile");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		try 
		{
			int rows=UserRegisterDao.userRegister(Fullname,mobile,username,password);
			if(rows>0)
			{
				out.println("INSERTED SUCCESSFUL");
			}
			else
			{
				out.println("failed to register");
			}
		}
		catch (ClassNotFoundException | SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}