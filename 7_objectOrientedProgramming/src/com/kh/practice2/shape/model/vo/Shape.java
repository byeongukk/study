package com.kh.practice2.shape.model.vo;

public class Shape {
	private int type;
	private double height;
	private double widht;
	private String color = "white";
	
	public Shape() {}
	public Shape(int type, double height, double width) {
		
	}
	public void setType(int type) {
		this.type = type;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWidht(double widht) {
		this.widht = widht;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getType() {
		return type;
	}
	public double getHeight() {
		return height;
	}
	public double getWidht() {
		return widht;
	}
	public String getColor() {
		return color;
	}
	
}
