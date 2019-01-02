package com.kh.chap01_decisionMarkingStatement;

import java.util.Scanner;

public class C_ifElseIf {
	static Scanner scan = new Scanner(System.in);
		//if else if 구문은 다중 조건을 줄 수 있는 문법이다.
		//[표현식]
		//if(조건식){
		//	실행문1
		//} else if(조건식){
		//	실행문2
		//}else{
		//	실행문3
		//}
		
		//else에 if(조건식)을 더해서 여러가지 조건을 줄 수 있다.
	public static void testIfElseIf() {
		//점수를 하나 입력받아 등급을 나누어 점수와 등급을 출력
		//등급은, 90점 이상은 A등급
		//90점 미만 80점 이상은 B등급
		//80점 미만 70점 이상은 C등급
		//70점 미만 60점 이상은 D등급
		//60점 미만은 F 등급으로 나눈다
		
		//if else if구문은 위 조건을 만족하지 못하고 내려오는경우
		//당연히 조건의 반대족ㄴ을 내부적으로 포함하고있다
		
		int temp ;
		char grade = ' ';
		System.out.println("점수를 입력하세요 : ");
		temp = scan.nextInt();
		if(temp >= 90) {
			grade = 'A';
		// 위에서 확인된 내용이기에 생략가능
		} else if(/*temp<90 && */temp>=80) { 
			grade = 'B';
		} else if(/*temp<80 && */ temp>=70) {
			grade = 'C';
		} else if(/*temp<70 && */temp>=60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		//%d = 정수값 , %c = 문자값
		System.out.printf("당신의 점수는 %d 이고 등급은 %c입니다",temp,grade);
		//printf 포맷
		//포맷문자와 값은 갯수와 자료형이 일치해야한다.
		//System.out.printf("%형식",값(혹은 변수)); 의 형태로 사용한다
		//->정해져 있는 형식에 맞춰서 그 형식에 맞는 값(변수)를 줄바꿈하지 않고 출력
		
		//포맷문자
		// %d : 정수형
		// %o : 8진수
		// %x : 16진수
		// %f : 실수(소수점 아래 6자리)
		// %e : 지수표현식(과학적 표현식)
		// %c : 문자
		// %s : 문자열
		// %b : 논리형

		// %5d : 5칸을 확보하고  오른쪽 정렬
		// %-5d : 5칸을 확보하고 왼쪽 정렬
		// %.2f : 소수점 아래 2자리까지만 표현
		
		//특수 문자 (escape문자)
		// tab : \t			정해진 공간만큼 띄어쓰기
		// new lint : \n	출력하고 다음 라인으로 옮김
		// 역슬래쉬 : \\		특수문자(\) 사용하려면 두개를 입력
		// 작은따옴표 : \'		특수문자(') 사용
		// 큰따옴표 : \"		특수문자(") 사용
		// 유니코드 : \u0000	유니코드 표시할 때 사용
	}
	public static void testIfElseIf2() {
		//위의 문제에 각 등급별 중간점수 이상의 경우에는
		//등급에 "+" 라는 문자를 추가하여 출력하세요
		//예) 95점 이상은 등급이 A+로 출력되게 함
		
		String grade = "";
		System.out.println("점수를 입력하세요 : ");
		int temp = scan.nextInt();
		if(temp>=90) {
			grade = "A";
			if(temp >= 95) {
				grade += "+";
			}
		} else if (temp >= 80) {
			grade = "B";
			if(temp >= 85) {
				grade += "+";
			}
		} else if (temp >= 70) {
			grade = "C";
			if(temp >= 75) {
				grade += "+";
			}
		} else if (temp >= 60) {
			grade = "D";
			if(temp >= 65) {
				grade += "+";
			}
		} else {
			grade = "F";
		}
		System.out.printf("%d 점은 %s 등급입니다",temp,grade);
	}
}
