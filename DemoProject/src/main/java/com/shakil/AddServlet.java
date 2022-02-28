package com.shakil;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
//	we have two option one is doPost and another is doGet;
  public void doGet( HttpServletRequest  req , HttpServletResponse res) throws IOException, ServletException {
	  int i = Integer.parseInt(req.getParameter("num1"));
	  int j = Integer.parseInt(req.getParameter("num2"));
	  int k = i + j ;
	  
//	  we can pass a value from this servlet to sq servlet using session concept(setAttribute);
	  
	  req.setAttribute("k", k); // session concept ; 
	  
//		request dispatch and redirect from AddServlet to this servlet;
	  RequestDispatcher rd = req.getRequestDispatcher("sq") ; 
	  rd.forward(req , res) ; 
//	  res.getWriter().println("the result is:" + k);
  }
}
