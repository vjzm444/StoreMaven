package com.nemew.blog.admin.model;
/**
 * @FileName : AdminModel.java
 * @Project : StoreMaven
 * @Date : 2019. 12. 24. 
 * @작성자 : song
 * @변경이력 : 
 * @프로그램 설명 : 매핑되는 DB컬럼
 */
import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("adminModel")
public class AdminModel {

	//Shop 메인 테이블
	public int id;
	public String up_seq;	//고유번호
	public String user_id;	//유저아이디
	public String title;	//상품 타이틀
	public String content;	//상품 내용
	public String email;	//이메일
	public String reg_date;	//등록날짜
	public String imgYn;	//이미지존재여부
	public String price;	//상품가격
	public String category;	//카테고리 분류
	public String recommend;// 추천여부
	
	
	//Shop Detail 테이블
	public String img_cnt;	//이미지 갯수
	public int img_cnt_v2;	//이미지 갯수
	public String img_url;	//이미지 url
	public String division;	//대소분류 구분
	
	
	//장바구니
	public String size;		//상품 사이즈
	public String color;	//상품색상
	public String cnt;		//상품색상
	
	
	
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUp_seq() {
		return up_seq;
	}
	public void setUp_seq(String up_seq) {
		this.up_seq = up_seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getImgYn() {
		return imgYn;
	}
	public void setImgYn(String imgYn) {
		this.imgYn = imgYn;
	}
	public String getImg_cnt() {
		return img_cnt;
	}
	public void setImg_cnt(String img_cnt) {
		this.img_cnt = img_cnt;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getRecommend() {
		return recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCnt() {
		return cnt;
	}
	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
	public int getImg_cnt_v2() {
		return img_cnt_v2;
	}
	public void setImg_cnt_v2(int img_cnt_v2) {
		this.img_cnt_v2 = img_cnt_v2;
	}
	
	
	
	
	
	
	
}