package com.hsbc.servelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.aritmaticutil.Evaluator;
import com.hsbc.exceptions.InvalidOperationException;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalculatorServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		double num1 = Double.parseDouble(request.getParameter("num1"));
		double num2 = Double.parseDouble(request.getParameter("num2"));
		PrintWriter out = response.getWriter();
		
		int option = Integer.parseInt(request.getParameter("expression"));

		try {
			double res = Evaluator.resEval(option, num1, num2);
			out.println(res);
			RequestDispatcher rd = request.getRequestDispatcher("calculator.jsp");
			request.setAttribute("result", res);
			rd.forward(request, response);
		} catch (InvalidOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
