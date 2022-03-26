<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Đăng kí</h1>
<form method = "post"
	action = "/Lab02_SOF3011/Bai2_3">
	<label>Tên đăng nhập</label>
	<input type="text" name="tenDN"> <br>
	<label>Mật khẩu</label>
	<input type="password" name="pass"> <br>
	<label>Giới tính</label>
	<input type="radio" name="gioiTinh" value="1">Nam
	<input type="radio" name="gioiTinh" value="0">Nữ <br>
	<input type="checkbox" name="daKH">Đã kết hôn? <br>
	<label>Quốc tịch</label>
	<select name="quocTich" >
		<option value="VN">VN</option>
		<option value="US">US</option>
	</select>
	<label>Sở thích</label>
	<input name="hobbies" type="checkbox" value="R">Đọc sách
	<input name="hobbies" type="checkbox" value="T">Du lịch
	<input name="hobbies" type="checkbox" value="M">Âm nhạc
	<input name="hobbies" type="checkbox" value="O">Khác<br>
	<label>Ghi chú</label>
	<input type="text-area" name="ghiChu"><br>
	<button>Đăng kí</button>
</form>
</body>
</html>