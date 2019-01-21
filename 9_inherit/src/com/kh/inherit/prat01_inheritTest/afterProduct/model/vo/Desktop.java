package com.kh.inherit.prat01_inheritTest.afterProduct.model.vo;

import java.util.Date;

public class Desktop extends Computer{
	private boolean allInOne;
	
	public Desktop() {}
	public Desktop(String brand, String productNumber,
			String productCode, String productName, int price,
			Date manufacturingDate, String cpu, int hdd, int ram,
			String operationSystem,boolean allInOne) {
		super(brand, productNumber, productCode, productName, price, manufacturingDate, cpu,hdd, ram, operationSystem);
		this.allInOne = allInOne;
	}
	public boolean getAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	@Override
	public String printInformation() {
		return super.printInformation() + ", " + this.allInOne;
	}
	
}
