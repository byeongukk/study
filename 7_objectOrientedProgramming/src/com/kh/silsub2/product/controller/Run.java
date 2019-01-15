package com.kh.silsub2.product.controller;

import com.kh.silsub2.product.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product pro = new Product();
		Product pro1 = new Product();
		pro.setpName("자전거");
		pro.setPrice(200000);
		pro.setBrand("알톤");
		//static은 객체로 접근하지 않고 클래스로 접근해야한다
		Product.setTaxRate(50.5);
		
		pro.informaiton();
		
		//System.out.println(pro1.pName); 
			//private는 같은 클레스가 아니면 접근 불가능
		System.out.println(pro1.price);   
		//System.out.println(pro1.brand); 
			//default는 같은 패키지까지 접근가능하여 다른 패키지는 접근 불가능
		//System.out.println(Product.taxRate);
			//protected는 같은패키지,후손클래스까지 접근가능하여 다른클래스,후손클래스일경우 접근불가능
			//static이여도 접근제한자가 적용됨 
	}

}
