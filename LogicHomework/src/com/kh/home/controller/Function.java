package com.kh.home.controller;
import java.util.Random;
import java.util.Scanner;

public class Function {
	Scanner scan = new Scanner(System.in);
	public void calculator(){
		int num1,num2,sum=0;
		char cal ;
		System.out.println("첫번째 정수를 입력하세요 : ");
		num1 = scan.nextInt();
		System.out.println("두번째 정수를 입력하세요 : ");
		num2 = scan.nextInt();
		System.out.println("연산기호를 입력하세요 : ");
		cal = scan.next().charAt(0);
		
		switch(cal) {
			case '+' : sum = num1+num2; break;
			case '-' : sum = num1-num2; break;
			case 'X' : case 'x' : case '*' : sum = num1*num2; break;
			case '/' : if(num2!=0) { 
						sum = num1/num2; 
						} else {
							System.out.println("0으로 나눌 수 없습니다");
						} break;
			default : System.out.println("잘못 입력하셨습니다"); break;
		}
		System.out.println(num1 +" "+ cal +" "+ num2 +" = "+ sum );
	}
	public void totalCalculator() {
		int num1,num2,sum=0,min,max;
		System.out.println("첫번째 정수를 입력하세요 : ");
		num1 = scan.nextInt();
		System.out.println("두번째 정수를 입력하세요 : ");
		num2 = scan.nextInt();
		if(num1>num2) {
			max = num1;
			min = num2;
		} else {
			min = num1;
			max = num2;
		}
		for(int i = min; i<=max; i++) {
			sum += i;
		}
		System.out.println(min+" 부터 "+max+" 까지 정수들의 합계 : " + sum );
		
	}
	public void profile() {
		String name = "최병욱",
			   gender = "남자",
			   personality = "개빡셈";
		int age = 20;
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("성격 : " + personality);
		
	}
	public void sugjuk() {
		String name;
		int level,group,stdNum;
		String gender ;
		char grade;
		double results;
		
		System.out.println("이름 입력 : ");
		name = scan.nextLine();
		System.out.println("학년 입력 :");
		level = scan.nextInt();
		System.out.println("반 입력 : ");
		group = scan.nextInt();
		System.out.println("번호 입력 : ");
		stdNum = scan.nextInt();
		System.out.println("성별 입력(M/F) : ");
		gender = scan.next();
		switch(gender) {
			case "M" : case "m" : 
				gender = "남학생";
				break;
			case "f" : case "F" :
				gender = "여학생";
				break;
			default : gender = "성별없음";
		}
		
		System.out.println("성적 입력 : ");
		results = scan.nextDouble();
		System.out.println(results);
		if(results>=90) {
			grade = 'A';
		} else if(results>=80) {
			grade = 'B';
		} else if(results>=70) {
			grade = 'C';
		} else if(results>=60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.2f이고, %c 학점입니다",level,group,stdNum,gender,name,results,grade);
		System.out.println();
	}
	public void printStarNumber() {
		int row;
		System.out.println("줄 수 입력 : ");
		row = scan.nextInt();
		if(row>0) {
			for(int i=1; i<=row; i++) {
				for(int j=1; j<=i; j++) {
					if(i==j) {
						System.out.print(i);
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("양수가 아닙니다");
		}
	}
	public void sumRandomNumber() {
		int random = (int)((Math.random()*100)+1);
		int sum=0;
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		System.out.println("1부터 "+random+"까지의 합계는 : "+ sum);
	}
	public void continueGugudan() {
		int dan;
		System.out.print("단수 : ");
		dan = scan.nextInt();
		if(dan>0) {
			for(int i=1; i<=9; i++) {
				if(i%dan==0) {
					continue;
				}
				System.out.println(dan + " * " + i +" = "+ dan*i);
			}
		} else {
			System.out.println("양수가 아님");
		}
	}
	public void shutNumber() {
		int dice1 = new Random().nextInt(6)+1;
		int dice2 = new Random().nextInt(6)+1;
		int diceSum = dice1+dice2;
		int answer;
		String check;
		
		do {
			System.out.println("값을 입력하세요 : ");
			answer = scan.nextInt();
			scan.nextLine();
			if(answer==diceSum) {
				System.out.println("맞췃습니다");
				break;
			} else {
				System.out.println("툴렸습니다");
				System.out.println("계속하시겠습니까?(Y/n) : ");
				check = scan.nextLine();
				if(check.equals("N")||check.equals("n")) {
					break;
				}
				
			}


			
		}while(true);
	}
}
