package com.kh.chap03_field.part02_initBlock.controller;

import com.kh.chap03_field.part02_initBlock.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.information();
		
		Product p2 = new Product("샤옴잉zy",3000,"샤옴잉");
		p2.information();
	}

}
