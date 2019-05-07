package com.y0503;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExSsam")
public class ExSsam extends HttpServlet {
	List<사용자> users = new ArrayList();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자 입력
		response.setContentType("text/html; charset=UTF-8;");
		response.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		int tall = Integer.parseInt(request.getParameter("tall"));
		int weight = Integer.parseInt(request.getParameter("weight"));
		users.add(new 사용자(name, age, tall, weight));
		response.getWriter().print("성공 : " + users.size());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자 검색
		response.setContentType("text/html; charset=UTF-8;");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		response.getWriter().print("성공 : " + users.size());
		
		//파라미터 확인
//		Enumeration<String> params = request.getParameterNames();
//		while(params.hasMoreElements()) {
//			System.out.println(params.nextElement());
//		}
		
		String name = request.getParameter("name");
		boolean check = true;
		for(int i = 0; i < users.size(); i++) {
			if(users.get(i).get이름().equals(name)) {
				response.getWriter().print("이름 : " + users.get(i).get이름());
				response.getWriter().print("나이 : " + users.get(i).get나이());
				response.getWriter().print("키 : " + users.get(i).get키());
				response.getWriter().print("몸무게 : " + users.get(i).get몸무게());
				check = false;
			}
		}
		if(check) {
			response.getWriter().print("검색한 이름: " + name + "은 사용자 목록에 없습니다.");
		}
	}

}
