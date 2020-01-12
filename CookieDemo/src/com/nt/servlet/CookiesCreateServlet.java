package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookiesCreateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//read data from input
		String uid=req.getParameter("uid");
		String uname=req.getParameter("uname");
		//create Cookies
		Cookie c1=new Cookie("uid", uid);
		Cookie c2=new Cookie("uname", uname);
		
		//set max life time in sec
		c2.setMaxAge(600);
		//add to response
		resp.addCookie(c1);
		resp.addCookie(c2);
		//print done message
		PrintWriter out=resp.getWriter();
	     out.print("cookies created");	
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	

}
