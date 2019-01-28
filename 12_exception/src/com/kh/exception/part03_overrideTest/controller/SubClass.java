package com.kh.exception.part03_overrideTest.controller;

import java.io.FileNotFoundException;

public class SubClass extends SuperClass {
	
	//같은 레벨의 예외는 오버라이딩 성립 가능
/*	@Override
	public void method() throws IOException {}*/
	
	//부모의 예외처리 클래스보다 상위의 예외로는 후손클래스에서 오버라이딩 할수없다
	/*@Override
	public void method() throws Exception {}*/
	
	//부모의 예외처리 클래스의 더 하위(더 구체적인 예외 상황)인 경우
	//오버라이딩 할 수 있다.
	@Override
	public void method() throws FileNotFoundException {}
	
	
}
