package com.kh.chap01_decisionMarkingStatement;

import java.util.Scanner;

public class B_ifElse {
	//둘 중 한 개를 선택하는 조건문으로, 조건이 참인 경우와 거짓인 경우 수행하는
	//명령을 따로 작성하는 경우에 사용한다.
	
	//[표현식]
	//if(조건식){
	//	조건식이 참일때 수행할 내용
	//}else{
	// 	조건식이 거짓일 때 수행할 내용
	//}
	Scanner scan = new Scanner(System.in);
	//else에는 조건식을 사용하지 못함(if의 조건식이 거짓이면 무조건 else 블럭의 코드실행
	public void testIfElse() {
		//숫자를 하나 입력받아 홀수 짝수인지 출력
		System.out.println("정수 하나 입력하세요 : ");
		int num = scan.nextInt();
		if(num % 2 == 0) {
			//조건이 참일 때 수행할 구문 작성
			System.out.println(num + "은 짝수 입니다");
		} else {
			// 조건이 거짓일 때 수행할 구문 작성
			System.out.println(num + "은 홀수 입니다");
		}
		
	}
	public void testIfElse2() {
		//숫자를 하나 입력받아 양수인지 음수인지 출력
		//단, 0이면 "0입니다 라고 출력"
		System.out.println("정수 하나 입력하세요 : ");
		int num = scan.nextInt();
		if(num != 0) {
			if(num > 0) {
				System.out.println("입력하신 숫자는 양수입니다");
			} else {
				System.out.println("입력하신 숫자는 음수입니다");
			}
		}else {
			System.out.println("입력하신 숫자는 0 입니다.");
		}
	}
	public void testIfElse3() {
		//정수 두 개를 입력받아, 두 수의 산술연산을 처리해서 출력하시오
		//단, 두 수 모두 반드시 1부터 100사이의 값이어야 하고
		//둘중 하나라도 범위에 속하지 않으면
		//"값은 1부터 100사이어야 합니다." 출력되게 할 것
		
		int num1,num2;
		System.out.println("첫번째 숫자를 입력하세요");
		num1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		num2 = scan.nextInt();
		
		if((num1>=1 && num1<=100) && (num2>=1 && num1<=100)) {
			System.out.println("두 수의 합은 : " + (num1 + num2));
			System.out.println("두 수의 곱은 : " + (num1 * num2));
			System.out.println("두 수의 빼기는 : " + (num1 - num2));
			System.out.println("두 수의 나누기는 : " + (num1 / num2));
			System.out.println("두 수를 나눈 몫은 : " + (num1 % num2));
		} else {
			System.out.println("두 수 모두 1부터 100사이의 값이어야 합니다");
		}
		
		
	}
}
