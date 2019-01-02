package com.kh.chap01_decisionMarkingStatement;

import java.util.Scanner;

public class D_switch {
	//변수 값을 case에서 찾아 명령을 수행하는 조건문이다.
	//해당하는 값이 없을 경우에는 default의 명령문을 수행한다.
	
	//case와 명령문 사이에는 콜론(:)을 써야한다.
	//break가 없으면 멈추지 않고 계속 수행한다.
	
	//[표현식]
	//switch(변수){
	// case 1 : 실행문1; break;
	// case 2 : 실행문2; break;
	// default : 실행문3; return;
	//}
	Scanner scan = new Scanner(System.in);
	public void testSwitch() {
		//정수 두 개와 연산기호 문자 1개를 입력받아서
		//연산기호문자에 해당하는 계산을 수행하고 출력하세요
		int num1,num2;
		char op;
		System.out.println("첫 번째 값 : ");
		num1 = scan.nextInt();
		System.out.println("두 번째 값 : ");
		num2 = scan.nextInt();
		System.out.println("연산자(+,-,*,/,%) : ");
		op = scan.next().charAt(0);
		
		int result = 0;
		
		switch(op) {
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case '*' : result = num1 * num2; break;
			case '/' : result = num1 / num2; break;
			case '%' : result = num1 % num2; break;
			default : System.out.println("잘못 된 값을 입력하셨습니다");
		}
		System.out.printf("연산한 값은 %d 입니다",result);
	}
	public void testSwitch2() {
		//1~12월 까지 입력받아 해당하는 달의 마지막 날짜를 출력하세요
		System.out.println("1월~12월까지 중 하나를 입력하세요");
		int month = scan.nextInt();
		
		switch(month) {
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 :
			case 12 :
				System.out.println(month + "월은 31일 까지입니다");
			break;
			case 4 : case 6 : case 9 : case 11 :
				System.out.println(month + "월은 30일 까지입니다");
			break;
			case 2 : 
				System.out.println(month + "월은 28일 혹은 29일 까지입니다");
			break;
			default : System.out.println("반드시 1~12월까지 입력을 해주셔야합니다");
		}
	}
}
