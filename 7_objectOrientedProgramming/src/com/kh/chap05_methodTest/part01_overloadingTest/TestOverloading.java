package com.kh.chap05_methodTest.part01_overloadingTest;

public class TestOverloading {
	public int test() {
		return 0;
	}
	public int test(int a) {
		return 0;
	}
	public int test(int a, int b) {
		return 0;
	}
	public int test(int a, String s) {
		return 0;
	}
	//에러발생
	//매개변수명은 상관없이 자료형의 갯수와 순서가 다르게 작성되어야 한다.
	/*public int test(int b, int a) {
		return 0;
	}*/
	public int test(String s, int a) {
		return 0;
	}
	public String test(int a, int b, String str) {
		return null;
	}
	//에러 발생
	//리턴타입은 오버로딩과 무관하다
	/*public int test(int a, int b, String str) {
		return 0;
	}*/
	
	//에러 발생
	//접근제한자는 오버로딩과 무관하다 
	/*private String test(int a, int b, String str) {
		return null;
	}*/
	
	
}

























