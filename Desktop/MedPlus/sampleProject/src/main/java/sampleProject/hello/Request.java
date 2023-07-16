package sampleProject.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Request
 */
@WebServlet("/Request")
public class Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	    int code= Integer.parseInt(request.getParameter("code"));
	    String name = request.getParameter("name");
	    String password = request.getParameter("password");
	    String TechSkill[] = request.getParameterValues("skill");
	    String marital = request.getParameter("marital");
	    String dob = request.getParameter("DOB");
	    out.print("<body bgcolor= Lightskyblue ");
	    out.println("Code : " + code+"<br>");
	    out.println("Name : " + name +"<br>" );
	    out.println("Password : " + password +"<br>");
	    
	    for(String sk: TechSkill)
	    {
	    	out.println("Technical Skill : " +sk +"<br>");
	    }
	    out.println("Marital Status : " + marital +"<br>");
	    out.println("DOB : " + dob +"<br>");
	    out.print("</body>");
	}
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doGet(req, resp);
			PrintWriter out = resp.getWriter();
			out.println("dopost method ");
		}

}
