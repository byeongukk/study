package com.kh.silsub2.point.model.vo;

public class Rectangle extends Point {
	private int width;
	private int height;
	
	public Rectangle() {}
	public Rectangle(int x,int y,int width,int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidht() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	@Override
	public void draw() {
		super.draw();
		double area = ((width * height)*10);
		area = Math.round(area)/10.0;
		double cir = ((2 * (width + height))*10);
		cir = Math.round(cir)/10.0;
		System.out.println("면적 : " + area);
		
		System.out.println("둘레 : " + cir);
		
	}
	
}
