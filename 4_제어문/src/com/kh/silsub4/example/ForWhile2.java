package com.kh.silsub4.example;

import java.util.Scanner;

public class ForWhile2 {
	Scanner scan = new Scanner(System.in);
	public void pdfExample() {
		int num;
		int sum=0;
		System.out.println("정수 한 개 입력 : ");
		num = scan.nextInt();
		for(int i = 0; i<=num; i+=2) {
			sum += i;
		}
		System.out.println("1부터 "+ num + "까지 짝수를 더한 값 : "+ sum);
		
		
	}
	public void pdfExample2() {
		int num ;
		int i=0;
		int sum = 0;
		System.out.println("정수 한개 입력 :");
		num = scan.nextInt();
		while(i<=num) {
			sum += i ;
			i+=2;
		}
		System.out.println(sum);
	}
}
