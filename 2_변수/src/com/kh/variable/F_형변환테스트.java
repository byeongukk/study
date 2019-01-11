package com.kh.variable;

public class F_형변환테스트 {
	//(바꿀자료형)값 또는 (바꿀자료형) 변수
	//cast연산자 : 값의 자료형을 바꿀 때 사용
	//형변환 : 자동(묵시적)형변환, 강제(명시적)형변환이 있다.
	
	//컴퓨터에서의 값 처리 규칙(형변환이 필요한 상황)
	//1. 같은 자료형끼리만 대입이 가능하기 때문에, 다른 자료형 값을 대입할 때는
	//	  형변환 처리 해야 한다.
	//2. 같은 자료형끼리만 계산할 수 있으며, 계산 결과도 같은 자료형이다.
	//3. 기본적으로 정수형은 실수형으로 자동 형변환이 가능하지만,
	//	  실수형은 정수형으로 강제 형변환을 해야 한다.
	public void rule1() {
		boolean flag = true;
		// flag = 1; // boolean은 true와 false만 넣을 수 있으므로 형변환에서 예외
		
		//자료형이 다르더라도 작은 크기의 변수 타입은 큰 변수 타입으로 저장할 수 있다.
		//=> 자동형변환
		//하지만 큰 변수타입은 작은 변수 타입으로 자동 변환되지 않기 때문에
		//형변환을 명시적(강제)로 해야한다
		//=> 강제 형변환
		
		//자동 형변환이 일어남
		int num = 'a';
		System.out.println(num);
		
		char ch = 65;
		System.out.println("ch : "+ ch);
		
		// char ch2 = -1; //부호비트가 없기때문에 에러가남
		// char는 int타입보다 작으므로 강제 형변환이 필요함
		char ch2 = (char)num;
		System.out.println("ch2 : " + ch2);
		//값이 리터럴인 상태에서 들어가면서 타입이 결정됨.
		
		//음수로 저장한 변수를 char로 강제 형변환을 하게 되면
		//char는 부호 비트가 없기 때문에 문자로 인식하지 못한다.
		//물은표가 아닌 없는 문자를 의미함.
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3  : "+ ch3);
	}
	public void rule2() {
		//다른 자료형끼리의 연산은 큰 자료형으로 자동 형변환 후 연산처리된다.
		int inum = 10;
		long lnum = 100;
		
		//int isum = inum + lnum; int타입과 long타입을 계산할때
								//큰 타입인 long으로 자동 형변환이 되므로 int isum에 담길 수 없다
		//방법 1. 수행 결과를 int로 강제 형변환한다.
		int isum = (int)(inum + lnum);  
		
		//방법 2. long형 값을 int로 강제 형변환한다.
		int isum2 = inum + (int)lnum;
		
		//방법 3. 
		long isum3 = inum + lnum;
	
		System.out.println("isum : " + isum);
		System.out.println("isum2 : " + isum2);
		System.out.println("isum3 : " + isum3);
		
		//하지만 byte와 short의 연산결과는 무조건 int가 된다.
		byte bnum = 1;
		short snum = 2;
		
		//강제 형변환을 적용한 경우
		short sum = (short)(bnum + snum);
		//실행 결과를 int형으로 저장하는 경우
		int sum2 = bnum + snum;
		
	}
	public void rule3() {
		//정수는 실수로 자동 형변환이 된다.
		long lnum = 100000000001L;
		
		float fnum = lnum;
		System.out.println("fnum : " + fnum);
		//실수는 정수로 변경할 때 강제 형변환을 해 줘야 한다.
		double dnum = 10.8;
		
		int inum = (int)dnum; // int로 형변환하면서 소숫점 절삭
		System.out.println("inum : " + inum);
	}
	public void testDataloss() {
		//데이터 손실 테스트
		int inum = 300;
		System.out.println("inum : " + inum);
		
		byte bnum = (byte)inum;
		System.out.println("bnum : " + bnum);
		
	}
	
	
	public static void main(String[] args) {
		F_형변환테스트 test = new F_형변환테스트();
		test.rule1();
		//test.rule2();
		//test.rule3();
		test.testDataloss();
	}
	
	
}