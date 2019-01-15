package com.kh.silsub2.product.model.vo;

public class Product {
	private String pName;
	public int price;
	String brand;
	protected static double taxRate;
	public Product(){}
	
	public void informaiton() {
		System.out.println(pName);
		System.out.println(price);
		System.out.println(brand);
		System.out.println(taxRate);
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//필드가 static 인경우 메소드도 static으로 만들어준다
	public static void setTaxRate(double taxRate) {
		Product.taxRate = taxRate;
		//this.taxRate 오류남
	}
	
	public String getPName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	//필드가 static 인경우 메소드도 static으로 만들어준다
	public static double getTaxRate() {
		return taxRate;
	}
	
}
