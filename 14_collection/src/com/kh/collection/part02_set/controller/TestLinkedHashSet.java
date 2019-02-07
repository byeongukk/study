package com.kh.collection.part02_set.controller;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestLinkedHashSet {
	public void testLinkedHashSet() {
		//LinkedHashSet test
		//저장 순서 유지 기능이 추가됨
		LinkedHashSet lhset = new LinkedHashSet();
		
		lhset.add("java");		
		lhset.add(123);			//autoBoxing 처리됨
		lhset.add(45.67);		//autoBoxing 처리됨
		lhset.add(true);		//autoBoxing 처리됨
		lhset.add(new Date());
		
		System.out.println("lhset : " + lhset);
		
		//오름차순 정렬을 원하는 경우 같은 클래스 타입일 때에만 가능함
		LinkedHashSet lhset2 = new LinkedHashSet();
		
		lhset2.add("java");
		lhset2.add("oracle");
		lhset2.add("html");
		lhset2.add("css");
		
		System.out.println("lhset2 : " + lhset2);
		
		//만들어진 LinkedHashSet을 가지고 TreeSet 객체를 생성하면
		//같은 타입의 객체를 자동으로 비교하여 오름차순으로 정렬
		TreeSet test = new TreeSet(lhset2);
		System.out.println("test : " + test);
		
		
	}
}
