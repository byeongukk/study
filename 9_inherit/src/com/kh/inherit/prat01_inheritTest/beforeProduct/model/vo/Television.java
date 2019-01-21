package com.kh.inherit.prat01_inheritTest.beforeProduct.model.vo;

import java.util.Date;

public class Television {
	private String brand;
	private String productNumber;
	private String productCode;
	private String productName;
	private int price;
	private Date manufacturingDate;
	private int inchType;
	
	public Television() {}
	public Television(String brand, String productNumber, String productCode, String productName, int price,
			Date manufacturingDate, int inchType) {
		super();
		this.brand = brand;
		this.productNumber = productNumber;
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
		this.inchType = inchType;
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
	public int getInchType() {
		return inchType;
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
	public void setInchType(int inchType) {
		this.inchType = inchType;
	}
	
	public void printInformation() {
		System.out.println(brand + ", " + productNumber + ", " +
							productCode + ", " + 
							productName + ", " +
							price + ", " + manufacturingDate + ", " +
							inchType);
	}

	
	
}
