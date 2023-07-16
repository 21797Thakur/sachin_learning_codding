package com.medplus.insurance.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medplus.insurance.bean.Accounts;
import com.medplus.insurance.service.AccountService;
import com.medplus.insurance.service.AccountServiceImpl;

/**
 * Servlet implementation class PolicyGeneration
 */
@WebServlet("/PolicyGeneration")
public class PolicyGeneration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AccountService service = new AccountServiceImpl();	
		String role =(String) request.getSession().getAttribute("role");
		String username= (String) request.getSession().getAttribute("username");
		if(role.equals("admin"))
		{
	    List<Accounts> accountlist =service.getAccountNumber();
		request.setAttribute("accountlist", accountlist);
		}
		else if(role.equals("agent"))
		{
			List<Accounts> accontlist=service.getAccountNumberList(username);
			request.setAttribute("accountlist", accontlist);
		}		
		RequestDispatcher rd = request.getRequestDispatcher("PolicyGeneration.jsp");
		rd.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
