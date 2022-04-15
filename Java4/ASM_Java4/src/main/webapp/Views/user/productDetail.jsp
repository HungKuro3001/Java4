<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="wrap">

	<div class="cont span_2_of_3">
		<div class="grid images_3_of_2">
			<img src="/ASM_Java4/image/${item.img}" alt="">
			<div class="clearfix"></div>
		</div>
		<div class="desc1 span_3_of_2">
			<h3 class="m_3">${item.ten}</h3>
			<p class="m_5">${item.donGia})</p>
			<p>
				<strong>Màu sắc</strong> : ${item.mauSac }
			</p>
			<p>
				<strong>Size</strong> : ${item.kichThuoc }
			</p>
			
			<div class="btn_form">
				<form action="/ASM_Java4/users/cart" method="post">
					<p>
						<input type="hidden" name="id" value="${item.id }"> <strong>Số
							lượng</strong> :<input type="number" class="fw-bold" name="quantity" id=""
							style="width: 50px; text-align: center;" min="1"
							max="${item.soLuong }" value="1"> <i class="text-muted">${item.soLuong }
							sản phẩm có sẳn</i>
					</p>
					<button type="submit" style="font-family: 'Exo 2', sans-serif;
    cursor: pointer;
    border: none;
    outline: none;
    display: inline-block;
    font-size: 1em;
    padding: 10px 34px;
    background: #4CB1CA;
    color: #FFF;
    text-transform: uppercase;
    -webkit-transition: all 0.3s ease-in-out;
    -moz-transition: all 0.3s ease-in-out;
    -o-transition: all 0.3s ease-in-out;
    transition: all 0.3s ease-in-out;">Thêm vào
						giỏ hàng</button>
				</form>
			</div>
			<span class="m_link"><a href="#">login to save in wishlist</a>
			</span>
			<p class="m_text2">Lorem ipsum dolor sit amet, consectetuer
				adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
				dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam,
				quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut
				aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in
				hendrerit in vulputate velit esse molestie consequat, vel illum
				dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto
				odio dignissim qui blandit</p>
		</div>
		<div class="clear"></div>
		<div class="clients">

			<script type="text/javascript">
				$(window).load(function() {
					$("#flexiselDemo1").flexisel();
					$("#flexiselDemo2").flexisel({
						enableResponsiveBreakpoints : true,
						responsiveBreakpoints : {
							portrait : {
								changePoint : 480,
								visibleItems : 1
							},
							landscape : {
								changePoint : 640,
								visibleItems : 2
							},
							tablet : {
								changePoint : 768,
								visibleItems : 3
							}
						}
					});

					$("#flexiselDemo3").flexisel({
						visibleItems : 5,
						animationSpeed : 1000,
						autoPlay : false,
						autoPlaySpeed : 3000,
						pauseOnHover : true,
						enableResponsiveBreakpoints : true,
						responsiveBreakpoints : {
							portrait : {
								changePoint : 480,
								visibleItems : 1
							},
							landscape : {
								changePoint : 640,
								visibleItems : 2
							},
							tablet : {
								changePoint : 768,
								visibleItems : 3
							}
						}
					});

				});
			</script>
			<script type="text/javascript" src="js/jquery.flexisel.js"></script>
		</div>
		<div class="toogle">
			<h3 class="m_3">Product Details</h3>
			<p class="m_text">Lorem ipsum dolor sit amet, consectetuer
				adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
				dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam,
				quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut
				aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in
				hendrerit in vulputate velit esse molestie consequat, vel illum
				dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto
				odio dignissim qui blandit praesent luptatum zzril delenit augue
				duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta
				nobis eleifend option congue nihil imperdiet doming id quod mazim
				placerat facer possim assum.</p>
		</div>
		<div class="toogle">
			<h3 class="m_3">More Information</h3>
			<p class="m_text">Lorem ipsum dolor sit amet, consectetuer
				adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
				dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam,
				quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut
				aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in
				hendrerit in vulputate velit esse molestie consequat, vel illum
				dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto
				odio dignissim qui blandit praesent luptatum zzril delenit augue
				duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta
				nobis eleifend option congue nihil imperdiet doming id quod mazim
				placerat facer possim assum.</p>
		</div>
	</div>
	<div class="rsingle span_1_of_single">
		<h5 class="m_1">Categories</h5>
		<div class="metro">
			<span class="old"><select class="" tabindex="8"
				data-settings="{&quot;wrapperClass&quot;:&quot;metro&quot;}"
				id="EasyDropDown507F36">
					<option value="1">Mens</option>
					<option value="2">Sub Category1</option>
					<option value="3">Sub Category2</option>
					<option value="4">Sub Category3</option>
			</select></span><span class="selected">Mens</span><span class="carat"></span>
			<div>
				<ul>
					<li class="active">Mens</li>
					<li>Sub Category1</li>
					<li>Sub Category2</li>
					<li>Sub Category3</li>
				</ul>
			</div>
		</div>
		<div class="metro">
			<span class="old"><select class="" tabindex="8"
				data-settings="{&quot;wrapperClass&quot;:&quot;metro&quot;}"
				id="EasyDropDown2F4D6A">
					<option value="1">Womens</option>
					<option value="2">Sub Category1</option>
					<option value="3">Sub Category2</option>
					<option value="4">Sub Category3</option>
			</select></span><span class="selected">Womens</span><span class="carat"></span>
			<div>
				<ul>
					<li class="active">Womens</li>
					<li>Sub Category1</li>
					<li>Sub Category2</li>
					<li>Sub Category3</li>
				</ul>
			</div>
		</div>
		<ul class="kids">
			<li><a href="#">Kids</a></li>
			<li class="last"><a href="#">Glasses Shop</a></li>
		</ul>
		<section class="sky-form">
			<h4>Price</h4>
			<div class="row row1 scroll-pane jspScrollable" tabindex="0"
				style="overflow: hidden; padding: 0px; width: 313px;">


				<div class="jspContainer" style="width: 313px; height: 200px;">
					<div class="jspPane" style="padding: 20px; width: 266px; top: 0px;">
						<div class="col col-4">
							<label class="checkbox"><input type="checkbox"
								name="checkbox" checked=""><i></i>Rs 500 - Rs 700</label>
						</div>
						<div class="col col-4">
							<label class="checkbox"><input type="checkbox"
								name="checkbox"><i></i>Rs 700 - Rs 1000</label> <label
								class="checkbox"><input type="checkbox" name="checkbox"><i></i>Rs
								1000 - Rs 1500</label> <label class="checkbox"><input
								type="checkbox" name="checkbox"><i></i>Rs 1500 - Rs 2000</label>
							<label class="checkbox"><input type="checkbox"
								name="checkbox"><i></i>Rs 2000 - Rs 2500</label> <label
								class="checkbox"><input type="checkbox" name="checkbox"><i></i>Rs
								2500 - Rs 3000</label> <label class="checkbox"><input
								type="checkbox" name="checkbox"><i></i>Rs 3500 - Rs 4000</label>
							<label class="checkbox"><input type="checkbox"
								name="checkbox"><i></i>Rs 4000 - Rs 4500</label> <label
								class="checkbox"><input type="checkbox" name="checkbox"><i></i>Rs
								4500 - Rs 5000</label> <label class="checkbox"><input
								type="checkbox" name="checkbox"><i></i>Rs 5000 - Rs 5500</label>
							<label class="checkbox"><input type="checkbox"
								name="checkbox"><i></i>Rs 5500 - Rs 6000</label> <label
								class="checkbox"><input type="checkbox" name="checkbox"><i></i>Rs
								6000 - Rs 6500</label> <label class="checkbox"><input
								type="checkbox" name="checkbox"><i></i>Rs 6500 - Rs 7000</label>
							<label class="checkbox"><input type="checkbox"
								name="checkbox"><i></i>Rs 7000 - Rs 7500</label> <label
								class="checkbox"><input type="checkbox" name="checkbox"><i></i>Rs
								7500 - Rs 8000</label> <label class="checkbox"><input
								type="checkbox" name="checkbox"><i></i>Rs 8000 - Rs 8500</label>
						</div>
					</div>
					<div class="jspVerticalBar">
						<div class="jspCap jspCapTop"></div>
						<div class="jspTrack" style="height: 200px;">
							<div class="jspDrag" style="height: 76px;">
								<div class="jspDragTop"></div>
								<div class="jspDragBottom"></div>
							</div>
						</div>
						<div class="jspCap jspCapBottom"></div>
					</div>
				</div>
			</div>
		</section>
		<section class="sky-form">
			<h4>Brand Name</h4>
			<div class="row row1 scroll-pane jspScrollable" tabindex="0"
				style="overflow: hidden; padding: 0px; width: 313px;">


				<div class="jspContainer" style="width: 313px; height: 200px;">
					<div class="jspPane" style="padding: 20px; width: 266px; top: 0px;">
						<div class="col col-4">
							<label class="checkbox"><input type="checkbox"
								name="checkbox" checked=""><i></i>John Jacobs</label>
						</div>
						<div class="col col-4">
							<label class="checkbox"><input type="checkbox"
								name="checkbox"><i></i>Tag Heuer</label> <label class="checkbox"><input
								type="checkbox" name="checkbox"><i></i>Lee Cooper</label> <label
								class="checkbox"><input type="checkbox" name="checkbox"><i></i>Mikli</label>
							<label class="checkbox"><input type="checkbox"
								name="checkbox"><i></i>S Oliver</label> <label class="checkbox"><input
								type="checkbox" name="checkbox"><i></i>Hackett</label> <label
								class="checkbox"><input type="checkbox" name="checkbox"><i></i>Killer</label>
							<label class="checkbox"><input type="checkbox"
								name="checkbox"><i></i>IDEE</label> <label class="checkbox"><input
								type="checkbox" name="checkbox"><i></i>Vogue</label> <label
								class="checkbox"><input type="checkbox" name="checkbox"><i></i>Gunnar</label>
							<label class="checkbox"><input type="checkbox"
								name="checkbox"><i></i>Accu Reader</label> <label
								class="checkbox"><input type="checkbox" name="checkbox"><i></i>CAT</label>
							<label class="checkbox"><input type="checkbox"
								name="checkbox"><i></i>Excellent</label> <label class="checkbox"><input
								type="checkbox" name="checkbox"><i></i>Feelgood</label> <label
								class="checkbox"><input type="checkbox" name="checkbox"><i></i>Odysey</label>
							<label class="checkbox"><input type="checkbox"
								name="checkbox"><i></i>Animal</label>
						</div>
					</div>
					<div class="jspVerticalBar">
						<div class="jspCap jspCapTop"></div>
						<div class="jspTrack" style="height: 200px;">
							<div class="jspDrag" style="height: 76px;">
								<div class="jspDragTop"></div>
								<div class="jspDragBottom"></div>
							</div>
						</div>
						<div class="jspCap jspCapBottom"></div>
					</div>
				</div>
			</div>
		</section>
		<section class="sky-form">
			<h4>Frame Shape</h4>
			<div class="row row1 scroll-pane jspScrollable" tabindex="0"
				style="overflow: hidden; padding: 0px; width: 313px;">


				<div class="jspContainer" style="width: 313px; height: 200px;">
					<div class="jspPane" style="padding: 20px; width: 266px; top: 0px;">
						<div class="col col-4">
							<label class="checkbox"><input type="checkbox"
								name="checkbox" checked=""><i></i>Pilot</label>
						</div>
						<div class="col col-4">
							<label class="checkbox"><input type="checkbox"
								name="checkbox"><i></i>Rectangle</label> <label class="checkbox"><input
								type="checkbox" name="checkbox"><i></i>Square</label> <label
								class="checkbox"><input type="checkbox" name="checkbox"><i></i>Round</label>
							<label class="checkbox"><input type="checkbox"
								name="checkbox"><i></i>Others</label> <label class="checkbox"><input
								type="checkbox" name="checkbox"><i></i>Cat Eyes</label> <label
								class="checkbox"><input type="checkbox" name="checkbox"><i></i>Wrap
								Around</label>
						</div>
					</div>
					<div class="jspVerticalBar">
						<div class="jspCap jspCapTop"></div>
						<div class="jspTrack" style="height: 200px;">
							<div class="jspDrag" style="height: 161px;">
								<div class="jspDragTop"></div>
								<div class="jspDragBottom"></div>
							</div>
						</div>
						<div class="jspCap jspCapBottom"></div>
					</div>
				</div>
			</div>
		</section>
		<section class="sky-form">
			<h4>Frame Size</h4>
			<div class="row row1 scroll-pane"
				style="overflow: hidden; padding: 0px; width: 313px;">


				<div class="jspContainer" style="width: 313px; height: 200px;">
					<div class="jspPane"
						style="padding: 20px; top: 0px; left: 0px; width: 273px;">
						<div class="col col-4">
							<label class="checkbox"><input type="checkbox"
								name="checkbox" checked=""><i></i>Small</label>
						</div>
						<div class="col col-4">
							<label class="checkbox"><input type="checkbox"
								name="checkbox"><i></i>Medium</label> <label class="checkbox"><input
								type="checkbox" name="checkbox"><i></i>Large</label> <label
								class="checkbox"><input type="checkbox" name="checkbox"><i></i>Medium</label>
							<label class="checkbox"><input type="checkbox"
								name="checkbox"><i></i>Large</label>
						</div>
					</div>
				</div>
			</div>
		</section>
		<section class="sky-form">
			<h4>Frame Type</h4>
			<div class="row row1 scroll-pane"
				style="overflow: hidden; padding: 0px; width: 313px;">


				<div class="jspContainer" style="width: 313px; height: 200px;">
					<div class="jspPane"
						style="padding: 20px; top: 0px; left: 0px; width: 273px;">
						<div class="col col-4">
							<label class="checkbox"><input type="checkbox"
								name="checkbox" checked=""><i></i>Full Rim</label>
						</div>
						<div class="col col-4">
							<label class="checkbox"><input type="checkbox"
								name="checkbox"><i></i>Rim Less</label> <label class="checkbox"><input
								type="checkbox" name="checkbox"><i></i>Half Rim</label> <label
								class="checkbox"><input type="checkbox" name="checkbox"><i></i>Rim
								Less</label> <label class="checkbox"><input type="checkbox"
								name="checkbox"><i></i>Half Rim</label>
						</div>
					</div>
				</div>
			</div>
		</section>
		<section class="sky-form">
			<h4>Colors</h4>
			<ul class="color-list">
				<li><a href="#"> <span class="color1"> </span>
						<p class="red">Red</p>
				</a></li>
				<li><a href="#"> <span class="color2"> </span>
						<p class="red">Green</p>
				</a></li>
				<li><a href="#"> <span class="color3"> </span>
						<p class="red">Blue</p>
				</a></li>
				<li><a href="#"> <span class="color4"> </span>
						<p class="red">Yellow</p>
				</a></li>
				<li><a href="#"> <span class="color5"> </span>
						<p class="red">Violet</p>
				</a></li>
				<li><a href="#"> <span class="color6"> </span>
						<p class="red">Orange</p>
				</a></li>
				<li><a href="#"> <span class="color7"> </span>
						<p class="red">Gray</p>
				</a></li>
			</ul>
		</section>
		<script src="js/jquery.easydropdown.js"></script>
	</div>
</div>