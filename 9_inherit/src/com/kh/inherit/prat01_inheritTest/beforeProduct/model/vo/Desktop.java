package com.kh.inherit.prat01_inheritTest.beforeProduct.model.vo;

import java.util.Date;

public class Desktop {
	protected String brand;				//제조사
	private String productNumber;		//상품번호
	private String productCode;			//상품코드
	private String productName;			//상품명
	private String cpu;					//cpu
	private int hdd;					//hdd
	private int ram;					//Ram
	private String operationSystem;		//운영체제
	private int price;					//가격
	private Date manufacturingDate;		//제조일자
	private boolean allInOne;			//일체여부
	
	public Desktop() {}
	
	public Desktop(String brand, String productNumber, String productCode,String productName, 
			String cpu,int hdd,int ram,String operationSystem,int price, Date manufacturingDate,boolean allInOne) {
		this.brand = brand;
		this.productNumber = productNumber;
		this.productCode = productCode;
		this.productName = productName;
		this.cpu = cpu;
		this.hdd = hdd;
		this.operationSystem = operationSystem;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
		this.allInOne = allInOne;
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
	public String getProductName(){
		return productName;
	}
	public String getCpu() {
		return cpu;
	}
	public int getHdd() {
		return hdd;
	}
	public int getRam() {
		return ram;
	}
	public String getOperationSystem() {
		return operationSystem;
	}
	public int getPrice() {
		return price;
	}
	public Date getManufacturingDate() {
		return manufacturingDate;
	}
	public boolean getAllInOne() {
		return allInOne;
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
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public void printInformation() {
		System.out.println(brand + ", " + productNumber + ", " +
							productCode + ", " + 
							productName + ", " +
							cpu + ", " + hdd + ", " +
							ram + ", " + operationSystem + ", "+
							price + ", " + manufacturingDate + ", " +
							allInOne);
	}
	
	
}



























