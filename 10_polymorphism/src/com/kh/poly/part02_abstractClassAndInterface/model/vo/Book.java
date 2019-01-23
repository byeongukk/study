package com.kh.poly.part02_abstractClassAndInterface.model.vo;

import java.io.Serializable;

//인터페이스 상속의 경우 implements 키워드를 사용한다
//extends 단일상속만 지원하지만
//implements는 다중상속을 지원한다.
public class Book extends Product/*,Date*/ implements IProduct, Serializable{

	public Book() {}

	public void printBook() {
		System.out.println("Book 클래스의 printBook() 메소드 호출...");
	}
	
	@Override
	public String toString() {
		return "Book클래스의 toString() 메소드 실행..";
	}
	
	
	@Override
	public void abstMethod() {
		
	}
	
	//인터페이스 추상메소드 오버라이딩 시 반드시 public으로 접근제한자를  설정해야한다
	@Override
	public void abstImethod() {
		
	}

}
