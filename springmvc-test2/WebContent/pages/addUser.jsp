<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="../js/jquery-1.7.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	function addUser()
	{
		var form = document.forms[0];
		form.action = "../user2/addUser";
		form.method = "post";
		form.submit();
	}
</script>

</head>
<body>
	<h>add user</h>
	<form name="adduser" action="">
		username:<input type="text" name="username">
		password:<input type="text" name="password">
		
		<input type="button" value="添加" onclick="addUser()">
	</form>
</body>
</html>