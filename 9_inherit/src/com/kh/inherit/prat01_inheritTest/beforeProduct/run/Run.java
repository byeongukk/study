package com.kh.inherit.prat01_inheritTest.beforeProduct.run;

import java.util.Date;

import com.kh.inherit.prat01_inheritTest.beforeProduct.model.vo.Desktop;
import com.kh.inherit.prat01_inheritTest.beforeProduct.model.vo.SmartPhone;
import com.kh.inherit.prat01_inheritTest.beforeProduct.model.vo.Television;

public class Run {

	public static void main(String[] args) {
		//제조사, 상품번호, 상품코드, 상품명, cpu, hdd, 
		//ram, os, 가격, 제조일자, 일체형여부
		Desktop ds = new Desktop("삼숭","01","s-01234,","매직스테이션",
				"i7",1000,8,"window10",10000000,new Date(), false);
		//제조사, 상품번호, 상품코드, 상품명, cpu, hdd
		//ram, os, 가격, 제조일자 , 통신사
		SmartPhone s = new SmartPhone("삼숭","02","g-01234","갤록시","스냅",300,4,"안드",5050500,new Date(),"st");
		
		//제조사, 상품번호, 상품코드, 상품명, 가격, 제조일자, 인치
		Television t = new Television("삼숭","03","t-01234","mtv",5000000,new Date(),50);
		
		
		s.printInformation();
		t.printInformation();
		ds.printInformation();
	}

}
