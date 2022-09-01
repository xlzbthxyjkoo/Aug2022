<%@page import="kr.ac.sku.service.MemberService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	MemberService service = new MemberService();
	int resultValue = service.checkMember(id, password);
	
	if(resultValue == 1){
		//아이디가 없는 사용자. 
		response.sendRedirect("memberJoinForm.jsp");
	}else if(resultValue == 2){
		//비밀번호가 틀린 사용자. 
		response.sendRedirect("loginForm.jsp");
	}else{
		//아이디도 있고, 비번도 맞는 사용자!!
		//상태유지해주면 된다!!! 
		/*쿠키를 이용한 상태정보유지!!
		Cookie cookie = new Cookie("login",id);
		cookie.setPath("/");
		cookie.setMaxAge(-1);
		
		response.addCookie(cookie);
		*/
		
		//세션을 이용하는 코드로 변경
		
		session.setAttribute("login",id);
		
		response.sendRedirect("memberList");
	}
	
%>