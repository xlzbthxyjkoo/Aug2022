<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인</h1>
<%
	String msg = (String)session.getAttribute("msg");
	session.removeAttribute("msg");
if(msg != null){
%>
<%=msg %>
<%} %>
<form action="login.jsp">
	아이디 : <input type="text" name="id"><br>
	비밀번호 : <input type="password" name="password"><br>
	<input type="submit" value="로그인">
	<input type="reset" value="취소">
</form>
</body>
</html>