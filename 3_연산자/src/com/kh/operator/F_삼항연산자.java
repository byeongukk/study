package com.kh.operator;

import java.util.Scanner;

public class F_삼항연산자 {
	//항목이 3개임 : (조건식)? 참일때 사용할 값 : 거짓일때 사용할 값
	//조건식은 결과값이 ture 나 false 이어야 함
	// 비교/논리 연산자가 주로 사용됨
	public void opTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 하나 입력 : ");
		int num = scan.nextInt();
		
		//String result = (num > 0)?"양수다." : "양수가 아니다.";
		//중첩 사용도 가능하다
		String result = (num > 0) ?"양수다":(num==0)?"0이다":"음수다";
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		F_삼항연산자 test = new F_삼항연산자();
		test.opTest();
	}

}
