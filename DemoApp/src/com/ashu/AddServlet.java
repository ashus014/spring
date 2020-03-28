package com.ashu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter printWriter = res.getWriter();
		printWriter.print("Hi<br>");
		
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("phone");
		
		printWriter.println(str);
		
		
		
		
		
	}

}
