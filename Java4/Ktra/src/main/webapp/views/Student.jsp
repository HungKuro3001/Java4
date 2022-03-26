<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>
    <div class="container">
        <form action="/Ktra/StuController"
    	method="post">
        <label for="">Mã sinh viên</label>
        <input type="text" name="maSV"> <br>
        <label for="">Họ và tên</label>
        <input type="text" name="hoTen"> <br>
        <label for="" >Giới tính</label>
        <input type="radio" name="gioiTinh" value="0"> Nam
        <input type="radio" name="gioiTinh" value="1"> Nữ <br>
        <label for="">Chuyên ngành</label>
        <input type="text" name="chuyenNganh"><br>
        <label for="">Số điện thoại</label>
        <input type="text" name="sdt"><br>
        <label for="">Ngày tạo</label>
        <input type="date" name="thoiGian"><br>
        <button>Đăng kí</button>
    </form>
        <div>
        <jsp:include page="${view}"></jsp:include>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
</body>
</html>