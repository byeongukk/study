package com.kh.inherit.prat01_inheritTest.afterProduct.run;

import java.util.Date;

import com.kh.inherit.prat01_inheritTest.afterProduct.model.vo.Desktop;
import com.kh.inherit.prat01_inheritTest.afterProduct.model.vo.Television;

public class Run {

	public static void main(String[] args) {
		Television t = new Television("삼성","01","T-1234","tvtv",500000,new Date(),45);
		System.out.println(t.printInformation());
		
		//제조사, 상품번호, 상품코드, 상품명, 가격, 제조일자,
		//cpu, hdd, ram, os, 일체여부
		Desktop d = new Desktop("삼성", "01" , "s-01234","매직스테이션2",1000000, new Date(),
				"퀄컴", 500, 8, "window10", false);
		System.out.println(d.printInformation());
		//자식 객체로 부모에 선언된 메소드를 자기 자신의 것처럼 사용도 가능하다.
		System.out.println(d.getBrand());
	}

}
