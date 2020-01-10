package com.nemew.blog.admin.controller;
/**
 * @FileName : BoardController.java
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

import com.nemew.blog.admin.service.AdminService;

import java.io.*;
import java.text.SimpleDateFormat;

@Controller("AdminController")
public class AdminController {
	
	@Autowired
	AdminService dbService;

	String adminPass = "admin/post/";	// 관리자페이지 jsp경로
	
	//Admin main페이지
	@GetMapping("/adminMain.do")
	public String adminMain(HttpServletRequest request,HttpServletResponse response) throws Throwable {
		
		return adminPass+"adminMain"; 
	}
	
	//Admin 상품 등록 페이지
	@GetMapping("/adminUploadPage.do")
	public String AdminuploadPage(HttpServletRequest request,HttpServletResponse response) throws Throwable {
			
		return adminPass+"upLoadForm"; 
	}
	
	//테스트용
    @RequestMapping("/db2")
    public @ResponseBody String db2() throws Exception{
        return dbService.getDb2Dual();
    }
	
	
}