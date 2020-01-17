/**
  * @FileName : AdminDao.java
  * @Project : StoreMaven
  * @Date : 2020. 1. 10. 
  * @작성자 : song
  * @변경이력 :
  * @프로그램 설명 :
  */
package com.nemew.blog.admin.dao;

import com.nemew.blog.admin.model.AdminModel;

public interface AdminDao {
	
 	public String getDb2Dual() throws Exception;

	//메인테이블 max id값 
	public int maxIdNum();
	
	//메인테이블 max 시퀀스 값
	public String maxUserSeq();
	
	//디테일 테이블 max id 값
	public int maxDetailId();
	
	//게시물 등록
	public boolean adminInsertPost(AdminModel vo) throws Exception;

	//게시물 이미지 등록
	public boolean adminInsertImg(AdminModel vo) throws Exception;
	
	
}