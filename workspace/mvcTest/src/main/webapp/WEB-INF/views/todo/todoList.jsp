<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/todo.css">
</head>
<body>
	<div class="todo-list-template">
		<div class="title">My To Do List</div>
		<section class="form-wrapper">
			<div class="form">
				<input type="text" id="myInput" placeholder="할일..." />
				<div class="add-button">추가</div>
			</div>
		</section>
		<section class="todos-wrapper">
			<ul id="todo-item-list">
				
			</ul>
		</section>
		<script src="js/todo.js"></script>
	</div>
</body>
</html>