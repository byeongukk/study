package com.kh.home.view;
import java.util.Scanner;
import com.kh.home.controller.*;
public class Menu {
	static Scanner scan = new Scanner(System.in);
	public static void displayMenu() {
		Function ft = new Function();
		System.out.println("*** 지역변수/연산자/제어문 연습 프로그램 ***");
		boolean run = true;
		do {
			System.out.println("******************");
			System.out.println("1. 간단 계산기");
			System.out.println("2. 작은수에서 큰수까지 합계구하기");
			System.out.println("3. 신상정보 확인하기");
			System.out.println("4. 학생정보 확인하기");
			System.out.println("5. 별과 숫자 출력하기");
			System.out.println("6. 난수까지의 합계 구하기");
			System.out.println("7. 구구단");
			System.out.println("8. 주사위 숫자 알아맞추기 게임");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 입력 : ");
			int menuSelect = scan.nextInt();
			switch(menuSelect) {
				case 1 : ft.calculator(); break;
				case 2 : ft.totalCalculator(); break;
				case 3 : ft.profile(); break;
				case 4 : ft.sugjuk(); break;
				case 5 : ft.printStarNumber(); break;
				case 6 : ft.sumRandomNumber(); break;
				case 7 : ft.continueGugudan(); break;
				case 8 : ft.shutNumber(); break;
				case 9 : run = false; break;
			}
		} while(run);
	}
}
