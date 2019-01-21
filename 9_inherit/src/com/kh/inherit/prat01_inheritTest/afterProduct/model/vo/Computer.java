package com.kh.inherit.prat01_inheritTest.afterProduct.model.vo;

import java.util.Date;

public class Computer extends Product{
	//Product 클래스를 상속받아
	//스마트폰과 데스크탑의 공통속성을 추출
	private String cpu;
	private int hdd;
	private int ram;
	private String operationSystem;
	
	public Computer() {
		
	}
	
	public Computer(String brand, String productNumber, String productCode,String productName,int price,Date manufacturingDate,String cpu, int hdd,int ram,String operationSystem) {
		super(brand,productNumber,productCode,productName,price,manufacturingDate);
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
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
	
	//어노테이션 , 오버라이딩 요건에 맞는지 체크
	@Override
	public String printInformation() {
		return super.printInformation() + ", " + this.cpu + ", "
				+ this.hdd + ", " + this.ram + ", "+ this.operationSystem; 
	}
	
	
}
