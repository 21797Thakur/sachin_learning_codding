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
import javax.servlet.http.HttpSession;

import com.medplus.insurance.bean.PolicyQuestion;
import com.medplus.insurance.service.PolicyDetailService;
import com.medplus.insurance.service.PolicyDetailServiceImpl;
import com.medplus.insurance.service.PolicyQuestionService;
import com.medplus.insurance.service.PolicyQuestionServiceImpl;
import com.medplus.insurance.service.PolicyService;
import com.medplus.insurance.service.PolicyServiceImpl;
/**
 * Servlet implementation class PolicyCreation
 */
@WebServlet("/PolicyCreation")
public class PolicyCreation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher rd;
	/**
	 *
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			PolicyQuestionService service = new PolicyQuestionServiceImpl(); 
			int accountnumber= Integer.parseInt(request.getParameter("userid"));
			HttpSession session =request.getSession();
			session.setAttribute("accountnumber", accountnumber);
			List<PolicyQuestion> questionlist =service.getQuestionlist(accountnumber);
			List<String> quesList =new ArrayList<String>();
			for(PolicyQuestion pol :questionlist)
			{
				quesList.add(pol.getQuesDesc());
			}
			session.setAttribute("questionlist", questionlist);
			session.setAttribute("quesList", quesList);
			rd = request.getRequestDispatcher("PolicyCreation.jsp");
			rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PolicyService service = new PolicyServiceImpl();
		String role = (String) request.getSession().getAttribute("role");
		int accountnumber=(int) request.getSession().getAttribute("accountnumber");
		@SuppressWarnings("unchecked")
		List<PolicyQuestion> questionlist = (List<PolicyQuestion>) request.getSession().getAttribute("questionlist");
		List<Integer> ansWeightagelist= new ArrayList<Integer>();
		double premium= 0;
		for(PolicyQuestion question : questionlist)
		{
//			String quest = question.getQuesDesc();
			int answeightage =Integer.parseInt(request.getParameter(question.getQuesDesc()));
			premium = premium+answeightage;
			ansWeightagelist.add(answeightage);
		}
		premium=premium*3;	
		int row =0;
		@SuppressWarnings("unchecked")
		List<String> quesList =(List<String>) request.getSession().getAttribute("quesList");
		row =service.createPolicy(premium, accountnumber);
		if(row!=0)
		{
			ansWeightagelist.forEach(s->System.out.println("test answeightage : "+ s));
			quesList.forEach(s->System.out.println("questions : "+ s));
			PolicyDetailService polservice = new PolicyDetailServiceImpl();
			int row1 =polservice.addPolicyDetail(ansWeightagelist, accountnumber,quesList);
			if(row1!=0 && role.equals("insured"))
			{
			rd=request.getRequestDispatcher("home.jsp");	
			rd.forward(request, response);
			}
			else {
				rd=request.getRequestDispatcher("PolicyGeneration");	
				rd.forward(request, response);
			}
		}
	}

}
