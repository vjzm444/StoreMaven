package com.nemew.blog.controller;
/**
 * @FileName : BoardController.java
 * @Project : MavenTest
 * @Date : 2019. 12. 31. 
 * @작성자 : song
 * @변경이력 :
 * @프로그램 설명 : 전체적인 컨트롤러
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

import com.nemew.blog.model.BoardModel;
import com.nemew.blog.service.BoardService;

import java.io.*;
import java.text.SimpleDateFormat;

@Controller("BoardController")
public class BoardController {
	
	
	@Autowired
	BoardService boardService;

	String userPass = "user/post/";	//jsp폴더경로
	String adminPass = "admin/post/";	//jsp폴더경로
	//
	
	//user main페이지
	@GetMapping("/")// URL 주소
	public String userMain(HttpServletRequest request,HttpServletResponse response) throws Throwable {
		
		BoardModel boardVO = new BoardModel();

		//상품 기본정보
		List<BoardModel> board = boardService.BoardList(boardVO);
		
		request.setAttribute("imgBicList", board);
		return userPass+"shopMain"; 
	}
	
	//admin main페이지
	@GetMapping("/adminMain.do")// URL 주소
	public String adminMain(HttpServletRequest request,HttpServletResponse response) throws Throwable {
	
		return adminPass+"adminMain"; 
	}
	
	//user 상품 상세페이지
	@GetMapping("/productDetail.do")// URL 주소
	public String productDetail(HttpServletRequest request,HttpServletResponse response, Model model) throws Throwable {
		
		BoardModel boardVO = new BoardModel();
		boardVO.setUp_seq("00001"); 
		
		//상품 기본정보
		List<BoardModel> board = boardService.BoardList(boardVO);
		
		
		//대분류 이미지 조회
		boardVO.setDivision("D"); 
		List<BoardModel> imgBicList = boardService.imgDetailList(boardVO);

		//소분류 이미지 조회
		boardVO.setDivision("S"); 
		List<BoardModel> imgList = boardService.imgDetailList(boardVO);
		
		request.setAttribute("imgBicList", imgBicList);
		request.setAttribute("imgList", imgList);
		

		request.setAttribute("board", board);
		
		/*
		model.addAttribute("title", board.getTitle());
		model.addAttribute("content", board.getContent());
		model.addAttribute("price", board.getPrice());
		*/	
		return userPass+"product-detail"; 
	}
	


	
}