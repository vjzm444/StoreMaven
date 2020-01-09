package com.nemew.blog.service;
/**
 * @FileName : BoardService.java
 * @Project : MavenTest
 * @Date : 2019. 12. 24. 
 * @작성자 : song
 * @변경이력 : 
 * @프로그램 설명 : 스프링의 서비스 기반
 */
import java.util.List;

import org.springframework.stereotype.Service;

import com.nemew.blog.model.BoardModel;

public interface BoardService {
	
	//상품정보 조회(상세포함)
	public List<BoardModel> BoardList(BoardModel boardVO) throws Exception;
	
	//상품이미지 리스트 조회
	public List<BoardModel> imgDetailList(BoardModel boardVO) throws Exception;
	
	//장바구니 정보조회
	public List<BoardModel> cartList(BoardModel boardVO) throws Exception;
	
	//장바구니 maxId 조회
	public int cartMaxIdNum();
	
	//장바구니 상품 등록
	public boolean cartInsertPost(BoardModel vo) throws Exception;
}