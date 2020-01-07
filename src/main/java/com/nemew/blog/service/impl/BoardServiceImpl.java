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

	//다중건 조회
	@Override
	public BoardModel BoardList(BoardModel boardVO) throws Exception{
		return dao.BoardList(boardVO);
	}
	
	@Override
	public List<BoardModel> imgDetailList(BoardModel boardVO) throws Exception{
		return dao.imgDetailList(boardVO);
	}
	
	@Override
	public List<BoardModel> imgDetailBicList(BoardModel boardVO) throws Exception{
		return dao.imgDetailBicList(boardVO);
	}
	
	
}