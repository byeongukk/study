package com.kh.variable;

//현재 위치한 패키지 외의 다른 패키지에 속한 클래스를 사용할때
//import를 해줘야한다.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B_키보드입력테스트 {
	public static void main(String[] args) {
		B_키보드입력테스트 test = new B_키보드입력테스트();
		/*test.inputTest1();*/
		test.inputTest2();
	}
	public void inputTest1() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수 값 한 개를 입력하세요 > ");
		try {
			String value = br.readLine();
			/*System.out.println("value : " + (value*3));*/
			
			//문자열 형태의 숫자를 실제 숫자 데이터로 변환함 : parsing
			int number = Integer.parseInt(value);
			
			System.out.println("number : " + (number*3));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void inputTest2() {
		//java 5버젼부터 추가된 클래스 이용
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("이름을 입력해주세요");
		String name = sc.nextLine();
		System.out.print("나이를 입력해주세요");
		int age = sc.nextInt();
		System.out.print("키(소수점 첫재짜리까지입력) : ");
		double height = sc.nextDouble();
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
	}
}
