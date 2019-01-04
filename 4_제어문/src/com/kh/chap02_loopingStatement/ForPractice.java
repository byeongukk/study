package com.kh.chap02_loopingStatement;

public class ForPractice {
	public void yerangFor3() {
		int sum = 0;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				int random = (int)(Math.random()*2);
				System.out.print("["+random+"]");
				if(j+i==6 || j==i) {
					sum+=random;
				}
			}
			System.out.println();
		}
		System.out.println("X 자리의 합 : "+sum);
	}
}
