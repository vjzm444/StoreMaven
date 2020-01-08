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

	String userPass = "user/post/";	//USER jsp경로
	String adminPass = "admin/post/";	//ADMIN jsp경로
	
	
	//Admin main페이지
	@GetMapping("/adminMain.do")// URL 주소
	public String adminMain(HttpServletRequest request,HttpServletResponse response) throws Throwable {
		
		return adminPass+"adminMain"; 
	}
	
	
	//User main페이지
	@GetMapping("/")// URL 주소
	public String userMain(HttpServletRequest request,HttpServletResponse response) throws Throwable {
		
		BoardModel boardVO = new BoardModel();

		//상품 기본정보 및 1번째 배너 이미지
		List<BoardModel> board = boardService.BoardList(boardVO);
		
		//현재 로그인 된 유저아이디
		String keyId = "vjzm44";
		//장바구니 목록 조회
		List<BoardModel> cartList = cartSeachList(keyId);
				

		request.setAttribute("cartList", cartList);
		request.setAttribute("imgBicList", board);
		return userPass+"shopMain"; 
	}
	
	
	//User 상품 상세페이지
	@GetMapping("/productDetail.do")// URL 주소
	public String productDetail(HttpServletRequest request,HttpServletResponse response, Model model) throws Throwable {
	
		//게시물 고유번호
		String selectKey = request.getParameter("up_seq");

		BoardModel boardVO = new BoardModel();

		//추천 상품 탭 정보
		boardVO.setRecommend("Y"); 
		List<BoardModel> boardRecommend = boardService.BoardList(boardVO);
		
		if(selectKey.equals("")||selectKey == null) {
			selectKey = "00001";
			System.out.println("Select Key is Null!!!!!!");
		}
		

		//장바구니 목록 조회
		//현재 로그인 된 유저아이디
		String keyId = "vjzm44";
		List<BoardModel> cartList = cartSeachList(keyId);
		
		boardVO.setRecommend(""); //초기화 
		boardVO.setUp_seq(selectKey); 
		//상품 기본정보
		List<BoardModel> board = boardService.BoardList(boardVO);
		
		
		//대분류 이미지 조회
		boardVO.setDivision("D"); 
		List<BoardModel> imgBicList = boardService.imgDetailList(boardVO);

		//소분류 이미지 조회
		boardVO.setDivision("S"); 
		List<BoardModel> imgList = boardService.imgDetailList(boardVO);

		request.setAttribute("cartList", cartList);	//장바구니
		request.setAttribute("recommendList", boardRecommend);	//추천 상품정보
		request.setAttribute("imgBicList", imgBicList); //대분류이미지
		request.setAttribute("imgList", imgList);	//소분류 이미지
		request.setAttribute("board", board);	//개별 상품정보
		
		return userPass+"product-detail"; 
	}
	
	//유저가 장바구니에 넣은 목록정보
	public List cartSeachList(String keyId) throws Exception{
		BoardModel boardVO = new BoardModel();
		boardVO.setUser_id(keyId); 
		return boardService.cartList(boardVO);
	}
	
	@ResponseBody    
	@RequestMapping(value="/cartUploadProcess.do", method = RequestMethod.POST ) // URL 주소
	public boolean cartUploadProcess(HttpServletRequest request,HttpServletResponse response) throws Throwable {	

		boolean result = true;
		
		//String user_id = request.getParameter("user_id");
		
		String user_id = "vjzm44";
		String up_seq = request.getParameter("up_seq");
		String size = request.getParameter("size");
		String color = request.getParameter("color");
		String cnt = request.getParameter("cnt");
		
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String time1 = format1.format(time);
		
		System.out.println("up_seq================ "+up_seq);
		System.out.println("size================ "+size);
		System.out.println("color================ "+color);
		System.out.println("time1================ "+time1);
		
		
		
		if(user_id.equals("") || user_id == null) {
			result = false;
		}
		
		//장바구니 최고 id값
		int maxid = idNum();
		System.out.println("select max id = "+maxid);
		
		BoardModel vo = new BoardModel();
		vo.setId(maxid);
		vo.setUser_id(user_id);
		vo.setUp_seq(up_seq);
		vo.setSize(size);
		vo.setColor(color);
		vo.setCnt(cnt);
		vo.setReg_date(time1);
		
		
		boolean res = boardService.cartInsertPost(vo);
		
		return result;
	}
	
	 //id값 가져오기
	public int idNum() {
		int maxNum = boardService.maxIdNum();
		return maxNum;
	}
		
	


	
}