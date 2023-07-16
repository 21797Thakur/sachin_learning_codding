package com.medplus.insurance.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medplus.insurance.bean.Policy;
import com.medplus.insurance.service.PolicyService;
import com.medplus.insurance.service.PolicyServiceImpl;

/**
 * Servlet implementation class ViewPolicy
 */
@WebServlet("/ViewPolicy")
public class ViewPolicy extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PolicyService service = new PolicyServiceImpl();
		String role = (String) request.getSession().getAttribute("role");
		String username = (String) request.getSession().getAttribute("username");
		System.out.println(role);
		System.out.println(username);
		List<Policy> policyList = new ArrayList<Policy>();
		if (role.equals("admin")) {
			policyList = service.getAllPolicy();
		} else {
			policyList = service.getAllPolicy(username);
		}
		request.getSession().setAttribute("policyList", policyList);
		RequestDispatcher rd = request.getRequestDispatcher("ViewPolicy.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
