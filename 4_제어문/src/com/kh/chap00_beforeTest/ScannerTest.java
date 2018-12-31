package com.kh.chap00_beforeTest;

import java.util.Scanner;

public class ScannerTest {
	Scanner scan = new Scanner(System.in);
	public  void testScanner() {
		//java.util.Scanner 클래스의 next(), nextLine()테스트
		//next() : 공백이 없는 연속된 문자열의 값 입력시 사용
		//nextLine() : 공백이 포함된 문자열 값 입력시 사용
		
		System.out.println("문자열 입력 : ");
		String str = scan.next();
		System.out.println("str : " + str);
		
		scan.nextLine();
		
		System.out.println("정수 하나 입력 : " );
		int num = scan.nextInt();
		System.out.println("num : " + num);
		
		scan.nextLine();
		
		System.out.println("공백이 있는 문자열을 입력하세요 : ");
		String str2 = scan.nextLine();
		System.out.println("str2 : " + str2);
		
	}
	public static void main(String[] args) {
		ScannerTest test = new ScannerTest();
		test.testScanner();
	}

}
