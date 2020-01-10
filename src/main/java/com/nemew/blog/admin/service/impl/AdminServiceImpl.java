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
    
	
	
	
	
	
}