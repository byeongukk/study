package com.kh.chap03_field.part01_kindOfVariable;


//static 키워드에 대한 구분
public class KindOfVariable2 {
	//전역변수에서 static 키워드 사용 가능하다.
	public static int staticNum;

	//public 접근제한자에 static과 final 
	//키워드를 함께 사용하는것을 '상수필드' 라고한다
	//상수필드는 반드시 선언과 동시에 초기화가 되어야 한다.
	/*public static final int STATIC_NUM;*/ //에러남
	
	//static 영역은 모든 객체가 공유할 목적으로 사용되기 때문에
	//캡슐화 원칙에 위배
	//따라서 static 키워드는 특별하게 명확한 목적이 있을경우에만 사용한다
	public static final int STATIC_NUM = 1;
	
	//static과 final은 순서를 바꿔도 상관이 없다
	public final static int STATIC_NUM2 = 2;
	
	public void methodTest() {
		//지역변수에는 static 키워드 사용 불가
		//non-static 메소드는 객체가 만들어져야 실행되기 떄문에
		//static 키워드가 올 수 없다.
		/*static int localStaticNum;*/ //에러남
	}
	public static void staticMethodTest() {
		//static 메소드 내에서도 static 키워드 사용 불가
		//지역변수는 메소드가 호출 될 때 stack영역에 생기기 때문에
		//메모리에 생성되는 위치 자체가 다르다.
		/*static int localStaticNum;*/ //에러남
		
		//static은 프로그램 실행시에 영역에 올리기 때문이다
		
	}
	

}
