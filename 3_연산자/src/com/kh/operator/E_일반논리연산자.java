package com.kh.operator;

import java.util.Scanner;

public class E_일반논리연산자 {
	//&&(그리고, ~면서) : 11순위
	//||(~이거나,또는)  : 12순위
	//논리값 && 논리값 , 논리값 || 논리값
			
	public void opTest1() {
		// 1 <= 변수 <= 100 XXX
		// 1 <= 변수 && 변수 <=100 OOO
		Scanner scan = new Scanner(System.in);
	/*	System.out.println("정수값을 입력");
		int num = scan.nextInt();
		System.out.println("1부터 100사이인지 확인 : " + (1 <= num && num <= 100));*/
		
		System.out.println("알파벳 하나 입력 : " );
		char ch = scan.nextLine().charAt(0);
		
		System.out.println("입력받은 알파벳은 : " + (ch >= 'A' && ch <= 'Z'));
		System.out.println("계속 하시려면 y 혹은 Y를 입력하세요 : ");
		char ch2 = scan.nextLine().charAt(0);
		System.out.println("영문자 y 확인 : " + ( ch2 == 'y' || ch == 'Y'));
		
	}
	public void opTest2() {
		//논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 x
		//논리식 || 논리식 : 앞의 결과가 true면 뒤를 실행 x
		int num = 10;
		
		//앞의 결과가 false 이여서 뒤에 ++num이 실행 안함
		int result = (false && ++num > 0) ? num : num;
		System.out.println(result);
		
		//앞의 결과가 true 이여서 뒤에 +num이 실행 안함
		result = (true || ++num > 0)? num : num;
		System.out.println(result);
		
		
	}
	
	public static void main(String[] arsg) {
		E_일반논리연산자 test = new E_일반논리연산자();
		//test.opTest1();
		test.opTest2();
	}
}
