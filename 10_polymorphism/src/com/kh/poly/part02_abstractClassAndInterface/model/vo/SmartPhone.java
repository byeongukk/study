package com.kh.poly.part02_abstractClassAndInterface.model.vo;

public class SmartPhone extends Product {

	public SmartPhone() {}
	
	
	//상속받은 부모의 추상메소드는 반드시 오버라이딩 해야 한다.
	@Override
	public void abstMethod() {
		
	}
	
	public void printSmartPhone() {
		System.out.println("SmartPhone클래스의 printSmartPhone 메소드 출력..");
	}
	
	@Override
	public String toString() {
		return "SmartPhone 클래스의 toString() 메소드 실행...";
	}
	
	
}
