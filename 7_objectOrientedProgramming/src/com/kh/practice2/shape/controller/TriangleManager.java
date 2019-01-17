package com.kh.practice2.shape.controller;

import com.kh.practice2.shape.model.vo.Shape;

public class TriangleManager {
	public void calcPerimeter(double height, double width) {
		double cir = Math.sqrt((height*2)+(width*2)) + width + height;
		System.out.printf("삼각형의 둘레는 : %.2f 입니다",cir);
	}
	public double calcArea(double height, double width) {
		double area = (height * width)/2;
		return area;
	}
	public void printShape(Shape s) {
		System.out.println("도형 타입 : 삼각형 ");
		System.out.println("높이 : " + s.getHeight());
		System.out.println("너비 : " + s.getWidht());
		System.out.println("색상 : " + s.getColor());
	}
	public String paintColor(Shape s) {
		String str = "선택하신 도형을 "+s.getColor()+"로 색칠합니다";
		return str;
	}
}
