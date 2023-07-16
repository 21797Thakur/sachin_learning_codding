package sampleProject.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validate
 */
@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String pass = request.getParameter("pwd");
		RequestDispatcher admin = request.getRequestDispatcher("/Admin");
		RequestDispatcher user = request.getRequestDispatcher("/User");
		if (username.equals("admin") && pass.equals("admin"))
		{
			admin.forward(request, response);
		//	response.sendRedirect("Admin");
		}
		else 
		{
//			out.print("<font color=red> username is empty try again");

			out.print("<h1> hidden "+request.getParameter("type")+"</h1>");
	        user.forward(request, response);
			out.println("<font color=red> Invalid user.. Re-login!!! </font>");
			RequestDispatcher rd = request.getRequestDispatcher("home.html");
			rd.include(request, response);
		}
		out.println("successfull");
	}

}
