package com.shakil;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public  void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		int k = (int) req.getAttribute("k") ; 
		k = k * k ; 
	
		res.getWriter().println("Hello i am dispatcher working!!") ; 
		res.getWriter().println("The value of k is: " + k);
	}
}
