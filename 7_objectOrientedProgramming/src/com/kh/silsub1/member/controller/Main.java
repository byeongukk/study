package com.kh.silsub1.member.controller;

import com.kh.silsub1.member.model.vo.Member;

public class Main {

	public static void main(String[] args) {
		Member m = new Member();
		
		
		

		
		//setter로 값 변경
		m.setMemberId("user01");
		m.setMemberPwd("pass01");
		m.setMemberName("홍길동");
		m.setAge(20);
		m.setGender('M');
		m.setPhone("010-2332-23125");
		m.setEmail("hohoh@naver.com");
		
		//현재 멤버 객체의 값 출력
		System.out.println("memberId : " + m.getMemberId());
		System.out.println("memberpwd :" + m.getMemberPwd());
		System.out.println("memberName : " + m.getMemberName());
		System.out.println("age : " + m.getAge());
		System.out.println("gender : " + m.getGender());
		System.out.println("phone : " + m.getPhone() );
		System.out.println("email : " + m.getEmail());
		
		
	}

}
