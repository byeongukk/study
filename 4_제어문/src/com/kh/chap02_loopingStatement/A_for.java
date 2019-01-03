package com.kh.chap02_loopingStatement;

import java.util.ArrayList;
import java.util.Scanner;

public class A_for {
	Scanner scan = new Scanner(System.in);
	public void testFor() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + "번째 반복문 실행중");
		}
	}
	public void testFor2() {
		//정수를 하나 입력받아 그 수가 양수일 때만 그 수의 구구단을 출력
		//양수가 아니면 "반드시 1~9 사이의 양수를 입력해야 합니다."
		
		System.out.println("1~9사이의 양수를 입력하세요");
		int dan = scan.nextInt();
		
		if(dan > 0 && dan >= 1 && dan <= 9) {
/*			System.out.println(dan + " *  1 " + (dan*1));
			System.out.println(dan + " *  2 " + (dan*2));
			System.out.println(dan + " *  3 " + (dan*3));
			System.out.println(dan + " *  4 " + (dan*4));
			System.out.println(dan + " *  5 " + (dan*5));
			System.out.println(dan + " *  6 " + (dan*6));
			System.out.println(dan + " *  7 " + (dan*7));
			System.out.println(dan + " *  8 " + (dan*8));
			System.out.println(dan + " *  9 " + (dan*9));*/
			for(int su = 1; su < 10; su++) {
				System.out.println(dan + " * " + su + " = " + (dan*su));
			}
		} else {
			System.out.println("반드시 1~9사이의 양수를 입력");
		}
		
	}
	public void testFor4() {
		//두 수를 입력받아 작은 수부터 큰 수까지의 합계를 구하여 출력
		
		System.out.println("첫 번째 정수 입력 :");
		int num1 = scan.nextInt();
		System.out.println("두 번째 정수 입력 : ");
		int num2 = scan.nextInt();
		
		int sum = 0, max, min;
		if(num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		for(int i = min; i <= max; i++) {
			sum +=i;
		}
		System.out.println(min + "에서 " + max + "까지의 정수들의 합계" + sum);
	}
	public void testFor5() {
		//for문 안에서 for문을 사용할 수 있다.
		//예 : 구구단 2단부터 9단까지 출력
		
		//전체를 반복하는 for문
		for(int dan = 2; dan < 10; dan++) {
			//구구단 한 단을 출력하는 반복문
			for(int su = 1; su <10; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			System.out.println();
		}
	}
	public void testFor6() {
		//아놀로그 시계 출력
		for(int hour = 0; hour < 24; hour++) {
			for(int min = 0; min < 60; min++) {
				System.out.println(hour + "시" + min + "분");
			}
			System.out.println();
		}
	}
	public void testFor7() {
		//한 줄에 '*'문자를 5개씩 출력하는 것을
		//입력받은 줄 수 만큼 반복하여 출력
		//예) 3입력
		//***** x3줄
		System.out.println("출력할 줄 수 :");
		int line = scan.nextInt();
		for(int i=0; i<line; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void testFor8() {
		//한 줄에 별표 문자를 입력한 줄 수와 칸 수만큼 출력
		//단, 줄수와 칸수가 일치하는 위치에는 줄 번호에 대한 정수가 출력
		//1*****
		//*2****
		//**3***
		//***4**
		//****5*
		//*****6
		
		System.out.println("줄 수 입력 : ");
		int row = scan.nextInt();
		System.out.println("칸 수 입력 : ");
		int col = scan.nextInt();
		
		for(int i = 1; i<=row; i++) {
			for(int j = 1; j<=col; j++) {
				if(j==i) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public void testFor9() {
		//입력받은 줄 수만큼 삼각형으로 별을 출력
		//단, 마지막 별은 줄 수가 출력되게 하세요
		
		// 1
		// *2
		// **3
		// ***4 ...
		
		System.out.println("줄 수 입력 : ");
		int row = scan.nextInt();
		
		for(int i = 1; i<=row; i++) {
			for(int j = 1; j <= i; j++) {
				if(i==j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}
	public void bu_for1() {
		System.out.println("정수 하나 입력 : ");
		int num = scan.nextInt();
		int sum = 0;
		for(int i=0; i<=num; i+=2) {
			sum += i;
		}
		System.out.println(num + "까지 짝수 합은" + sum);
	}
	public void bu_for2() {
		System.out.println("정수 하나 입력 : ");
		int num = scan.nextInt();
		int sum = 0;
		for(int i=0; i<=num; i++) {
			if(i % 5 == 0) {
				sum+= i;
			}
		}
		System.out.println(num + "까지 5의 배수 합은 : " + sum);
	}
	public void bu_for3() {
		System.out.println("줄 수를 입력하세요 : ");
		int row = scan.nextInt();
		for(int i=0; i<row; i++) {
			for(int j=row; j>i; j--) {
					System.out.print("*");
			}
			System.out.println();
		}
	}
	public void codingDojang1() {
		System.out.println("양의 정수를 입력 : ");
		String num = scan.nextLine();
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Character> chArr = new ArrayList<>();
		for(int i = 0; i<num.length(); i++) {
			chArr.add(num.charAt(i));
			
		}
		System.out.println(arr.add(1));
		
	}
	public void sangUnfor1() {
		int num,sum=1;
		
		System.out.println("정수 하나 입력 : ");
		num = scan.nextInt();
		for(int i = 1; i<=num; i++) {
			sum *= i;
			System.out.println(i);
		}
		System.out.println(num + "까지곱한 값은 " + sum);
	}
	public void sangUnfor2() {
		int num=0,even=0,odd=0;
		System.out.println("정수 하나 입력");
		num = scan.nextInt();
		for(int i=1; i<=num; i++) {
			if(i%2 == 0) {
				even += i;
			} else {
				odd += i;
			}
		}
		System.out.println(num + "까지 짝수만 더한 값 : "+ even);
		System.out.println(num + "까지 홀수만 더한 값 : "+ odd);
	}
	public void sangUnfor3() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(i==0||i==3) {
					System.out.print("*");
				} else {
					if(j==1||j==2) {
						System.out.print("0");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
	public void yerangfor1() {
		int sum=0;

		System.out.println("첫번째 정수 입력");
		int num1 = scan.nextInt();
		System.out.println("두번째 정수 입력 ");
		int num2 = scan.nextInt();
		System.out.println("범위를 정해주세요 :");
		int lastNum = scan.nextInt();
	
		for(int i = 0; i<lastNum; i++) {
			sum += (num1+num2);
			System.out.println(num1+" + "+num2+" = " + sum);
		}
	}

}
