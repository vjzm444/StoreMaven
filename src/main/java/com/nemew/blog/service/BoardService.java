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
	
	//다중건 조회
	public List<BoardModel> BoardList(BoardModel boardVO) throws Exception;
	//소분류이미지
	public List<BoardModel> imgDetailList(BoardModel boardVO) throws Exception;
	//대분류이미지
	public List<BoardModel> imgDetailBicList(BoardModel boardVO) throws Exception;
	
}