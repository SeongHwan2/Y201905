package com.y0502;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main4")
public class Main4 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");
		
		response.setContentType("text/html; charset=UTF-8"); 
		response.setCharacterEncoding("UTF-8");
		
		int d = Integer.parseInt(a);
		int f = Integer.parseInt(b);
		int e = 0;
		계산기 calc = new 계산기();
		
		switch(c) {
		case "+":
			e = calc.덧셈(d, f);
			break;
		case "-":
			e = calc.뺄셈(d, f);
			break;
		case "/":
			e = (int)calc.나눗셈(d, f);
			break;
		case "*":
			e = (int)calc.곱셈(d, f);
			break;
		default:
			response.getWriter().print("+, -, *, / 만 입력하세요");
			break;
		}
		
		response.getWriter().print(e);
		
		String Home = "";
		Home = "<br><a href = 'http://localhost:8080/Y201905/'>Home</a>";
		response.getWriter().print(Home);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
