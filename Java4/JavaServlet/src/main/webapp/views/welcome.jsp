<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form
		method="GET"
		action="/JavaServlet/HelloWorld">
		<label>Họ tên:</label>
		<input type="text" name="ho_ten">
		<button>Gửi</button>
	</form>
	<h3>${name}</h3>
	<a></a>
</body>
</html>