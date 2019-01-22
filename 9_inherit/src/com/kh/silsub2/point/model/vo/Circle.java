package com.kh.silsub2.point.model.vo;

public class Circle extends Point {
	private int radius;
	
	public Circle() {}
	public Circle(int x,int y,int radius) {
		super(x,y);
		this.radius = radius;
	}
	@Override
	public void draw() {
		super.draw();
		double area = ((Math.PI * radius * radius)*10);
		area = Math.round(area)/10.0;
		double cir = ((2 * Math.PI * radius)*10);
		cir = Math.round(area)/10.0;
		System.out.println("원면적 : " + area);
		System.out.println("원둘레 : " + cir);
	}
}
