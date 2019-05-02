package com.y0502;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main2")
public class Main2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//url : http://localhost:8080/Y201905/Main2?a=1&b=2
		//                                         (쿼리스트링,파라미터)
		String a = request.getParameter("a"); //a변수 : a = 1; b변수 : b = 2;
		String b = request.getParameter("b");
		
		String c = a + b;
		System.out.println(c);
		int d =Integer.parseInt(a) +Integer.parseInt(b); // 12 > 3 Integer.parseInt(); = int로 형변환함수.
		System.out.println(d);
		
		response.getWriter().print(c + ", " + d);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
