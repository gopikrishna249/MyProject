package Pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class ServletExp extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
	{
		PrintWriter out=response.getWriter();
		out.println("Hello Servlet");
		String name=request.getParameter("uname");
		out.println(name);
	}

}