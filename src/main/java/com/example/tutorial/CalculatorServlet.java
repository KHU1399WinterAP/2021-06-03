package com.example.tutorial;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int firstNumber = Integer.parseInt(request.getParameter("first-number"));
		int secondNumber = Integer.parseInt(request.getParameter("second-number"));
		
		request.setAttribute("result", firstNumber + secondNumber);
		
		var dispatcher = request.getRequestDispatcher("calculator.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
}
