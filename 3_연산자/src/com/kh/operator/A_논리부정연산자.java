package com.kh.operator;

import java.util.Scanner;

public class A_논리부정연산자 {
	
	public static void testMethod() {
		//!논리값 : 논리값을 반전시키는 연산자
		//!true => false, !false => true가 된다.
		
		System.out.println("true의 부정 : " + !true);
		System.out.println("false의 부정 : " + !false);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수값을 입력하세요 : ");
		int num = scan.nextInt();
		
		System.out.println("입력받은 값이 짝수인가 ?: " + (num % 2 == 0));
		System.out.println("입력받은 값이 짝수인가 ?: " + !(num % 2 != 0));
		
		System.out.println("입력받은 값이 양수인가 ?: " + (num > 0));
		System.out.println("입력받은 값이 양수인가 ?: " + !(num < 0));
	}
	
	public static void main(String[] args) {
		//static 메소드를 호출할 때는 new를 사용하지 않는다.
		//클래스명.메소드명()으로 호출한다.
		A_논리부정연산자.testMethod();
		testMethod();
	}

}
