package com.kh.chap05_methodTest.part02_method;

public class Run {

	public static void main(String[] args) {
		NonStaticMethodTest test = new NonStaticMethodTest();
		
		//매개변수와 반환값이 없는 메소드 호출의 경우
		//test.method1();
		
		//매개변수가 없고 반환값이 있는 메소드 호출의 경우
		/*String result = test.method2();
		System.out.println(result);*/
		/*System.out.println(test.method2());*/
	
		//매개변수가 있고 반환값이 없는 메소드 호출의 경우
		//반드시 인자로 매개변수의 타입, 갯수, 순서가 일치해야한다
		/*test.method3(10, 20);*/
		
		//매개변수가 있고 반환값이 있는 메소드의 호출의 경우
		/*int result = test.method4(10, 20);
		System.out.println(result);*/
		System.out.println(test.method4(10,20));
		
	}

}
