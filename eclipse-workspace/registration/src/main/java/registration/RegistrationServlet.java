package registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import DAO.Dao;
import DAO.Dao1;

public class RegistrationServlet implements Servlet
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int rows=0;
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String fullname=req.getParameter("fullname");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		Dao d=new Dao();
		Dao1 d1=new Dao1();
		try {
			 rows=d.DaoMethod(fullname,email,mobile,username,password);
			 System.out.println(rows);
			if(rows>0)
				out.println("INSERATION SUCCESFULL");
			else
				out.println("<login.html>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
