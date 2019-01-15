package com.kh.silsub3.circle.model.vo;

public class Circle {
	private static final double PI = 3.14;
	private static int radius = 1;
	
	public Circle() {}
	
	//원의 반지름을 1증가시키는 메소드
	public void incrementField() {
		radius++;
	}
	//원의 면적을 구하는 메소드 
	public void getAreaOfCircle() {
		//원의 면적 공식
		double ac = radius*radius*PI;
		System.out.println("원의 면적은 " + ac);
	}
	
	//원의 둘레를 구하는 메소드
	public void getSizeOfCircle() {
		double sc = 2 * radius * PI;
		System.out.println("원의 둘레는 : " + sc);
	}
	public static double getPi() {
		return PI;
	}
	
	//final 즉, 상수는 setter를 만들지 못함
	/*public static void setPi(int pi;) {
		Circle.PI = pi;
	}*/
	
	public static void setRadius(int radius) {
		Circle.radius = radius;
	}
	public static int getRadius() {
		return radius;
	}
	
	
}
