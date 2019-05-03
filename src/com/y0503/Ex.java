package com.y0503;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex")
public class Ex extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8;");
		response.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		int tall = Integer.parseInt(request.getParameter("tall"));
		int weight = Integer.parseInt(request.getParameter("weight"));
		
		List<사용자> users = new ArrayList();
		users.add(new 사용자(name, age, tall, weight));
		
		
		
		String html = "";
		html = html + "<br>전송합니다!!<br>";
		html = html + "<br><a href = 'http://localhost:8080/Y201905/'>처음으로</a>";
		response.getWriter().print(html);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
