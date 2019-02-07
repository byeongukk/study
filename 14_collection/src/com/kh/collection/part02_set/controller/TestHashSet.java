package com.kh.collection.part02_set.controller;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
	public void testHashSet() {
		//HashSet test
		HashSet hset = new HashSet();
		
		//다형성 적용하여 상위 레퍼런스 사용 가능
		Set hset2 = new HashSet();
		Collection hset3 = new HashSet();
	
		hset.add(new String("java"));
		hset.add(new Integer(123));
		hset.add(new Double(45.17));
		hset.add(new Date());
		
		//저장 순서 유지 안됨
		System.out.println("hset : " + hset);
		
		hset.add(new String("java"));
		hset.add(new Integer(123));
		System.out.println("hset : " + hset);
		
		System.out.println("저장된 객체 수 : " + hset.size());
		System.out.println("포함확인 : " + hset.contains("java"));
		
		//저장된 객체를 하나씩 꺼내는 기능이 없음
		//해결 방법
		//1. toArray()를 이용하여 배열로 바꾸고 for문 사용
		Object[] arr = hset.toArray();
		for(int i=0; i <arr.length; i++) {
			System.out.println(i + " : " + arr[i]);
		}
		
		//2. iterator()로 목록 만들어 연속 처리
		Iterator iter = hset.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//지우는 방법
		hset.clear();
		System.out.println("empty? : " + hset.isEmpty());
		System.out.println(hset);
	}
}






















