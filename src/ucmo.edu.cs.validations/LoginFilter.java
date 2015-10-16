package validations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/login")
public class LoginFilter implements Filter 
{

   
	public void destroy() 
	{
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		
		PrintWriter out = response.getWriter();
		String username = request.getParameter("uname");
		String password  =request.getParameter("password");
		if(username.equals(""))
		{
			out.println("<h2>Username Should Not be Empty</h2>");
		}
		else if(password.equals(""))
		{
			out.println("<h2>Password Should Not be Blank</h2>");
		}
		
		else
			{
			chain.doFilter(request, response);
			}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException 
	{
		
	}

}
