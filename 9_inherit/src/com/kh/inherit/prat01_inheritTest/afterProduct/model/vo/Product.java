package com.kh.inherit.prat01_inheritTest.afterProduct.model.vo;

import java.util.Date;

public class Product {
	private String brand;				//제조사
	private String productNumber;		//상품번호
	private String productCode;			//상품코드
	private String productName;			//상품이름
	private int price;					//가격
	private Date manufacturingDate;		//제조일자

	public Product() {
		System.out.println("Product 클래스 생성자 호출...");
	}

	public Product(String brand, String productNumber, String productCode, String productName, int price,
			Date manufacturingDate) {
		super();
		this.brand = brand;
		this.productNumber = productNumber;
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
		System.out.println("Product클래스 매개변수 있는 생성자 호출..");
	}

	public String getBrand() {
		return brand;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public String getProductCode() {
		return productCode;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}

	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	
	public String printInformation() {
		return brand + ", " + productNumber + ", " + productCode + ", " + productName + ", "+ price + ", " + manufacturingDate; 
	}


}
