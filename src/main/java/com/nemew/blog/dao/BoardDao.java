package com.nemew.blog.dao;
/**
 * @FileName : BoardDao.java
 * @Project : MavenTest
 * @Date : 2019. 12. 24. 
 * @작성자 : song
 * @변경이력 : 
 * @프로그램 설명 : DB에 매핑되는 dao
 */
import java.util.List;

import com.nemew.blog.model.BoardModel;
import com.nemew.blog.service.BoardService;

public interface BoardDao {
	
	//상품정보 조회(상세포함)
	List<BoardModel> BoardList(BoardModel boardVO);
	
	//다중 이미지 조회
	List<BoardModel> imgDetailList(BoardModel boardVO);
	
	//장바구니
	List<BoardModel> cartList(BoardModel boardVO);

	public int maxIdNum();
	
	//게시물 등록
	public boolean cartInsertPost(BoardModel vo) throws Exception;
}