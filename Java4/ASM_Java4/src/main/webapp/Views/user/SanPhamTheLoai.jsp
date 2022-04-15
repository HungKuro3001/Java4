<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<div class="wrap">
			<div class="section group">
				<div class="cont span_2_of_3">
					<h2 class="head">Products</h2>
					<div class="top-box">
						<c:forEach var="item" items="${products}">
							<div class="col_1_of_3 span_1_of_3">
							<a href="/ASM_Java4/users/productDetail?id=${item.id }">
								<div class="inner_content clearfix">
									<div class="product_image">
										<img src="/ASM_Java4/image/${item.img}" alt=""/>
									</div>
									<div class="price">
										<div class="cart-left">
											<p class="title">${item.ten}</p>
											<div class="price1">
												<span class="actual"><fmt:formatNumber value="${item.donGia }" pattern="###,###"></fmt:formatNumber> VNĐ</span>
											</div>
										</div>
										<div class="cart-right"> </div>
										<div class="clear"></div>
									</div>
								</div>
							</a>
							</div>
						
						</c:forEach>
					</div>
				</div>
				<div class="rsidebar span_1_of_left">
					<div class="top-border"> </div>
					<div class="border">
						<link href="${pageContext.request.contextPath}/Views/css/default.css" rel="stylesheet" type="text/css" media="all" />
						<link href="${pageContext.request.contextPath}/Views/css/nivo-slider.css" rel="stylesheet" type="text/css" media="all" />
						<script src="${pageContext.request.contextPath}/Views/js/jquery.nivo.slider.js"></script>
						<script type="text/javascript">
							$(window).load(function () {
								$('#slider').nivoSlider();
							});
						</script>
						<div class="slider-wrapper theme-default">
							<div id="slider" class="nivoSlider">
								<img src="${pageContext.request.contextPath}/Views/images/t-img1.jpg" alt="" />
								<img src="${pageContext.request.contextPath}/Views/images/t-img2.jpg" alt="" />
								<img src="${pageContext.request.contextPath}/Views/images/t-img3.jpg" alt="" />
							</div>
						</div>
						<div class="btn"><a href="single.html">Check it Out</a></div>
					</div>
					<div class="top-border"> </div>
					<div class="sidebar-bottom">
						<h2 class="m_1">Newsletters<br> Signup</h2>
						<p class="m_text">Lorem ipsum dolor sit amet, consectetuer</p>
						<div class="subscribe">
							<form>
								<input name="userName" type="text" class="textbox">
								<input type="submit" value="Subscribe">
							</form>
						</div>
					</div>
				</div>
				<div class="clear"></div>
			</div>
		</div>
    