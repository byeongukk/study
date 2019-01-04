package com.kh.chap03_branchingStatement;

public class C_jumpBreak {
	public void jumpBreakTest() {
		label: 
		for(;;) {
			for(int i = 0; i < 10; i++) {
				System.out.println(i);
				if(i == 3) {
					break label; ///label까지 빠져나감 
				}
			}
		}
	}
}
