package com.example.tutorial;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
	private String message;
	
	public void init() {
		message = "Hello World!";
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		// Hello
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>" + message + "</h1>");
		out.println("</body></html>");
		
		out.println("<html><body>" + "<h1>" + message + "</h1>" + "</body></html>");
		
		out.println("<html>");
		out.println("    <body>");
		out.println("        <h1>" + message + "</h1>");
		out.println("    </body>");
		out.println("</html>");
	}
	
	public void destroy() {
	}
}
