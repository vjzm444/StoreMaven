package com.nemew.blog.admin.service;
/**
 * @FileName : AdminService.java
 * @Project : StoreMaven
 * @Date : 2019. 12. 24. 
 * @작성자 : song
 * @변경이력 : 
 * @프로그램 설명 : admin페이지의 서비스 
 */
import java.util.List;
import org.springframework.stereotype.Service;
import com.nemew.blog.admin.model.AdminModel;

public interface AdminService {
	
	public String getDb2Dual() throws Exception;
	
	//메인테이블 최고 id값 구하기
	public int maxIdNum();
	
	//메인테이블 최고 시퀀스 구하기
	public String maxUserSeq();
	
	//디테일테이블 최고 id값 구하기
	public int maxDetailId();

	//게시물 업데이트
	public boolean adminInsertPost(AdminModel vo) throws Exception;
	
	//게시물 이미지 업데이트
	public boolean adminInsertImg(AdminModel vo) throws Exception;
	
	
	
	
	
	
}