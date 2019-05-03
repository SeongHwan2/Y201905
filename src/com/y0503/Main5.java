package com.y0503;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main5")
public class Main5 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8;");
		response.setCharacterEncoding("UTF-8");
		
		구구단 gu = new 구구단();
		
		String result = "";
//		result = gu.lv1();
		result = gu.lv2();
//		for(int i = 1; i <= 9; i++) {
			//System.out.println(i + "단");
//			result = result + i + "단<br>";
//		for(int j = 1; j <= 9; j++) {
		//	System.out.println(i + " * " + j + " = " + i*j);
//			result = result + i + " * " + j + " = " + (i*j) + "<br>";
//		}
//		result = result + "<br>";
//	}	
		response.getWriter().print(result);
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
