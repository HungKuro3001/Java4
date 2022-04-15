<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<html>
<head>
<title>LeoShop</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="${pageContext.request.contextPath}/Views/css/style.css"
	rel="stylesheet" type="text/css" media="all" />
<link href="${pageContext.request.contextPath}/Views/css/form.css"
	rel="stylesheet" type="text/css" media="all" />
<link href='http://fonts.googleapis.com/css?family=Exo+2'
	rel='stylesheet' type='text/css'>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
	crossorigin="anonymous"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/Views/js/jquery1.min.js"></script>

<!-- start menu -->
<link href="${pageContext.request.contextPath}/Views/css/megamenu.css"
	rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/Views/js/megamenu.js"></script>
<script>
	$(document).ready(function() {
		$(".megamenu").megamenu();
	});
</script>
<!--start slider -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Views/css/fwslider.css"
	media="all">
<script
	src="${pageContext.request.contextPath}/Views/js/jquery-ui.min.js"></script>
<script
	src="${pageContext.request.contextPath}/Views/js/css3-mediaqueries.js"></script>
<script src="${pageContext.request.contextPath}/Views/js/fwslider.js"></script>
<!--end slider -->
<script
	src="${pageContext.request.contextPath}/Views/js/jquery.easydropdown.js"></script>
</head>
<body>
	<div class="header-top">
		<div class="wrap">
			<div class="header-top-left">
				<div class="box">
					<select tabindex="4" class="dropdown">
						<option value="" class="label" value="">Language :</option>
						<option value="1">English</option>
						<option value="2">French</option>
						<option value="3">German</option>
					</select>
				</div>
				<div class="box1">
					<select tabindex="4" class="dropdown">
						<option value="" class="label" value="">Currency :</option>
						<option value="1">$ Dollar</option>
						<option value="2">€ Euro</option>
					</select>
				</div>
				<div class="clear"></div>
			</div>
			<div class="cssmenu">
				<ul>
					<c:if test="${empty sessionScope.taikhoan }">
						<li><a href="/ASM_Java4/login">Log In</a></li> |
                        <li><a href="/ASM_Java4/login">Sign Up</a></li>
					</c:if>
					<c:if test="${!empty sessionScope.taikhoan }">
						<li><a href="">Xin chào ${sessionScope.taikhoan.hoTen }</a></li> |
                        <li><a href="/ASM_Java4/users/history">Lịch sử đơn hàng</a></li>
                        <li><a href="/ASM_Java4/logout">Đăng xuất</a></li>
					</c:if>


				</ul>
			</div>
			<div class="clear"></div>
		</div>
	</div>
	<div class="header-bottom">
		<div class="wrap">
			<div class="header-bottom-left">
				<div class="logo">
					<a href="/ASM_Java4/users/index"><img
						src="${pageContext.request.contextPath}/Views/images/logo.png"
						alt="" /></a>
				</div>
				<div class="menu">
					<ul class="megamenu skyblue">
						<li class="active grid"><a href="/ASM_Java4/users/index">Home</a></li>
						<c:forEach var="item" items="${categories }">
							<li><a class="color5"
								href="/ASM_Java4/users/categories?id=${item.id}">${item.ten}</a></li>
						</c:forEach>
					</ul>
				</div>
			</div>
			<div class="header-bottom-right">
				<div class="search">
					<input type="text" name="s" class="textbox" value="Search"
						onfocus="this.value = '';"
						onblur="if (this.value == '') {this.value = 'Search';}"> <input
						type="submit" value="Subscribe" id="submit" name="submit">
					<div id="response"></div>
				</div>
				<div class="tag-list">
					<ul class="last">
						<li><a href="/ASM_Java4/users/formcart">Cart</a></li>
					</ul>
				</div>
			</div>
			<div class="clear"></div>
		</div>
	</div>
	<div class="mens">
		<div class="main">
			<jsp:include page="${view}"></jsp:include>
		</div>
	</div>
	<div class="footer">
		<div class="footer-top">
			<div class="wrap">
				<div class="section group example">
					<div class="col_1_of_2 span_1_of_2">
						<ul class="f-list">
							<li><img
								src="${pageContext.request.contextPath}/Views/images/2.png"><span
								class="f-text">Free Shipping on orders over $ 100</span>
								<div class="clear"></div></li>
						</ul>
					</div>
					<div class="col_1_of_2 span_1_of_2">
						<ul class="f-list">
							<li><img
								src="${pageContext.request.contextPath}/Views/images/3.png"><span
								class="f-text">Call us! toll free-222-555-6666 </span>
								<div class="clear"></div></li>
						</ul>
					</div>
					<div class="clear"></div>
				</div>
			</div>
		</div>
		<div class="footer-middle">
			<div class="wrap">
				<div class="section group example">
					<div class="col_1_of_f_1 span_1_of_f_1">
						<div class="section group example">
							<div class="col_1_of_f_2 span_1_of_f_2">
								<h3>Facebook</h3>
								<script>
									(function(d, s, id) {
										var js, fjs = d.getElementsByTagName(s)[0];
										if (d.getElementById(id))
											return;
										js = d.createElement(s);
										js.id = id;
										js.src = "//connect.facebook.net/en_US/all.js#xfbml=1";
										fjs.parentNode.insertBefore(js, fjs);
									}(document, 'script', 'facebook-jssdk'));
								</script>
								<div class="like_box">
									<div class="fb-like-box"
										data-href="http://www.facebook.com/w3layouts"
										data-colorscheme="light" data-show-faces="true"
										data-header="true" data-stream="false" data-show-border="true"></div>
								</div>
							</div>
							<div class="col_1_of_f_2 span_1_of_f_2">
								<h3>From Twitter</h3>
								<div class="recent-tweet">
									<div class="recent-tweet-icon">
										<span> </span>
									</div>
									<div class="recent-tweet-info">
										<p>
											Ds which don't look even slightly believable. If you are <a
												href="#">going to use nibh euismod</a> tincidunt ut laoreet
											adipisicing
										</p>
									</div>
									<div class="clear"></div>
								</div>
								<div class="recent-tweet">
									<div class="recent-tweet-icon">
										<span> </span>
									</div>
									<div class="recent-tweet-info">
										<p>
											Ds which don't look even slightly believable. If you are <a
												href="#">going to use nibh euismod</a> tincidunt ut laoreet
											adipisicing
										</p>
									</div>
									<div class="clear"></div>
								</div>
							</div>
							<div class="clear"></div>
						</div>
					</div>
					<div class="col_1_of_f_1 span_1_of_f_1">
						<div class="section group example">
							<div class="col_1_of_f_2 span_1_of_f_2">
								<h3>Information</h3>
								<ul class="f-list1">
									<li><a href="#">Duis autem vel eum iriure </a></li>
									<li><a href="#">anteposuerit litterarum formas </a></li>
									<li><a href="#">Tduis dolore te feugait nulla</a></li>
									<li><a href="#">Duis autem vel eum iriure </a></li>
									<li><a href="#">anteposuerit litterarum formas </a></li>
									<li><a href="#">Tduis dolore te feugait nulla</a></li>
								</ul>
							</div>
							<div class="col_1_of_f_2 span_1_of_f_2">
								<h3>Contact us</h3>
								<div class="company_address">
									<p>500 Lorem Ipsum Dolor Sit,</p>
									<p>22-56-2-9 Sit Amet, Lorem,</p>
									<p>USA</p>
									<p>Phone:(00) 222 666 444</p>
									<p>Fax: (000) 000 00 00 0</p>
									<p>
										Email: <span>mail[at]leoshop.com</span>
									</p>

								</div>
								<div class="social-media">
									<ul>
										<li><span class="simptip-position-bottom simptip-movable"
											data-tooltip="Google"><a href="#" target="_blank">
											</a></span></li>
										<li><span class="simptip-position-bottom simptip-movable"
											data-tooltip="Linked in"><a href="#" target="_blank">
											</a> </span></li>
										<li><span class="simptip-position-bottom simptip-movable"
											data-tooltip="Rss"><a href="#" target="_blank"> </a></span></li>
										<li><span class="simptip-position-bottom simptip-movable"
											data-tooltip="Facebook"><a href="#" target="_blank">
											</a></span></li>
									</ul>
								</div>
							</div>
							<div class="clear"></div>
						</div>
					</div>
					<div class="clear"></div>
				</div>
			</div>
		</div>
		<div class="footer-bottom">
			<div class="wrap">
				<div class="copy">
					<p>
						© 2014 Template by <a href="http://w3layouts.com" target="_blank">w3layouts</a>
					</p>
				</div>
				<div class="f-list2">
					<ul>
						<li class="active"><a href="about.html">About Us</a></li> |
						<li><a href="delivery.html">Delivery & Returns</a></li> |
						<li><a href="delivery.html">Terms & Conditions</a></li> |
						<li><a href="contact.html">Contact Us</a></li>
					</ul>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	</div>
</body>
</html>