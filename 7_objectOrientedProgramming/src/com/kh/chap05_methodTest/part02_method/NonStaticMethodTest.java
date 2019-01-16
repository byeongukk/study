package com.kh.chap05_methodTest.part02_method;

public class NonStaticMethodTest {
	//매개변수 유무와 반환값 유무에 따른 구분
	
	//1. 매개변수 없고 반환값 없는 메소드
	public void method1() {
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드 입니다");
	
		return; //모든 메소드 내에 생략이 되어있다(jvm이 자동 생성)
	}
	//2. 매개변수가 없고 반환값이 있는 메소드
	public String method2() {
		return "매개변수가 없지만 반환값이 있는 메소드입니다.";
	}
	//3. 매개변수가 있고 반환값이 없는 메소드
	public void method3(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("sum : " + sum);
	}
	//4. 매개변수가 있고 반환값이 있는 메소드
	public int method4(int num1, int num2) {
		//리턴값으로 메소드 선언시 지정한 리턴타입과
		//일치하는 자료형 값을 return 해 주어야 한다
		return num1 + num2;
	}
	
	
	
	
}
