<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Member list</h1>

<table>
	<tr>
		<th>아이디</th>
		<th>비밀번호</th>
		<th>이름</th>
		<th>이메일</th>
		<th>가입일</th>
	</tr>
	<c:forEach var = "member" items="${members }">
	<tr>
		<td>${member.id }</td>
		<td>${member.password}</td>
		<td>${member.name}</td>
		<td>${member.email}</td>
		<td>${member.joinDate}</td>
		
	</tr>
	</c:forEach>	
</table>

<img src="../img/member.jpg">
</body>
</html>