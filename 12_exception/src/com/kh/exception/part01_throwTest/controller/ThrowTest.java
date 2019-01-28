package com.kh.exception.part01_throwTest.controller;

public class ThrowTest {
	public void methodA() throws Exception {
		System.out.println("methodA() 호출됨...");
		
		methodB();
		
		System.out.println("methodA() 종료됨...");
	}
	
	public void methodB() throws Exception {
		System.out.println("methodB() 호출됨...");
	
		methodC();
		
		System.out.println("methodB() 종료됨...");
	}
	public void methodC() throws Exception {
		System.out.println("methodC() 호출됨...");
		
		//에러발생구문
		throw new Exception();
		
		
		//에러가 발생시키면 비정상적으로 종료되기 떄문에
		//아래 내용이 실행되지 않아 오류 발생함 
		//System.out.println("methodC() 종료됨...");
	}
	
	
	
}




















