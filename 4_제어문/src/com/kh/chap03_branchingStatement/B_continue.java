package com.kh.chap03_branchingStatement;

public class B_continue {
	public void continuTest() {
		// continue문 : 반복문 내에세만 사용할 수 있음
		//if(조건식) continue;
		//continue문 아래의 내용을 실행하지 말고,
		//증감식으로 건너 뛰라는 의미
		
		//1~100까지의 정수들의 합계를 출력
		//단, 4의 배수는 빼고 계산
		int sum1=0;
		int sum2=0;
		for(int i=1; i<=100; i++) {
			if(i%4 == 0) {
				sum2 += i;
				continue;
			}
			sum1 += i;
		}
		System.out.println("4의 배수를 뺀 값 : " + sum1);
		System.out.println("4의 배수를 더한 값 : " + sum2);
	}
	public void continueTest2() {
		//단 혹은 수가 짝수인 계산을 제외하고 구구단 출력
		for(int dan = 2; dan < 10; dan++) {
			System.out.println("=====" + dan + "단=======");
			
			for(int su = 1; su < 10; su++) {
				if(dan % 2 == 0 || su % 2 == 0) continue;
				System.out.println(dan + " * " + su + " = " + (dan*su));
			}
			System.out.println();
			
		}
	}
}
