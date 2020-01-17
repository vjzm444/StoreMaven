package com.nemew.blog.admin.controller;
/**
 * @FileName : AdminController.java
 * @Project : StoreMaven
 * @Date : 2019. 12. 31. 
 * @작성자 : song
 * @변경이력 :
 * @프로그램 설명 : Admin페이지의 전체적인 컨트롤러
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.*;
import javax.servlet.http.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpRequest;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.nemew.blog.admin.model.AdminModel;
import com.nemew.blog.admin.service.AdminService;

import java.io.*;
import java.text.SimpleDateFormat;

@Controller("AdminController")
public class AdminController {
	
	@Autowired
	AdminService adminService;

	String adminPass = "admin/post/";	// 관리자페이지 jsp경로
	
	//Admin main페이지
	@GetMapping("/adminMain.do")
	public String adminMain(HttpServletRequest request,HttpServletResponse response) throws Throwable {
		
		request.setAttribute("shadow", "main");
		return adminPass+"adminMain"; 
	}
	
	//Admin 상품 등록 페이지
	@GetMapping("/adminUploadPage.do")
	public String AdminuploadPage(HttpServletRequest request,HttpServletResponse response) throws Throwable {

		request.setAttribute("shadow", "upload");
		return adminPass+"upLoadForm"; 
	}
	
	//db연동 테스트용
    @RequestMapping("/db2")
    public @ResponseBody String db2() throws Exception{
        return adminService.getDb2Dual();
    }
	
    //글쓰기 등록 처리 ajax
  	@ResponseBody    
  	@RequestMapping(value="/admin/uploadProcess.do", method = RequestMethod.POST )
  	public boolean uploadProcess(HttpServletRequest request, HttpServletResponse response) throws Throwable {	

  		boolean result = true;
  		
  		String title = request.getParameter("title");
  		String subComment = request.getParameter("subComment");
  		String price = request.getParameter("price");
  		String size = request.getParameter("size");
  		String color = request.getParameter("color");
  		String textareaComment = request.getParameter("textareaComment");
  		
  		//배열값
  		String resultFilePath = request.getParameter("resultFilePath");
  		String resultFileArrayPath = request.getParameter("resultFileArrayPath");
  		
  		System.out.println("글제목 = "+title+" /서브코멘트 = "+subComment+" /가격 ="+price+" /사이즈 = "+size+" /색깔 = "+color+" /상세설명 = "+textareaComment+" /배너이미지 = "+resultFilePath+" /상세이미지 = "+resultFileArrayPath);

  		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
  		Date time = new Date();
  		String time1 = format1.format(time); //현재시간
  		
  		try {
	  		int maxid = adminService.maxIdNum();	//max id 구하기
	  		System.out.println("maxid = "+maxid);
	  		String maxUsrSep = adminService.maxUserSeq();	//max 시퀀스 구하기
	  		System.out.println("maxUsrSep = "+maxUsrSep);
	  		
	  		AdminModel vo = new AdminModel();
	  		vo.setId(maxid);
	  		vo.setUp_seq(maxUsrSep);
	  		vo.setTitle(title);
	  		vo.setContent(textareaComment);
	  		vo.setPrice(price);
	  		vo.setReg_date(time1);
	  		
	  		//게시글 올리기
	  		boolean res = adminService.adminInsertPost(vo);
	  		
			String[] array1 = resultFilePath.split(","); 		//배너 이미지
	  		String[] array2 = resultFileArrayPath.split(",");	//상세 이미지
	  		
	  		//이미지 리스트들 처리시작
	  		for(int i=0;i<array1.length;i++) {
	  	  		int maxDetailId = adminService.maxDetailId(); //배너이미지 최고 id 구하기
	  	  		vo.setId(maxDetailId);
	  	  		vo.setImg_cnt_v2(i+1);
	  	  		vo.setImg_url(array1[i]);
	  	  		vo.setDivision("D");
	  	  		boolean res1 = adminService.adminInsertImg(vo);
	  		}
	
	  		for(int i=0;i<array2.length;i++) {
	  	  		int maxDetailId = adminService.maxDetailId(); //배너이미지 최고 id 구하기
	  	  		vo.setId(maxDetailId);
	  	  		vo.setImg_cnt_v2(i+1);
	  	  		vo.setImg_url(array2[i]);
	  	  		vo.setDivision("S");
	  	  		boolean res1 = adminService.adminInsertImg(vo);
	  		}
  		}catch(Exception e) {
  	  		System.out.println("admin insert error!!! = "+e);
  	  		result = false;
  		}
  		return result;
  	}


}