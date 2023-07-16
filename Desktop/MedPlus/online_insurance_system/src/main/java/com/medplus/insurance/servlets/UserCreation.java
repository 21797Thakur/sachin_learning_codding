package com.medplus.insurance.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medplus.insurance.bean.UserRole;
import com.medplus.insurance.service.UserRoleService;
import com.medplus.insurance.service.UserRoleServiceImpl;

/**
 * Servlet implementation class UserCreation
 */
@WebServlet("/UserCreation")
public class UserCreation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher rd;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		rd=request.getRequestDispatcher("UserCreation.jsp");
		rd.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserRoleService service = new UserRoleServiceImpl();
		UserRole user = new UserRole(request.getParameter("username"),request.getParameter("password"),request.getParameter("role"));
		int row=0;
		row=service.createAccount(user);
		if(row>0)
		{
			System.out.println(request.getAttribute("role"));
		 rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}
	}

}
