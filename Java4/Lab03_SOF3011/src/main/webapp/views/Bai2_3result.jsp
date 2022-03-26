<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
	<li>Tên đăng nhập: ${bean.tenDN} </li> <br>
	<li>Mật khẩu:${bean.pass}</li><br>
	<li>Giới tính:${bean.gioiTinh}</li><br>
	<li>Quốc tịch:${bean.quocTich}</li><br>
	<li>Đã kết hôn:${bean.daKH}</li><br>
	<li>Sở thích:${bean.hobbies}</li><br>
	<li>Ghi chú:${bean.ghiChu}</li>
	</ul>
</body>
</html>