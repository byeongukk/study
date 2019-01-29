package com.kh.io.part04_objectStream.model.vo;

//MVC 디자인 패턴 : Model view controller
//Model의 vo(value object)에 해당하는 클래스
//vo : 여러 타입의 비슷한 속성을 하나로 묶어 놓은 클래스로,
//		주로 데이터를 묶어 전속하기 위해 사용한다.
//vo == dto(data transfer object) == do(domain object) == entity

//vo가 되기 위한 조건
//1. 모든 필드는 반드시 private이어야 한다.
//2. 모든 필드에 대한 set/getter가 작성되어 있어야 함
//3. 반드시 기본생성자와 매개변수 있는 생성자를 가지고 있어야함
//4. 반드시 직렬화 처리를 해야 함

//객체로 입출력을 하기 위해서는 반드시 직렬화 처리를 해야한다.

public class Member implements java.io.Serializable{
	private String userId;
	private String userPwd;
	private String userName;
	private String email;
	private int age;
	private char gender;
	//transient 키워드는 직렬화에서 제외한다.
	private /*transient*/ double point;
	
	public Member() {}

	public Member(String userId, String userPwd, String userName, String email, int age, char gender, double point) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.point = point;
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

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public double getPoint() {
		return point;
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

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + ", email=" + email
				+ ", age=" + age + ", gender=" + gender + ", point=" + point + "]";
	}

	
	
}
