<%
/* =================================================================
 * 
 * Create : 2020. 1. 9.
 * Create User : song
 * Comment : 
 *   
 * =================================================================
 * UpdateDay         Name             Comment     

 * -----------------------------------------------------------------------
 * 
 * =================================================================
 */ 
%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>



<!doctype html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Ela Admin - HTML5 Admin Template</title>
   
	<%@ include file="/WEB-INF/views/admin/includCommon/cssCommon.jsp" %>  

    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800' rel='stylesheet' type='text/css'>

    <!-- <script type="text/javascript" src="https://cdn.jsdelivr.net/html5shiv/3.7.3/html5shiv.min.js"></script> -->

</head>
<body>
    <!-- Left Panel -->

   
	<%@ include file="/WEB-INF/views/admin/common/leftRightPanelMenu.jsp" %>  
        <!-- Header-->

        <div class="breadcrumbs">
            <div class="breadcrumbs-inner">
                <div class="row m-0">
                    <div class="col-sm-4">
                        <div class="page-header float-left">
                            <div class="page-title">
                                <h1>상품업로드</h1>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-8">
                        <div class="page-header float-right">
                            <div class="page-title">
                                <ol class="breadcrumb text-right">
                                    <li><a href="#">대쉬보드</a></li>
                                    <li><a href="#">상품</a></li>
                                    <li class="active">상품등록</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

          <div class="content">
            <div class="animated fadeIn">
                <div class="row">

                    <div class="col-md-12">
                        <div class="card">
                            <div class="card-header">
                                <strong class="card-title">상품을 업로드 해보세요</strong>
                            </div>
                            
                            <div class="card-body">
                            	<div class="row form-group">
                                	<div class="col col-md-3"><label for="text-input" class=" form-control-label">글 제목</label></div>
                                 	<div class="col-12 col-md-9"><input type="text" id="text-title" name="text-title" placeholder="글 제목을 입력해주십시오" class="form-control"></div>
                                </div>
                                <div class="row form-group">
                                	<div class="col col-md-3"><label for="text-input" class=" form-control-label">간략한 설명</label></div>
                                 	<div class="col-12 col-md-9"><input type="text" id="text-subComment" name="text-subComment" placeholder="ex: 아름다운 원피스를 파격적인 가격에 판매합니다!" class="form-control"><small class="form-text text-muted">간단한 설명을 입력하세요</small></div>
                                </div>
                                <div class="row form-group">
                                	<div class="col col-md-3"><label for="text-input" class=" form-control-label">상품가격</label></div>
                                 	<div class="col-12 col-md-9"><input type="text" id="text-price" name="text-price" placeholder="가격" class="form-control" numberOnly><small class="form-text text-muted">숫자만 입력해주십시오</small></div>
                                </div>
                                 <div class="row form-group">
                                        <div class="col col-md-3"><label class=" form-control-label">색상</label></div>
                                        <div class="col col-md-9">
                                            <div class="form-check-inline form-check">
                                                <label for="inline-checkbox1" class="form-check-label ">
                                                    <input type="checkbox" id="inline-checkbox1" name="inline-checkbox" value="red" class="form-check-input">red
                                                </label>
                                                &nbsp
                                                <label for="inline-checkbox2" class="form-check-label ">
                                                    <input type="checkbox" id="inline-checkbox2" name="inline-checkbox" value="orange" class="form-check-input">orange
                                                </label>
                                                &nbsp
                                                <label for="inline-checkbox3" class="form-check-label ">
                                                    <input type="checkbox" id="inline-checkbox3" name="inline-checkbox" value="yellow" class="form-check-input">yellow
                                                </label>
                                                &nbsp
                                                <label for="inline-checkbox4" class="form-check-label ">
                                                    <input type="checkbox" id="inline-checkbox4" name="inline-checkbox" value="green" class="form-check-input">green
                                                </label>
                                                &nbsp
                                                <label for="inline-checkbox5" class="form-check-label ">
                                                    <input type="checkbox" id="inline-checkbox5" name="inline-checkbox" value="blue" class="form-check-input">blue
                                                </label>
                                                &nbsp
                                                <label for="inline-checkbox6" class="form-check-label ">
                                                    <input type="checkbox" id="inline-checkbox6" name="inline-checkbox" value="purple" class="form-check-input">purple
                                                </label>
                                                &nbsp
                                                <label for="inline-checkbox7" class="form-check-label ">
                                                    <input type="checkbox" id="inline-checkbox7" name="inline-checkbox" value="black" class="form-check-input">black
                                                </label>
                                                &nbsp
                                                <label for="inline-checkbox8" class="form-check-label ">
                                                    <input type="checkbox" id="inline-checkbox8" name="inline-checkbox" value="brown" class="form-check-input">brown
                                                </label>
                                                &nbsp
                                                <label for="inline-checkbox9" class="form-check-label ">
                                                    <input type="checkbox" id="inline-checkbox9" name="inline-checkbox" value="gray" class="form-check-input">gray
                                                </label>
                                                &nbsp
                                                <label for="inline-checkbox10" class="form-check-label ">
                                                    <input type="checkbox" id="inline-checkbox10" name="inline-checkbox" value="gold" class="form-check-input">gold
                                                </label>
                                                &nbsp
                                                <label for="inline-checkbox11" class="form-check-label ">
                                                    <input type="checkbox" id="inline-checkbox11" name="inline-checkbox" value="navy" class="form-check-input">navy
                                                </label>
                                            </div>
                                        </div>
                                    </div>
                                    
                                     <div class="row form-group">
                                        <div class="col col-md-3"><label class=" form-control-label">사이즈</label></div>
                                        <div class="col col-md-9">
                                            <div class="form-check-inline form-check">
                                                <label for="size-checkbox1" class="form-check-label ">
                                                    <input type="checkbox" id="size-checkbox1" name="size-checkbox" value="S" class="form-check-input">S
                                                </label>
                                                &nbsp
                                                <label for="size-checkbox2" class="form-check-label ">
                                                    <input type="checkbox" id="size-checkbox2" name="size-checkbox" value="M" class="form-check-input">M
                                                </label>
                                                &nbsp
                                                <label for="size-checkbox3" class="form-check-label ">
                                                    <input type="checkbox" id="size-checkbox3" name="size-checkbox" value="L" class="form-check-input">L
                                                </label>
                                                &nbsp
                                                <label for="size-checkbox4" class="form-check-label ">
                                                    <input type="checkbox" id="size-checkbox4" name="size-checkbox" value="XL" class="form-check-input">XL
                                                </label>
                                                &nbsp
                                                <label for="size-checkbox5" class="form-check-label ">
                                                    <input type="checkbox" id="size-checkbox5" name="size-checkbox" value="FreeSize" class="form-check-input">FreeSize
                                                </label>
                                            </div>
                                        </div>
                                    </div>
                                    
                                    
									<div class="row form-group">
                                        <div class="col col-md-3"><label for="textarea-input" class=" form-control-label">상품설명</label></div>
                                        <div class="col-12 col-md-9"><textarea name="textarea-comment" id="textarea-comment" rows="9" placeholder="상품의 상세한 내용을 입력해주세요..." class="form-control"></textarea></div>
                                    </div>
                                    <div class="row form-group">
                                        <div class="col col-md-3"><label class=" form-control-label">상품배너</label></div>
                                        <div class="col-12 col-md-9">
                                            <p class="form-control-static">상품 대표배너는 총 3장 업로드 가능합니다</p>
                                        </div>
                                    </div>
                                    
                                     <div class="row form-group">
                                        <div class="col col-md-3"><label for="file-input" class=" form-control-label">상품 배너이미지1<small class="form-text text-muted">(대표이미지)</small></label></div>
                                        <div class="col-12 col-md-9"><input type="file" id="file-input1" name="file-input1" class="form-control-file" accept="image/*"></div>
                                    </div>
                                     <div class="row form-group">
                                        <div class="col col-md-3"><label for="file-input" class=" form-control-label">상품 배너이미지2</label></div>
                                        <div class="col-12 col-md-9"><input type="file" id="file-input2" name="file-input2" class="form-control-file" accept="image/*"></div>
                                    </div>
                                     <div class="row form-group">
                                        <div class="col col-md-3"><label for="file-input" class=" form-control-label">상품 배너이미지3</label></div>
                                        <div class="col-12 col-md-9"><input type="file" id="file-input3" name="file-input3" class="form-control-file" accept="image/*"></div>
                                    </div>
                                    <br><br>
                                    <div class="row form-group">
                                        <div class="col col-md-3"><label for="file-multiple-input" class=" form-control-label">상품 상세이미지<small class="form-text text-muted">상품 소개 이미지를 전부 넣어주세요</small></label></div>
                                        <div class="col-12 col-md-9"><input type="file" id="file-multiple-input" name="file-multiple-input" multiple="" class="form-control-file" accept="image/*"></div>
                                    </div>
                                    
                                    <div class="row form-group">
	                                    <div class="col col-md-12">
	                                        <div class="input-group">
	                                            <div class="input-group-btn">
		                                        	<a href="javascript:click();">
		                                            	<button class="btn btn-primary">상품 등록</button>
	                                            	</a>
	                                            </div>
	                                            <div id="file_view_list" name="file_view_list"></div>
	                                        </div>
	                                    </div>
                                	</div>
                                    
                                    
                            </div>
                        </div>
                    </div>


                </div>
            </div><!-- .animated -->
        </div><!-- .content -->
        
        
    <div class="clearfix"></div>

  		<!-- Footer -->
		<%@ include file="/WEB-INF/views/admin/common/footerMenu.jsp" %>  

	</div>
	
<!-- Scripts -->
<%@ include file="/WEB-INF/views/admin/includCommon/jsCommon.jsp" %>  

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <script type="text/javascript">

    //대분류 이미지 저장 경로
	var resultFilePath ='';
	//상세이미지 경로를 저장한 배열 
	var resultFileArrayPath ='';
	//상세이미지 파일 갯수
	var fileLenth;


    //처리시작
    function click(){
   
	  	//파일처리 먼저~~
	    var formData = new FormData(); //멀티용 ajax로 넘길 data
	
	    var formData1 = new FormData(); //배너이미지1 ajax로 넘길 data
	    var formData2 = new FormData(); //배너이미지2 ajax로 넘길 data
	    var formData3 = new FormData(); //배너이미지3 ajax로 넘길 data
	    
	
	    var fileMultiple = document.getElementById("file-multiple-input"); //멀티 처리
	    var fileInput1 = document.getElementById("file-input1"); //배너이미지1
	    var fileInput2 = document.getElementById("file-input2"); //배너이미지2
	    var fileInput3 = document.getElementById("file-input3"); //배너이미지3
	
	    var filesMulti = fileMultiple.files; //멀티이미지 업로드한 파일들의 정보를 넣는다  
	    var files1 = fileInput1.files; //배너이미지1 업로드한 파일들의 정보를 넣는다.
	    var files2 = fileInput2.files; //배너이미지2 업로드한 파일들의 정보를 넣는다.
	    var files3 = fileInput3.files; //배너이미지3 업로드한 파일들의 정보를 넣는다.
	    
	    fileLenth = filesMulti.length;
		
		formData1.append("image", files1[0]); //배너이미지1 업로드한 파일을 하나 읽어서 FormData 안에 넣는다.
		formData2.append("image", files2[0]); //배너이미지2 파일을 하나 읽어서 FormData 안에 넣는다.
		formData3.append("image", files3[0]); //배너이미지3 업로드한 파일을 하나 읽어서 FormData 안에 넣는다.
	       
		uploadBannerOutServer(formData1,'1')
		uploadBannerOutServer(formData2,'2')
		uploadBannerOutServer(formData3,'3')
	    
		for (var i = 0; i < filesMulti.length; i++) {
	        formData.append('image', filesMulti[i]); //멀티로 업로드한 파일을 하나하나 읽어서 FormData 안에 넣는다.
	    	uploadOutServer(formData,i+1)
	    }
		
	
    }

	//상세이미지 처리
    function uploadOutServer(formData,gubun){
      	//바로 파일 업로드처리
       	uploadImageByImgur(formData, function(result){
        	console.log(result);
        	console.log('업로드결과:'+result.status);

    	    	if(result.status!=200){
    	    		result = $.parseJSON(result.responseText);
    	    	}
    	    	
    	    	if(result.data.error){
    	    		console.log('지원하지않는 파일형식..');
    	    	}else{	//성공일 경우
	    	    	filePath = result.data.link;
    	    		console.log('업로드된 파일경로:'+result.data.link);
    	    		resultFileArrayPath = resultFileArrayPath + result.data.link +',';

					if(fileLenth == gubun){	//반복문을 벗어남
		    	    	resultFuc();
					}
    	    		
    	    	}
        	});
     }
    
	//배너 이미지 처리
    function uploadBannerOutServer(formData,gubun){
      	//바로 파일 업로드처리
       	uploadImageByImgur(formData, function(result){
        	console.log(result);
        	console.log('업로드결과:'+result.status);

    	    	if(result.status!=200){
    	    		result = $.parseJSON(result.responseText);
    	    	}
    	    	
    	    	if(result.data.error){
    	    		console.log('지원하지않는 파일형식..');
    	    	}else{	//성공일 경우
	    	    	filePath = result.data.link;
    	    		resultFilePath = resultFilePath + result.data.link +',';
    	    	}
        	});
     }
    

	//외부 이미지서버 파일 업로드 처리
    function uploadImageByImgur(form, callback) {
        $.ajax({                   
            xhr: function(){
                var xhr = new window.XMLHttpRequest();
                xhr.upload.addEventListener("progress", function(evt){// 업로드상태이벤트리스너등록
                    if (evt.lengthComputable) {              
                        console.log("업로드진행률:"+parseInt( (evt.loaded / evt.total * 100), 10)+"%");
                        //$("#file_view_list").html(parseInt( (evt.loaded / evt.total * 100), 10)+"%"); //리스트를 화면에 보여줌
                        $("#file_view_list").html("이미지 업로드 처리중입니다. 잠시만 기다려주십시오."); //리스트를 화면에 보여줌
                    }
                }, false);
                return xhr;
            },                     
            url: 'https://api.imgur.com/3/image',// 업로드요청주소             
            headers: { Authorization: 'Client-ID eb57c1503c7b7c0' },               
            type: 'POST',               
            data: form,               
            cache: false,                   
            contentType: false,                    
            processData: false                   
        }).always(callback);
    }


    //최종 처리
    function resultFuc(){

        $("#file_view_list").html("데이터 등록중입니다. 잠시만 기다려주십시오."); //리스트를 화면에 보여줌
        console.log('상세이미지 최종:'+ resultFileArrayPath);
		console.log('배너이미지 최종:'+ resultFilePath);
		
		var title = $("input#text-title").val();
		var subComment = $("input#text-subComment").val();
		var price = $("input#text-price").val();
		var size = '';
		var color = '';
		var textareaComment = $("textarea#textarea-comment").val();

		//체크된 사이즈구하기
		$('input[name=size-checkbox]').each(function(index,item){
			if($(item).is(':checked')){
			size = size+$(item).val()+',';
			}
		});
	
		//체크된 컬러구하기
		$('input[name=inline-checkbox]').each(function(index,item){
			if($(item).is(':checked')){
			color = color+$(item).val()+',';
			}
		});

		uploadAjax(title, subComment, price, size, color, textareaComment, resultFilePath, resultFileArrayPath)
	}


  	//게시물 글짜 등록 시작~~~
    function uploadAjax(title, subComment, price, size, color, textareaComment, resultFilePath, resultFileArrayPath){
    	$.ajax({
          url: "/admin/uploadProcess.do",
          dataType: 'json',
          type: "POST",
          data: {
        	title: title,
        	subComment: subComment,
            title: title,
            price: price,
            size: size,
            color: color,
            textareaComment: textareaComment,
            resultFilePath: resultFilePath,
            resultFileArrayPath: resultFileArrayPath
          },
          cache: false,
          success: function() {
            // Success message
            $("#file_view_list").html("글 등록을 완료하였습니다."); //리스트를 화면에 보여줌
            alert('글 등록을 완료하였습니다.');
            return
          },
          error: function() {
            // Fail message
            alert('글 등록에 실패하였습니다.');
            $("#file_view_list").html("글 등록에 실패하였습니다."); //리스트를 화면에 보여줌
            return
          }
        });
        
    }


	
        
    </script>

</body>
</html>


