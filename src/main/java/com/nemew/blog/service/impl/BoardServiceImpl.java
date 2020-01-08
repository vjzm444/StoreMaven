package com.nemew.blog.service.impl;
/**
 * @FileName : BoardServiceImpl.java
 * @Project : MavenTest
 * @Date : 2019. 12. 24. 
 * @작성자 : song
 * @변경이력 : 
 * @프로그램 설명 : 스프링의 서비스임풀 기반
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.nemew.blog.dao.BoardDao;
import com.nemew.blog.model.BoardModel;
import com.nemew.blog.service.BoardService;


@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired 
	BoardDao dao;

	//상품정보 조회(상세포함)
	@Override
	public List<BoardModel> BoardList(BoardModel boardVO) throws Exception{
		return dao.BoardList(boardVO);
	}
	
	//다중 이미지 조회
	@Override
	public List<BoardModel> imgDetailList(BoardModel boardVO) throws Exception{
		return dao.imgDetailList(boardVO);
	}
	
	//장바구니
	@Override
	public List<BoardModel> cartList(BoardModel boardVO) throws Exception{
		return dao.cartList(boardVO);
	}
	
	//등록을 위한 max key번호 조회
	@Override
	public int maxIdNum() {
		int result = dao.maxIdNum();
		
		return result;
	}
	
	//게시물 등록
	@Override
	public boolean cartInsertPost(BoardModel vo) throws Exception {		
		boolean result = true;

		try {
			dao.cartInsertPost(vo);
		}catch (Exception e) {
			result = false;
		}
		return result; 
	}
	
}