package com.kh.silsub1.member.model.vo;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member() {} //기본 생성자
	
	//setter 메소드
	//필드값 변경을 위해 사용하는 메소드
	//괄호 안에 선언된 변수를 매개변수라고 하며,
	//전달받은 매개변수 값으로 필드값을 변경한다.
	public void setMemberId(String memberId) {
		//필드명과 지역변수가 같은 이름이면 지역변수가 우선권을 가지기 떄문에
		//같은 이름의 필드를 사용할 때는 this.을 명시해주어야한다
		//memberId = memberId; 
		this.memberId = memberId;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//getter메소드
	//필드에 직접 접근해서 값을 알 수 없기 때문에, 해당 객체가 가진 값을 알고 싶을때에는
	//getter메소드를 사용한다 
	public String getMemberId() {
		return memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	
	
	
	
	
	
	
}
