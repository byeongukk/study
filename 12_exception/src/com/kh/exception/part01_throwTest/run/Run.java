package com.kh.exception.part01_throwTest.run;

import com.kh.exception.part01_throwTest.controller.ThrowTest;

public class Run {

	public static void main(String[] args) /*throws Exception */{
		ThrowTest tt = new ThrowTest();
		//예외가 발생할수 있는 구문을 try로 감싼다
		try {
			tt.methodA();
			
			
			
		} catch (Exception e) {
			//예외의 내용과 발생 위치를 콘솔에 출력해주는 메소드
			//e.printStackTrace();
			System.out.println("예외상황이 발생했습니다");
			
		}
		
		System.out.println("정상적으로 프로그램 종료");
	}

}
