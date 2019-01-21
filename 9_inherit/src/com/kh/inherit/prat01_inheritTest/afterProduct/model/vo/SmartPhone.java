package com.kh.inherit.prat01_inheritTest.afterProduct.model.vo;

import java.util.Date;

public class SmartPhone extends Computer {
	private String mobileAgency;
	public SmartPhone() {}
	public SmartPhone(String brand, String productNumber,
			String productCode, String productName, int price,
			Date manufacturingDate, String cpu, int hdd, int ram,
			String operationSystem,String mobileAgency) {
		super(brand, productNumber, productCode, productName, price, manufacturingDate, cpu,hdd, ram, operationSystem);
		this.mobileAgency = mobileAgency;
	}
	public String getMobileAgency() {
		return mobileAgency;
	}
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	@Override
	public String printInformation() {
		return super.printInformation() +", " + this.mobileAgency;
	}

}
