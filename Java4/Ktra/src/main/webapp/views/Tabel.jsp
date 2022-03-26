<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


        <table class="table">
            <thead>
                <tr>
                     <th scope="col">Mã SV</th>
                    <th scope="col">Họ Tên</th>
                    <th scope="col">Giới Tính</th>
                    <th scope="col">Chuyên Ngành</th>
                    <th scope="col">Số điện Thoại</th>
                    <th scope="col">Ngày Tạo</th>
                </tr>
            </thead>
            <tbody>
               <c:forEach var="obj" items="${ds}" >
                <tr>
                    <td>${obj.maSV}</td>
                    <td>${obj.hoTen}</td>
                    <c:choose>
                        <c:when test="${obj.gioiTinh == 0}">
                            <td>Nam</td>
                        </c:when>
                        <c:otherwise>
                            <td>Nữ</td>
                        </c:otherwise>
                    </c:choose>
                    
                    <td>${obj.chuyenNganh}</td>
                    <td>${obj.sdt}</td>
                    <td>${obj.thoiGian}</td>
                </tr>
               </c:forEach>
            </tbody>
        </table>
    
