package com.nemew.blog.dao;
/**
 * @FileName : BoardDao.java
 * @Project : MavenTest
 * @Date : 2019. 12. 24. 
 * @작성자 : song
 * @변경이력 : 
 * @프로그램 설명 : db에 매핑되는 dao
 */
import java.util.List;

import com.nemew.blog.model.BoardModel;
import com.nemew.blog.service.BoardService;

public interface BoardDao {
	
	//게시판 조회
	BoardModel BoardList(BoardModel boardVO);
	//소분류이미지
	List<BoardModel> imgDetailList(BoardModel boardVO);
	//대분류이미지
	List<BoardModel> imgDetailBicList(BoardModel boardVO);
	
}