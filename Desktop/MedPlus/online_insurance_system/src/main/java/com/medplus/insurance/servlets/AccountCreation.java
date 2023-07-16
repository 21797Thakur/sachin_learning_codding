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
import com.medplus.insurance.service.BusinessSegmentService;
import com.medplus.insurance.service.BusinessSegmentServiceImpl;

/**
 * Servlet implementation class AccountCreation
 */
@WebServlet("/AccountCreation")
public class AccountCreation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher rd ;
	AccountService service = new AccountServiceImpl();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BusinessSegmentService busService = new BusinessSegmentServiceImpl();
		List<String> listBusSeg = busService.listBusSeg();
		request.setAttribute("listBusSeg", listBusSeg);
		rd= request.getRequestDispatcher("AccountCreation.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		 int accountnumber = Integer.parseInt(request.getParameter());
		 String insuredname= request.getParameter("insuredname");
		 String insuredstreet= request.getParameter("insuredstreet");
		 String insuredcity= request.getParameter("insuredcity")	;
		 String insuredstate= request.getParameter("insuredstate")	;
		 int insuredzip= Integer.parseInt(request.getParameter("insuredzip"));
		 String businesssegment= request.getParameter("businesssegment");
		 String username= (String) request.getSession().getAttribute("username");
		 Accounts account =new Accounts(insuredname, insuredstreet, insuredcity, insuredstate, insuredzip, businesssegment, username);
		 int row = service.addAccount(account);
		 if(row>0)
		 {
			rd=request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);	
		 }
	}

}
