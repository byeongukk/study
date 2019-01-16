package com.kh.chap04_constructor.user.model.vo;

import java.util.Date;

public class User {
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	//생성자 사용 목적
	//1. 객체를 생성해 주기 위한 목적
	//2. 매개변수로 전달받은 값으로 필드를 초기화 할 목적
	
	//생성자 사용시 주의사항
	//1. 반드시 클래스 이름과 동일해야 한다(대/소문자 구분)
	//2. 리턴형이 존재하지 않는다(void, int, char ...)
	
	//기본생성자 -> 필드의 초기화 역할은 수행하지 못하고 객체만 생성할 때 사용한다.
	//매개변수 있는 생성자의 경우 자동 생성되지 않기 때문에 반드시 명시해야한다.
	public User() {}
	
	//같은 이름의 생성자 혹은 메소드를 작성하는 경우 에러가 발생한다.
	//public User() {}
	
	
	//매개변수 있는 생성자 -> 객체 생성과 필드를 초기화하는 두 가지 목적으로 사용된다
	//같은 이름의 생성자 혹은 메소드를 사용하려고 하는 경우 오버로딩을 사용한다.
	public User(String userId,String userPwd, String userName) {
		//this. 은 메소드 내에 숨겨진 채 존재하는 레퍼런스 변수로,
		// 할당된 객체 자신을 의미한다
		//지역변수와 필드의 이름이 동일한 경우 지역변수가 우선시 되기 때문에
		//필드를 구분하기 위해서 반드시 this.을 명시해 주어야한다.
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	public User(String userId,String userPwd,String userName,Date enrollDate) {
/*		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;*/
		//중복되는 동일한 초기화 하는 내용의 생성자가 존재하는경우 
		//this()를 사용하여 중복을 제거할 수 있다.
		//반드시 첫줄에 작성해야함
		this(userId, userPwd, userName);
		this.enrollDate = enrollDate;
	}
	
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	
	public void information() {
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
