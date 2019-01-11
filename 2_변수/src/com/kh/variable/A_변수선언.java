package com.kh.variable;

public class A_변수선언 {
	//패키지가 다르면 같은 이름의 클래스도 만들 수 있다.
	//클래스의 이름은 사실 패키지를 포함한 이름이기 때문이다.
	//ex) com.kh.variable.A_변수선언 <- 현재 클래스의 fullName
	public void declareVariable() {
		//숫자형
		//정수형
		byte bnum;
		short snum;
		int inum;
		long lnum;
		//실수형
		float fnum;
		double dnum;
		
		//논리
		boolean  isTrue;
		
		//문자
		char ch;
		
		//문자형
		String str; //이미 만들어져있는 class  참조 변수
		
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8;  //L 을 붙이지 않아도 자동 형변환이 되므로 사용가능
		
		fnum = 4.0f; //float는 리터럴에 f를 붙여야 한다.
		dnum = 8.0;
		
		isTrue = false; // true 나 false 만 사용한다
		
		ch = 'A';
		str = "A"; //문자를 한 개만 써도 리터럴은 ""를 사용해야 한다.
		
		//변수에 저장된 값 출력하기
		System.out.println("bnum의 값" + bnum);
		System.out.println("snum의 값" + snum);
		System.out.println("inum의 값" + inum);
		System.out.println("lnum의 값" + lnum);
		
		System.out.println("fnum의 값" + fnum);
		System.out.println("dnum의 값" + dnum);
		
		System.out.println("isTrue의 값" + isTrue);
		
		System.out.println("ch의 값" + ch);
		
		System.out.println("str의 값" + str);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
	}
	
	public void initVariable() {
		//변수 선언과 동시에 초기화
		//숫자형
		//정수형
		byte bnum = 1;
		short snum = 2;
		int inum = 4;
		long lnum = 8;
		//실수형
		float fnum = 4.0f;
		double dnum = 8.0;
		
		//논리
		boolean  isTrue = true;
		
		//문자
		char ch = 'A';
		//문자열
		String str = "A";
		
		//변수에 저장된 값 출력하기
		System.out.println("bnum의 값" + bnum);
		System.out.println("snum의 값" + snum);
		System.out.println("inum의 값" + inum);
		System.out.println("lnum의 값" + lnum);
		
		System.out.println("fnum의 값" + fnum);
		System.out.println("dnum의 값" + dnum);
		
		System.out.println("isTrue의 값" + isTrue);
		
		System.out.println("ch의 값" + ch);
		
		System.out.println("str의 값" + str);
	}
	
	public static void main(String[] args) {
		A_변수선언 test = new A_변수선언();
		test.declareVariable();
	}
}
