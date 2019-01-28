package com.kh.exception.part04_userException.exception;


//사용자 정의의 예외 클래스 만들기
//Exception 클래스를 상속받아 구현한다.
public class MyException extends Exception{
	
	public MyException() {}
	
	//Exception 클래스 생성시 메세지를 전달하여 예외 객체를 생성하는 생성자
	public MyException(String msg) {
		super(msg);
	}

}
