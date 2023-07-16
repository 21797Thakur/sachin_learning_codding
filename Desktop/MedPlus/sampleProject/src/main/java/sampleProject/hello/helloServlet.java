package sampleProject.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/helloServlet")
public class helloServlet extends HttpServlet {
	int count=0;
	private static final long serialVersionUID = 1L;
@Override
public void init() throws ServletException {
	System.out.println("Init method executed");
}
@Override
public void destroy() {
	System.out.println("Destroy method Executed");
}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Welcome to JEE");
		count++;
		out.print("<h2> welcome to JEE </h2>");
		out.print("<h1> Count"+count+"</h1>");
	}

}
