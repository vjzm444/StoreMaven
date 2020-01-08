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
	
	//다중 이미지 조회
	public List<BoardModel> imgDetailList(BoardModel boardVO) throws Exception;

	public List<BoardModel> cartList(BoardModel boardVO) throws Exception;
	
	public int maxIdNum();
	
	//게시물 업데이트
	public boolean cartInsertPost(BoardModel vo) throws Exception;
}