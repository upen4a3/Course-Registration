package allservlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.ucmo.cs.course.registration.db.RegistrationDB;
import edu.ucmo.cs.course.registration.model.LoginBean;



public class LoginServlet extends HttpServlet 
{
	
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		try{
			
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		String username = req.getParameter("uname");
		String password = req.getParameter("password");
		
		/*//Setting up the Cookies
		Cookie name = new Cookie("name",username);
		Cookie pwd  =new Cookie("pwd",password);
		name.setMaxAge(60);
		pwd.setMaxAge(60);
		resp.addCookie(name);
		resp.addCookie(pwd);*/
		
		//Checkin Validations..............
		
		boolean isunValid = StringUtils.checkValid(username);
		boolean ispwValid = StringUtils.checkValid(password);
		HttpSession session = req.getSession();
		session.setAttribute("userId",username);
		
		if(isunValid && ispwValid){
			RegistrationDB rdb = new RegistrationDB();
				LoginBean logInBean = rdb.fetchLoginInfo(username,req);
				if(logInBean.getPassWord() != null && logInBean.getPassWord().equalsIgnoreCase(password)){
					resp.sendRedirect("course.jsp");
					System.out.println("Authentication is successful ....");
				}
		}
		else
		{
			resp.sendRedirect("index.jsp");
		 }
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException ioe){
			 ioe.printStackTrace();
	  }
	}
    	 
		
	}


