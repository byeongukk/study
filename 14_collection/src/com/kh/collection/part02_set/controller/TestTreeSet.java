package com.kh.collection.part02_set.controller;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
	public void testTreeSet() {
		//TreeSet test
		//자동 오름차순 정렬 기능이 내장되어 있음
		TreeSet tset = new TreeSet();
		
		tset.add("java");
		tset.add("oracle");
		tset.add("html");
		tset.add("Css");
	
		Iterator iter = tset.iterator();
		
		while(iter.hasNext()) {
			System.out.println(((String)(iter.next())).toUpperCase());
		}

		//배열로 바꾸어 연속 처리
		Object[] arr= tset.toArray();
		
		for(Object obj : arr) {
			System.out.println(((String)obj).toUpperCase());
		}
	
	
	}
}
