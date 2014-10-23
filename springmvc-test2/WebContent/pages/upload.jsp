<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h>choose the file to upload</h><br/>
<form name="upload" action="/springmvc-test2/file/upload2" method="post" enctype="multipart/form-data">
	choose file:<input type="file" name="file">
	<input type="file" name="file2">
	<input type="submit" value="upload">
</form>
</body>
</html>