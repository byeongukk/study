package com.kh.practice;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Example {
	Scanner scan = new Scanner(System.in);

	public void sample() {
		int kor,en,ma,sum;
		double avg;
		System.out.println("국어 점수  : ");
		kor = scan.nextInt();
		System.out.println("영어 점수  : ");
		en = scan.nextInt();
		System.out.println("수학 점수  : ");
		ma = scan.nextInt();
		sum = (kor + en + ma);
		avg = sum/3.0;
		System.out.println("합계 점수 : " + sum);
		System.out.println("평균 점수 : " + avg);
		String result = ((kor >= 40 && en >= 40 && ma >= 40) && avg >= 60)?"합격":"불합격";
		System.out.println(result);
		
		if((kor >= 40 && en >= 40 && ma >= 40) && avg >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
	public void sample2(){
		String name,gender;
		int grade,cls,stuNum;
		double po;
		System.out.println("성별 입력 : ");
		gender = scan.nextLine();
		
		System.out.println("이름 입력 : ");
		name = scan.nextLine();
		
		System.out.println("학년 입력 : ");
		grade = scan.nextInt();
		
		System.out.println("반 입력 : ");
		cls = scan.nextInt();
		
		System.out.println("번호 입력 : ");
		stuNum = scan.nextInt();
		
		System.out.println("점수 입력 : ");
		po = scan.nextDouble();
		
		po = po*100;
		po = (int)po/100.0;
		System.out.println(po);
		
		gender =(gender.charAt(0)=='M'||gender.charAt(0)=='m')?"남학생":"여학생";
		System.out.println(grade+"학년"+cls+"반"+stuNum+"번"+gender +name+"은 성적이"+po+"이다");
	}
	public void sample3() {
		int a;
		String str;
		System.out.println("정수 하나 입력 : ");
		a = scan.nextInt();
		
		str = (a > 0)?"양수다":"영수가 아님";
		System.out.println(str);
	}
	public void sample4() {
		int inum;
		String str;
		
		System.out.println("정수 하나 입력 : ");
		inum = scan.nextInt();
		
		str = (inum%2 == 0)?"짝수임" : "홀수임";
		System.out.println(str);
	}
}
