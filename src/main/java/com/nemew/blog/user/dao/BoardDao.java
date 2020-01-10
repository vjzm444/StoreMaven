package com.nemew.blog.user.dao;
/**
 * @FileName : BoardDao.java
 * @Project : MavenTest
 * @Date : 2019. 12. 24. 
 * @작성자 : song
 * @변경이력 : 
 * @프로그램 설명 : DB에 매핑되는 dao
 */
import java.util.List;

import com.nemew.blog.user.model.BoardModel;
import com.nemew.blog.user.service.BoardService;

public interface BoardDao {
	
	//상품정보 조회(상세포함)
	List<BoardModel> BoardList(BoardModel boardVO);
	
	//다중 이미지 조회
	List<BoardModel> imgDetailList(BoardModel boardVO);
	
	//장바구니 조회
	List<BoardModel> cartList(BoardModel boardVO);
	
	//장바구니 max id값
	public int cartMaxIdNum();
	
	//장바구니 등록
	public boolean cartInsertPost(BoardModel vo) throws Exception;


}