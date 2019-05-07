<%@page import="com.y0503.사용자"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! // jsp 전역변수 선언법
	List<사용자> users = new ArrayList<사용자>();
%>
<% 	
	//사용자 입력
	String name = request.getParameter("name");
	String age_=request.getParameter("age");
	String tall_=request.getParameter("tall");
	String weight_=request.getParameter("weight");
	String name1 = request.getParameter("name1");
	
	boolean check = true;
	
	if(name !=null && name1 == null){
		int age = Integer.parseInt(age_);
		int tall = Integer.parseInt(tall_);
		int weight = Integer.parseInt(weight_);
		users.add(new 사용자(name, age, tall, weight));
		String html = "";
		html = html + "<br>전송합니다!!<br>";
		html = html + "<br><a href = 'http://localhost:8080/Y201905/'>처음으로</a>";
		response.getWriter().print(html);
	}else if(name1 != null){
		//사용자 검색
		for(int i = 0; i < users.size(); i++){
			if(users.get(i).get이름().equals(name1)){
				response.getWriter().print("이름은 :" + users.get(i).get이름()+"<br>");
				response.getWriter().print("나이는 :" +users.get(i).get나이()+"<br>");
				response.getWriter().print("키는 :" +users.get(i).get키()+"<br>");
				response.getWriter().print("몸무게는 :" +users.get(i).get몸무게()+"<br>");
				check = false;
				break;
			}
		}
		if(check){
			response.getWriter().print("입력한 " + name1 + "은 존재하지 않는 이름입니다.");
		}
	}
	
	
	
%>
</body>
</html>