package com.kh.demensionalArray;

public class A_init {
	public void testInit() {
		//다차원(2차원)배열의 선언
		//선언하면 stack에 레퍼런스 변수가 생성된다
		int[][] iarr1;
		int iarr2[][];
		
		//heap영역에 2차원 배열을 할당
		//정변배열의 경우
		iarr1 = new int[3][5];
		
		//배열의 레퍼런스를 보관하는 배열은 반드시 크기를 지정해 주어야 한다.
		//iarr2 = new int[][];  //
		//iarr2 = new int[][5]; //
		iarr2 = new int[3][];
		
		//배열의 레퍼런스를 보관하는 배열에 각 배열을 할당하여 주소를 대입
		iarr2[0] = new int[5];
		iarr2[1] = new int[5];
		iarr2[2] = new int[5];
		
		//heap 영역에는 빈 공간으로 영역을 생성할 수 없기 떄문에
		//jvm이 지정한 초기값이 들어있다.
		
		//배열의 값을 출력하는 이중 for문
		for(int i = 0; i< iarr2.length; i++) {
			//행을 한행씩 증가시키는 for문
			for(int j = 0; j < iarr2[i].length; j++) {
				//열을 한열씩 증가시키는 for문
				System.out.print(iarr2[i][j]);
				
				if(j != iarr2[i].length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
		
	}
	public void testInit2() {
		//배열을 선언하고 할당한 뒤 인덱스로 접근하여 값을 기록
		int[][] iarr = new int[3][5];
		
/*		iarr[0][0] = 1;
		iarr[0][1] = 2;
		iarr[0][2] = 3;
		iarr[0][3] = 4;
		iarr[0][4] = 5;
		
		iarr[1][0] = 6;
		iarr[1][1] = 7;
		iarr[1][2] = 8;
		iarr[1][3] = 9;
		iarr[1][4] = 10;
		
		iarr[2][0] = 11;
		iarr[2][1] = 12;
		iarr[2][2] = 13;
		iarr[2][3] = 14;
		iarr[2][4] = 15;*/
		
		//이중 for문을 이용한 값 기록
		int value = 1;
		for(int i=0; i < iarr.length; i++) {
			for(int j=0; j < iarr[i].length; j++) {
				iarr[i][j] = value++;
			}
		}
		
		printArray(iarr);
	}
	//이차원 배열을 전달받아 출력하는 메소드
	public void printArray(int[][] iarr) {
		for(int i = 0; i < iarr.length; i++) {
			for(int j = 0; j < iarr[i].length; j++) {
				System.out.print(iarr[i][j]);
				
				if(j != iarr[i].length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}
	public void testInit3() {
		//가변배열
		//자료형이 같은 1차원 배열 여러개를 하나로 묶은것이 2차원 배열이기 떄문에
		//묶여있는 1차원 배열의 길이가 꼭 같을 필요는 없다.
		
		int[][] iarr = new int[3][]; //주소를 보관할수 있는 행만 미리 공간을 만든다
		
		//레퍼런스를 보관하는 배열이 아무 주소를 참조하고 않고 있기 때문에
		//NullPointException이 발생함
		//printArray(iarr);
		
		//각각 길이가 다른 생성해줌
		iarr[0] = new int[5];
		iarr[1] = new int[3];
		iarr[2] = new int[10];
		
		//printArray(iarr);
		
		//값 기록
		int value = 0;
		for(int i = 0; i < iarr.length; i++) {
			for(int j = 0; j < iarr[i].length; j++) {
				iarr[i][j] = ++value;
			}
		}
		printArray(iarr);
	}
	public void testInit4() {
		//다차원 배열의 할당과 초기화를 동시에 할 수 있다.
		/*int[][] iarr = {
			{1,2,3,4,5},
			{6,7,8,9,10},
			{11,12,13,14,15}
		};*/
		//가변 배열의 경우도 마찬가지로 사용할 수 있다.
		int[][] iarr = {
			{1,2,3},
			{4,5,6,7,8},
			{9,10,11,12,13,14,15}
		};
		
		printArray(iarr);
	}

	public void methodB() {
		String str1 = "메소드로 보내기전";
		methodA(str1);
		System.out.println("메소드 B : " + str1);
	}
	
	public void methodA(String str) {
		str = "메소드로 변경됨";
		System.out.println("메소드 A : " + str);
	}
	public void methodC() {
		int[] arr = new int[1];
		arr[0] = 1;
		methodD(arr);
		System.out.println("메소드 C arr : " + arr[0]);
	}
	
	public void methodD(int[] arr) {
		arr[0] = 0;
		System.out.println("arr : " + arr[0]);
	}
}
