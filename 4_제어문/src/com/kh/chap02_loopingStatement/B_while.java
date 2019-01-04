package com.kh.chap02_loopingStatement;

import java.util.Scanner;

public class B_while {
	Scanner scan = new Scanner(System.in);
	public void testWhile() {
		int i = 0;
		while(i<=5) {
			System.out.println(i + "번째 반복문 수행중");
			i++;
		}
	}
	public void testWhile2() {
		//문자열을 입력받아 인덱스별로 문자를 출력하세요
		System.out.println("문자열 입력 : ");
		String str = scan.nextLine();
		
		int index = 0;
		while(index < str.length()) {
			char ch = str.charAt(index);
			System.out.println(index + " : " + ch);
			index++;
		}
	}
	public void testWhile3() {
		//1부터 입력받은 수 까지의 정수의 합
		int sum = 0;
		System.out.println("정수 하나를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		
		int i = 1;
		while(i <= num) {
			sum += i;
			if(i != num) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}
			i++;
		}
		System.out.println(sum);
	}
	public void testWhile4() {
		//while문을 이용하여 구구단 2단부터 9단까지 출력
		int dan=2;
		int su=0;
		int result=0;
		
		while(dan<=9) {
			System.out.println(dan + "단");
			su=1;
			while(su<=9) {
				result = dan*su;
				System.out.println(dan + " * " + su + " = " + result);
				su++;
			}
			dan++;
		}
		
		
	}
	public void testWhile5() {
		int num1,i=1,j;
		System.out.println("줄 수 입력 : ");
		num1 = scan.nextInt();
		
		while(i<=num1) {
			j=1;
			while(j<=num1) {
				if(j==i) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
				j++;
			}
			System.out.println();
			i++;
		}
		
		
	}

}
