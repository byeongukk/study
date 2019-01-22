package com.kh.silsub2.point.main;

import com.kh.silsub2.point.model.vo.Circle;
import com.kh.silsub2.point.model.vo.Rectangle;

public class Main {

	public static void main(String[] args) {
		Circle c1 = new Circle(5,5,10);
		Rectangle r1 = new Rectangle(4,4,56,58);
		
		c1.draw();
		r1.draw();
		
	}

}
