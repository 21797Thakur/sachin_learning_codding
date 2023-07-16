package com.medplus.insurance.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.medplus.insurance.bean.UserRole;
import com.medplus.insurance.service.AccountService;
import com.medplus.insurance.service.AccountServiceImpl;
import com.medplus.insurance.service.UserRoleService;
import com.medplus.insurance.service.UserRoleServiceImpl;

/**
 * Servlet implementation class LoginValidate
 */
@WebServlet("/LoginValidate")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserRoleService service = new UserRoleServiceImpl(); 
		AccountService accountservice = new AccountServiceImpl();
		HttpSession session = request.getSession(true);
		UserRole ckuser = new UserRole(request.getParameter("username"),request.getParameter("password"));
		String role=service.checkUser(ckuser);
		String username= request.getParameter("username");
		int row = accountservice.checkAccount(username);
		if(row!=0)
		{
			session.setAttribute("account", "created");
		}
		else
		{
			session.setAttribute("account", "notcreated");
		}
		if(role!=null)
		{
		session.setAttribute("username",username);
		session.setAttribute("role", role);
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}

}
