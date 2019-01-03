package com.kh.example;

import java.util.Scanner;

public class Munjae {
	Scanner scan = new Scanner(System.in);
	public void test1() {
		int kor,en,ma,sum,avg;
		System.out.println("국어 점수 : ");
		kor = scan.nextInt();
		System.out.println("영어 점수 : ");
		en = scan.nextInt();
		System.out.println("수학 점수 : ");
		ma = scan.nextInt();
		sum = kor+en+ma;
		avg = sum/3;
		
		if(kor>=40 && en>=40 && ma>=40 && avg>=60 ) {
			System.out.println("합격!");
			System.out.println("국어 점수는 "+ kor);
			System.out.println("영어 점수는 "+ en);
			System.out.println("수학 점수는 "+ ma);
			System.out.println("평균 점수는 "+ avg);
		} else {
			System.out.println("불합격 ㅠ");
		}
	}
	public void test2() {
		int menu;
		System.out.println("*** 초기메뉴 ***");
		System.out.println("1.입력	 ");
		System.out.println("2.수정	 ");
		System.out.println("3.조회	 ");
		System.out.println("4.삭제	 ");
		System.out.println("7.종료	 ");
		System.out.println("메뉴 번호 입력 : ");
		menu = scan.nextInt();
		
		switch(menu) {
			case 1 : System.out.println("입력메뉴"); break;
			case 2 : System.out.println("수정메뉴"); break;
			case 3 : System.out.println("조회메뉴"); break;
			case 4 : System.out.println("삭제메뉴"); break;
			case 7 : System.out.println("프로그램 종료"); break;
			default : System.out.println("번호 잘못 입력, 다시입력하세요");
		}
	}
	public void test3() {
		int num;
		System.out.println("정수 하나 입력");
		num = scan.nextInt();
		if(num>0) {
			if(num%2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수가 아님");
		}
	}
	public void test4() {
		int num;
		String str;
		System.out.println("정수 하나 입력");
		num = scan.nextInt();
		if(num>0) {
			if(num%2==0) {
				str = "짝수";
			} else {
				str = "홀수";
			}
			System.out.println(num+"은"+str+"다");
		} else {
			System.out.println("양수가 아님");
		}
	}
	public void test5() {
		String name = null;
		int age;
		double height;
		System.out.println("이름을 입력하세요 :");
		name = scan.nextLine();
		System.out.println("나이를 입력하세요 :");
		age = scan.nextInt();
		System.out.println("키를 입력하세요");
		height = scan.nextDouble();
		if(name != null && name.length()>0 && height > 0) {
			System.out.printf("이름 : %s \n",name);
			System.out.printf("나이 : %d \n",age);
			System.out.printf("키 : %.2f \n",height);
			System.out.printf("%s 의 나이는 %d세이고, 키는 %.2f cm 이다",name,age,height);
		} else {
			System.out.println("잘못 입력하였습니다");
		}
	}
	public void test6() {
		int num1,num2;
		System.out.println("첫번째 정수를 입력하세요 : ");
		num1 = scan.nextInt();
		System.out.println("두번째 정수를 입력하세요 : ");
		num2 = scan.nextInt();
		
		if(num1>0 && num2>0) {
			System.out.println("첫번째 정수 : "+num1);
			System.out.println("두번째 정수 : "+num2);
			System.out.println(num1 +" + "+ num2 +"="+(num1 + num2));
			System.out.println(num1 +" - "+ num2 +"="+(num1 - num2));
			System.out.println(num1 +" * "+ num2 +"="+(num1 * num2));
			System.out.println(num1 +" / "+ num2 +"="+(num1 / num2));
			System.out.println(num1 +" % "+ num2 +"="+(num1 % num2));
		} else if (num1<0){
			System.out.println(num1+"은 양수가 아닙니다");
		} else if (num2<0) {
			System.out.println(num2+"은 양수가 아닙니다");
		} else {
			System.out.println("잘못 된 값입니다");
		}
		
	}
	public void test7() {
		int point;
		String grade;
		System.out.println("점수를 입력하세요 : ");
		point = scan.nextInt();
		if(point>=90) {
			grade = "A";
		} else if(point>=80) {
			grade = "B";
		} else if(point>=70) {
			grade = "C";
		} else if(point>=60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(point+"점은"+grade+"학점 입니다");
	}
	public void test8() {
		int num1;
		
		System.out.println("");
	}
	public void test11() {
		int kor,en,ma,sum,avg;
		System.out.println("국어 점수 : ");
		kor = scan.nextInt();
		System.out.println("영어 점수 : ");
		en = scan.nextInt();
		System.out.println("수학 점수 : ");
		ma = scan.nextInt();
		sum = kor+en+ma;
		avg = sum/3;
		
		if(avg<60) {
			System.out.println("평균점수 미달로 불합격");
		} else { 
			if (kor < 40 ) {
				System.out.println("국어 과목 점수 미달");
			}	if (en < 40 ) { 
				System.out.println("영어 과목 점수 미달");
			}   if (ma < 40 ) {
				System.out.println("수학 과목 점수 미달");
			} else {
				System.out.println("합격입니다");
			}
		}
	}
}
