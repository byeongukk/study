package com.kh.chap03_branchingStatement;

import java.util.Scanner;

public class A_break {
	Scanner scan = new Scanner(System.in);
	public void breakTest() {
		//break문은 반복문 내에서만 사용할 수 있음
		//단, switch문에서 예외로 사용됨
		//일반적으로는 if(조건식) break; 사용됨
		
		//문자열을 입력받아 글자 갯수를 출력하는 반복 프로그램
		//단, "end"가 입력되면 반복 종료
		//do~while
		
		String str = null;
		do {
			System.out.println("문자열 입력 : ");
			str = scan.nextLine();
			if(str.equals("end")) break;
			
			System.out.println(str +" 의 문자 갯수 "+ str.length());
			
		}while(true);
		
	}
	public void breakTest2() {
		//숫자를 하나 입력받아 입력받은 정수까지의 합을 구하시오
		System.out.println("숫자를 하나 입력하세요 : ");
		int num = scan.nextInt();
		
		int sum = 0;
		
		for(int i = 0; ; i++) {
			sum += i;
			
			if(i == num) break;
		}
		
		System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다");
		
	}
}
