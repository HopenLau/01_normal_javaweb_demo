package com.mytest.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class getscript extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(
				"com.test.servlet.getscript() {\r\n" + 
				"	[" + new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS").format(new java.util.Date()) + "]"
				);//[Tom_mark]

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.println("{status:0, message:[{id:1,name:\"Canton\",ctime:newDate()},{id:2,name:\"Tokyo\",ctime:newDate()}]}");
		out.println("{status:0}");
		out.flush();
		out.close();
		
		System.out.println("}\r\n");//[Tom_mark]
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}