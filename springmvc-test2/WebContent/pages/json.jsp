<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="/springmvc-test2/js/jquery-1.11.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(document).ready(function(){
		$("#add").click(function(){
			alert("success!");
		    var username = $("#username").attr("value");
			var password = $("#password").attr("value");
			
			var user = {username:username,password:password};
			
			$.ajax({
				url:"/springmvc-test2/user2/addUserJson",
				type:"post",
				data:user,
				success:function(a){
					alert("username--->"+a.username+"password---->"+a.password);
				}
			}); 
		});
	});
</script>
</head>
<body>
	<h>json add user</h>
	username:<input type="text" id="username" name="username">
	password:<input type="text" id="password" name="password">
	<input type="button" id="add" value="添加">
</body>
</html>