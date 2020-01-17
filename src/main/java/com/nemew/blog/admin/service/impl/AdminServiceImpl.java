/**
  * @FileName : AdminServiceImpl.java
  * @Project : StoreMaven
  * @Date : 2020. 1. 10. 
  * @작성자 : song
  * @변경이력 :
  * @프로그램 설명 :
  */
package com.nemew.blog.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.nemew.blog.admin.dao.AdminDao;
import com.nemew.blog.admin.model.AdminModel;
import com.nemew.blog.admin.service.AdminService;


@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao dao;
	
	//테스트용
	public String getDb2Dual() throws Exception{
		return dao.getDb2Dual();
	}

	//메인테이블 max id값 조회
	@Override
	public int maxIdNum() {
		int result = dao.maxIdNum();
		
		return result;
	}
	
	//메인테이블 max 시퀀스번호 조회
	@Override
	public String maxUserSeq() {
		String result = dao.maxUserSeq();
			
		return result;
	}
	//디테일테이블 id max값 조회
	@Override
	public int maxDetailId() {
		int result = dao.maxDetailId();
			
		return result;
	}
	
	//게시물 등록
	@Override
	public boolean adminInsertPost(AdminModel vo) throws Exception {		
		boolean result = true;
		
		try {
			dao.adminInsertPost(vo);
		}catch (Exception e) {
			result = false;
		}
		return result; 
	}
	
	//게시물 이미지 등록
	@Override
	public boolean adminInsertImg(AdminModel vo) throws Exception {		
		boolean result = true;
		
		try {
			dao.adminInsertImg(vo);
		}catch (Exception e) {
			result = false;
		}
		return result; 
	}
	
	
}