<%
/* =================================================================
 * 
 * Create : 2020. 1. 6.
 * Create User : song
 * Comment : 공통 js 및 jquery관련
 *   
 * =================================================================
 * UpdateDay         Name             Comment     

 * -----------------------------------------------------------------------
 * 
 * =================================================================
 */ 
%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta>
<title>Insert title here</title>
</head>
<body>
	<script src="user/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="user/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="user/vendor/bootstrap/js/popper.js"></script>
	<script src="user/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="user/vendor/select2/select2.min.js"></script>
	<script>
		$(".js-select2").each(function(){
			$(this).select2({
				minimumResultsForSearch: 20,
				dropdownParent: $(this).next('.dropDownSelect2')
			});
		})
	</script>
<!--===============================================================================================-->
	<script src="user/vendor/daterangepicker/moment.min.js"></script>
	<script src="user/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="user/vendor/slick/slick.min.js"></script>
	<script src="user/js/slick-custom.js"></script>
<!--===============================================================================================-->
	<script src="user/vendor/parallax100/parallax100.js"></script>
	<script>
        $('.parallax100').parallax100();
	</script>
<!--===============================================================================================-->
	<script src="user/vendor/MagnificPopup/jquery.magnific-popup.min.js"></script>
	<script>
		$('.gallery-lb').each(function() { // the containers for all your galleries
			$(this).magnificPopup({
		        delegate: 'a', // the selector for gallery item
		        type: 'image',
		        gallery: {
		        	enabled:true
		        },
		        mainClass: 'mfp-fade'
		    });
		});
	</script>
<!--===============================================================================================-->
	<script src="user/vendor/isotope/isotope.pkgd.min.js"></script>
<!--===============================================================================================-->
	<script src="user/vendor/sweetalert/sweetalert.min.js"></script>
	<script>
		$('.js-addwish-b2').on('click', function(e){
			e.preventDefault();
		});

		$('.js-addwish-b2').each(function(){
			var nameProduct = $(this).parent().parent().find('.js-name-b2').html();
			$(this).on('click', function(){
				swal(nameProduct, "is added to wishlist !", "success");

				$(this).addClass('js-addedwish-b2');
				$(this).off('click');
			});
		});

		$('.js-addwish-detail').each(function(){
			var nameProduct = $(this).parent().parent().parent().find('.js-name-detail').html();

			$(this).on('click', function(){
				swal(nameProduct, "is added to wishlist !", "success");

				$(this).addClass('js-addedwish-detail');
				$(this).off('click');
			});
		});

		/*---------------------------------------------*/
		
		//장바구니 넣기
		$('.js-addcart-detail').each(function(){
			var nameProduct = $(this).parent().parent().parent().parent().find('.js-name-detail').html();

			
			
			$(this).on('click', function(){
	
				var up_seq = document.getElementById("up_seq").value;
				var num = document.getElementById("num-product").value;

				//사이즈
				var s = document.getElementById("optionSize");
				var optionSize = s.options[s.selectedIndex].value;
	
				//컬러
				var c = document.getElementById("optionColer");
				var optionColer = c.options[c.selectedIndex].value;
	
				if(optionSize == '' || optionColer == ''){
					alert('옵션을 선택해주세요');
					return
				}	
				
				//장바구니 업로드
				uploadAjax(optionSize, optionColer, up_seq, num)
			
				swal(nameProduct, "is added to cart !", "success");
			});
		});


		//게시물 글짜 등록 시작~~~
		function uploadAjax(optionSize, optionColer, up_seq, num){
			
		    //장바구니 업로드
			$.ajax({
		      url: "/cartUploadProcess.do",
		      dataType: 'json',
		      type: "POST",
		      data: {
		    	  size : optionSize,
		    	  color : optionColer,
		    	  up_seq: up_seq,
		    	  cnt : num
		      },
		      cache: false,
		      success: function() {
		        // Success message
			  	console.log('success cart upload');
		      },
		      error: function() {
		    	  alert('장바구니 upload 실패');
		    	  return
		      }
		    });
		    
		}



		
	</script>
<!--===============================================================================================-->
	<script src="user/vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
	<script>
		$('.js-pscroll').each(function(){
			$(this).css('position','relative');
			$(this).css('overflow','hidden');
			var ps = new PerfectScrollbar(this, {
				wheelSpeed: 1,
				scrollingThreshold: 1000,
				wheelPropagation: false,
			});

			$(window).on('resize', function(){
				ps.update();
			})
		});
	</script>
<!--===============================================================================================-->
	<script src="user/js/main.js"></script>

</body>
</html>