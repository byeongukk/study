package com.kh.silsub3.circle.controller;

import com.kh.silsub3.circle.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle cr = new Circle();
		cr.getAreaOfCircle();
		cr.getSizeOfCircle();

		//반지름 1증가
		cr.incrementField();
		
		cr.getAreaOfCircle();
		cr.getSizeOfCircle();
	}

}
