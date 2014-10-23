<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="../js/jquery-1.7.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title>Insert title here</title>
</head>
<body>
	<form action="../user/addUser" method="POST">
	<h>spring mvc annotation</h>
	<br />
	<div>
		${result }
	</div>
	<input type="submit" value="post请求">
	</form>
</body>
</html>