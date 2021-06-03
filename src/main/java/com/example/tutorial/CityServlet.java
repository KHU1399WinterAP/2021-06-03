package com.example.tutorial;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

@WebServlet(name = "CityServlet", value = "/city")
public class CityServlet extends HttpServlet {
	private HashMap<String, String> stateDetails;
	
	@Override
	public void init() throws ServletException {
		stateDetails = new HashMap<>();
		stateDetails.put("tehran", "Tehran");
		stateDetails.put("khorasan-razavi", "Mashhad");
		stateDetails.put("gilan", "Rasht");
		stateDetails.put("fars", "Shiraz");
		stateDetails.put("semnan", "Semnan");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String state = request.getParameter("state");
		
		request.setAttribute("city", stateDetails.get(state));
		request.setAttribute("date", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
		
		var dispatcher = request.getRequestDispatcher("city.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
}
