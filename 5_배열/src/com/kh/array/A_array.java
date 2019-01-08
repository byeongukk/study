package com.kh.array;

import java.util.Scanner;
//import java.lang.*; 자동으로 jvm이 추가를 해줌
public class A_array {
	public void testArray() {
		//배열 사용 이유
		//배열을 사용하지 않는다면 변수를 여러 개 사용해야 한다.
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		int sum = 0;
		
		sum = (num1 + num2 + num3 + num4 + num5);
		
		int[] arr = new int[5];
		
		int value = 0;
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = value += 10;
			
		}
		int sum2 = 0;
		for(int i = 0; i < arr.length; i++) {
			sum2 += arr[i];
			System.out.println(arr[i]);
		}
		System.out.println(sum2);
	}
	public void testArray2() {
		//배열 사용 방법
		//배열의 선언
		//자료형[] 변수명;
		//자료형 변수명[]; 로 선언할 수 있다.
		
		//선언은 stack에 배열의 주소를 보관 할 수 있는 공간을 만드는 것이다.
		/*int[] iarr;
		char carr[];*/
		
		//선언한 레퍼런스변수에 배열을 할당하여 대입할 수 있다.
		//new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자
		//발생한 주소를 레퍼런스 변수에 저장하고
		// 이것릏 참조하여 사용하기 때문에 참조자료형이라고 한다.
		
		//배열을 할당할 시에는 반드시 배열의 크기를 지정해 주어야 한다.
		//int[] iarr = new int[]; //크기를 지정해 주지 않아서 에러 발생
		int[] iarr = new int[5];
		char carr[] = new char[10];
		
		System.out.println("iarr : " + iarr); ///주소값을 출력
		System.out.println("carr : " + carr); ///
		
		System.out.println("iarr의 hashcode : " + iarr.hashCode()); //
		System.out.println("carr의 hashcode : " + carr.hashCode());
	
		//배열의 길이를 알 수 있는 기능을 필드로 제공하고 있다.
		//참고로 String의 문자열 길이는 메소드로 제공하고 있기때문에
		//length()로 사용한다.
		System.out.println("iarr의 길이 : " + iarr.length);
		System.out.println("carr의 길이 : " + carr.length);
		
		//스캐너를 통해 입력받은 정수로 배열의 길이를 지정하여 배열을 할당할 수 있다.
		System.out.print("새로 할당할 배열의 길이를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		
		double[] darr = new double[size];
		System.out.println("darr의 hashcode : " + darr.hashCode());
		System.out.println("darr의 길이 : " + darr.length);
		
		//한번 할당된 배열은 지울 수 없다
		//다만 레퍼런스 변수를 null로 변경하여 더 이상 참조할 주소가 없게 된 배열은
		//일정 시간이 지난후 heap의 old영역으로 이동하여GC(가비지컬렉터)가 삭제시킨다
		//그리고 다시는 이전에 참조하던 배열을 다시 참조할 수 없다.
		
		darr = null;
		
		//nullpointerException 발생함
		//아무것도 참조하지 않고 null이라는 특수한 값을 참조하고 있을때
		//발생하는 에러.
		System.out.println("삭제 후 darr의 길이 : " + darr.length);
	}
	public void testArray3() {
		//기본적으로 배열을 선언하고 할당을 하면 jvm이 지정한 값으로 배열이 초기화된다
		//heap영역은 값이 없는 공간이 존재할 수 없기 때문이다
		int[] iarr = new int[5];
		
		for(int i=0; i<iarr.length; i++) {
			System.out.println("iarr[" + i + "]의 값 : " + iarr[i]);
		}
		//jvm이 정한 기본값 외의 값으로 초기화를 하고싶은 경우 블럭을 이용한다
		//블럭을 사용하는 경우에는 new를 사용하지 않아도 되며,
		//값의 갯수만큼 자동으로 크기가 설정된다
		int[] iarr2 = {11,22,33,44,55,66};
		int[] iarr3 = new int[] {11,22,33,44,55,66};
		if(iarr2[0]==iarr3[0]) {
			System.out.println("같음");
		}
		
		System.out.println("iarr2의 길이 : " + iarr2.length);
		//문자열도 배열로 사용할 수 있다.
		String[] sarr = {"apple", "banana", "grape", "orange"};
		
	
	}
}
