<%@page import="com.y0508.Main11" %>
<%@page import="com.y0508.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	//추가용Q
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	// 검색용Q
	String name1 = request.getParameter("name1");
	
	//수정용 	Q
	String name2 = request.getParameter("name2");
	String gender1 = request.getParameter("gender1");
	String id1 = request.getParameter("id1");
	String pw1 = request.getParameter("pw1");
	
	//제거용 Q
	String name3 = request.getParameter("name3");
	String gender2 = request.getParameter("gender2");
	String id2 = request.getParameter("id2");
	String pw2 = request.getParameter("pw2");
	
	String html = "";
	boolean check = true;
	Main11 ma = new Main11();
	if(name != null){
		ma.studentAdd(new Student(name, gender, id, pw));
		
		html += "저장이 완료되었습니다";
		
	}
	
	if(name1 != null){
		Student stu = ma.studentSer(name1);
		if(stu != null){
		String msg = stu.toString();
		html += msg;
		}else{
			html += "입력하신 " + name1 + "은 목록에 없습니다.";
		}
	}
	
	if(name2 != null){
		check = ma.studentCh(new Student(name2, gender1, id1, pw1));
		html += "변경 성공입니다.";
	}
	
	if(name3 != null) {
		check = ma.studentRemo(new Student(name3, gender2, id2, pw2));
		html = "삭제 되었습니다!";
	}
	
	response.getWriter().print(html);
%>