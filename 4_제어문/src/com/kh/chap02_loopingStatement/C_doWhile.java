package com.kh.chap02_loopingStatement;

import java.util.Scanner;

public class C_doWhile {
	Scanner scan = new Scanner(System.in);
	public void testDoWhile() {
		//키보드로 영어 문자열 값을 입력받아 출력 반복 실행
		//단, exit 문자열이 입력되면 반복문을 종료함
		String str = null;
		
		do {
			System.out.println("문자열 입력 : ");
			str = scan.next();
			System.out.println(">" + str);
		} while(!str.equals("exit"));
	}
	public void testDoWhile2() {
		String str = null;
		do {
			System.out.println("문자열 입력 : ");
			str = scan.nextLine();
			if(str.equals("exit")) break;
			System.out.println("str : " + str);
		}while(true);
		
	}
}
