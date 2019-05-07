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

	List<사용자> users = new ArrayList<사용자>();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8;");
		response.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
//		int age = Integer.parseInt(request.getParameter("age"));
//		int tall = Integer.parseInt(request.getParameter("tall"));
//		int weight = Integer.parseInt(request.getParameter("weight"));
		String age_=request.getParameter("age");
		String tall_=request.getParameter("tall");
		String weight_=request.getParameter("weight");
		
		
		
		String name1 = request.getParameter("name1");
		
		boolean check = true;
		if(name != null && name1==null) {
			// 사용자 입력
			int age = Integer.parseInt(age_);
			int tall = Integer.parseInt(tall_);
			int weight = Integer.parseInt(weight_);

			users.add(new 사용자(name, age, tall, weight));
			response.getWriter().print("성공 : " + users.size());
			String html = "";
			html = html + "<br>전송합니다!!<br>";
			html = html + "<br><a href = 'http://localhost:8080/Y201905/'>처음으로</a>";
			response.getWriter().print(html);
		}else if(name1 != null) {
//			response.getWriter().print("dd");
			//사용자 검색
			for(int i = 0; i < users.size(); i++) {
				if(users.get(i).get이름().equals(name1)) {
					response.getWriter().print(users.get(i).get이름());
					response.getWriter().print(users.get(i).get나이());
					response.getWriter().print(users.get(i).get키());
					response.getWriter().print(users.get(i).get몸무게());
					check = false;
					String html = "";
					html = html + "<br><a href = 'http://localhost:8080/Y201905/'>처음으로</a>";
				}			
			}
			if(check) {
				response.getWriter().print("입력한 " + name1 + "은 존재하지 않는 이름입니다.");
			}
		}
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
