<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
 <c:if test="${empty ds}">
    <p class="alert alert-warning">Không có bản ghi</p>
</c:if>
 <c:if test="${!empty ds}">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">Họ tên</th>
                    <th scope="col">Địa chỉ</th>
                    <th scope="col">SDT</th>
                    <th scope="col">Email</th>
                    <th scope="col">Giới tính</th>
                    <th scope="col">Loại KH</th>
                </tr>
            </thead>
            <tbody>
               <c:forEach var="obj" items="${ds}" >
                <tr>
                    <td>${obj.hoten}</td>
                    <td>${obj.diachi}</td>
                    <td>${obj.sdt}</td>
                    <td>${obj.email}</td>
                    <c:choose>
                        <c:when test="${obj.gioitinh == 0}">
                            <td>Nam</td>
                        </c:when>
                        <c:otherwise>
                            <td>Nữ</td>
                        </c:otherwise>
                    </c:choose>
                    <td>${obj.loaiKH}</td>
                </tr>
                
               </c:forEach>
            </tbody>
        </table>
    
</c:if>