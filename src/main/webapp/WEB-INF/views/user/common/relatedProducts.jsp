<%
/* =================================================================
 * 
 * Create : 2020. 1. 6.
 * Create User : song
 * Comment : 상세페이지 하단에 상품추천 탭
 *   
 * =================================================================
 * UpdateDay         Name             Comment     

 * -----------------------------------------------------------------------
 * 
 * =================================================================
 */ 
%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta>
<title>상품 추천 탭</title>
</head>
<body>
<section class="sec-relate-product bg0 p-t-45 p-b-105">
		<div class="container">
			<div class="p-b-45">
				<h3 class="ltext-106 cl5 txt-center">
					상품 추천
				</h3>
			</div>

			<!-- Slide2 -->
			<div class="wrap-slick2">
				<div class="slick2">
						
					<c:forEach var="recommend" items="${recommendList}">	
						<div class="item-slick2 p-l-15 p-r-15 p-t-15 p-b-15">
							<!-- Block2 -->
							<div class="block2">
								<div class="block2-pic hov-img0">
									<img src="${recommend.img_url}" alt="IMG-PRODUCT">
	
									<a href="/productDetail.do?up_seq=${recommend.up_seq}" class="block2-btn flex-c-m stext-103 cl2 size-102 bg0 bor2 hov-btn1 p-lr-15 trans-04">
										Quick View
									</a>
								</div>
	
								<div class="block2-txt flex-w flex-t p-t-14">
									<div class="block2-txt-child1 flex-col-l ">
										<a href="/productDetail.do?up_seq=${recommend.up_seq}" class="stext-104 cl4 hov-cl1 trans-04 js-name-b2 p-b-6">
											${recommend.title}
										</a>
	
										<span class="stext-105 cl3">
											${recommend.price}
										</span>
									</div>
	
									<div class="block2-txt-child2 flex-r p-t-3">
										<a href="#" class="btn-addwish-b2 dis-block pos-relative js-addwish-b2">
											<img class="icon-heart1 dis-block trans-04" src="user/images/icons/icon-heart-01.png" alt="ICON">
											<img class="icon-heart2 dis-block trans-04 ab-t-l" src="user/images/icons/icon-heart-02.png" alt="ICON">
										</a>
									</div>
								</div>
							</div>
						</div>
					</c:forEach>


				</div>
			</div>
		</div>
	</section>
	
	
	
	
</body>
</html>