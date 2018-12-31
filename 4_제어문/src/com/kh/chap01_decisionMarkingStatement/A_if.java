package com.kh.chap01_decisionMarkingStatement;

import java.util.Scanner;

public class A_if {
	Scanner scan = new Scanner(System.in);
	public void testIf() {
		//단독 if문
		//조건식의 결과 값이 참(true)이면 { } 안에 있는 코드를 실행하고,
		//조건식의 결과 값이 거짓(false)이면 { } 안에 있는 코드를 무시하고 넘어감
		
		//[표현식]
		//if(조건식) {
		//	실행코드
		//}
		System.out.println("순자 한 개 입력 : ");
		int num = scan.nextInt();
		
		if(num%2 == 0) {
			//결과가 참일때 수행함
			System.out.println("입력하신 숫자는 짝수입니다");
		} 
		if (num%2 != 0) {
			//결과가 참일 때 수행함
			System.out.println("입력하신 숫자는 홀수입니다");
		}
		
		//조건과 상관 없이 실행
		System.out.println("프로그램 종료");
		
	}
}
