package com.kh.chap01_decisionMarkingStatement;

import java.util.Scanner;

public class ifPractice {

	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		ifElseTest();
	}
	public static void ifElseTest() {
		int random1 = (int)(Math.random()*10)+1;
		int random2 = (int)(Math.random()*10)+1;
		int random3 = (int)(Math.random()*10)+1;
		
		System.out.println("철수 의 값 : " + random1);
		System.out.println("영희 의 값 : " + random2);
		System.out.println("민수 의 값 : " + random3);
		
		if((random1==random2)&&(random2==random3)&&(random1==random3)) {
			System.out.println("셋이 비겼습니다");
		} else {
			if((random1>random2)&&(random1>random3)) {
				System.out.println("철수가 이겼습니다");
			}
			if((random2>random1)&&(random2>random3)) {
				System.out.println("영희가 이겼습니다");
			}
			if((random3>random1)&&(random3>random2)) {
				System.out.println("민수가 이겼습니다");
			}
			else {
				if((random1==random2)&&(random1>random3)) {
					System.out.println("철수와 영희가 비겼습니다");
				}
				if((random1==random3)&&(random1>random2)) {
					System.out.println("철수와 민수가 비겼습니다");
				}
				if((random2==random3)&&(random3>random1)) {
					System.out.println("영희와 민수가 비겼습니다");
				}
			}
		}
		
	}

}
