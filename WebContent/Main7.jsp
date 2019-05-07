<%@ page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% //자바영역 표시
   //자바 영역  >> jsp는 get방식만 가능!?(doget,dopost따로 선언 불가) >> 호출 --> 출력
	PrintWriter pw = response.getWriter();
	pw.println(request.getPathInfo());
	pw.println(request.getProtocol());
	pw.println(request.getContextPath());
	pw.println(request.getLocalPort());
	pw.println(request.getServerPort());
	pw.println(request.getServletPath());
	pw.println(request.getContentType());
%>
</body>
</html>