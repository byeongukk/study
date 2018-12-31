package com.kh.example;

import java.util.Scanner;

public class Example {
	Scanner scan = new Scanner(System.in);
	public void example1() {
		
		System.out.println("첫번째 정수를 입력해 주세요 :");
		int num1 = scan.nextInt();
		System.out.println("두번째 정수를 입력해 주세요 :");
		int num2 = scan.nextInt();
		
		System.out.println("두 수의 합 : " + (num1 + num2));
		System.out.println("두 수의 차 : " + (num1 - num2));
		System.out.println("두 수의 곱 : " + (num1 * num2));
		System.out.println("두 수의 나눈 값 : " + (num1 / num2));
		System.out.println("두 수의 나눈 나머지 몫: " + (num1 % num2));
		
	}
	public void example2() {
		
		System.out.println("가로 값을 소수점으로 적어주세요 : ");
		double width = scan.nextDouble();
		System.out.println("세로 값을 소수점으로 적어주세요 : ");
		double height = scan.nextDouble();
		
		System.out.println("면적 : " + width * height);
		System.out.println("둘레 : " + (width+height)*2);
	}
	public void example3() {
		int num;
		System.out.println("문자열을 입력하시오  : ");
		String str = scan.nextLine();
		System.out.println("가져오고싶은 문자열 순서를 입력하세요 : ");
		num = scan.nextInt()-1;
		System.out.println(str.charAt(num)+ " 번째 문자 : " + str.charAt(num));
		System.out.println("가져오고싶은 문자열 순서를 입력하세요 : ");
		num = scan.nextInt()-1;
		System.out.println(str.charAt(num)+ " 번째 문자 : " + str.charAt(num));
		System.out.println("가져오고싶은 문자열 순서를 입력하세요 : ");
		num = scan.nextInt()-1;
		System.out.println(str.charAt(num)+ " 번째 문자 : " + str.charAt(num));
	}
	
}
