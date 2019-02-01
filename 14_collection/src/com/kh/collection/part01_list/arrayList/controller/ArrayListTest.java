package com.kh.collection.part01_list.arrayList.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {
	
	
	public void testArray() {
		//ArrayList test
		
		//ArrayList 객체를 생성하게 되면 내부적으로 10칸짜리 배열을 만든다
		ArrayList alist = new ArrayList();
		
		//다형성 적용하여 상위 레퍼런스로 ArrayList 객체를 만들 수 있음
		List list = new ArrayList();
		Collection slist = new ArrayList();
		
		//arrayList는 저장 순서가 유지되며 index(순번)이 적용됨
		//arrayList는 객체만 저장할 수 있다.
		alist.add("apple");
		//alist.add(new Integer(123));
		alist.add(123);					//autoBoxing 처리됨(기본 타입을 객체로 만듦)
		alist.add(45.67);
		alist.add(new Date());
		
		//toString 메소드가 ovrriding 되어있음
		System.out.println("alist : " + alist);
		
		//내부의 배열에 인덱스가 저정되어 있기 때문에 for문으로 접근도 가능하다
		//arrayList의 크기는 size()메소드로 확인할 수 있다.
		for(int i=0; i <alist.size(); i++) {
			System.out.println(i + " :  " + alist.get(i));
		}
		
		//arrayList는 데이터의 중복 저장을 허용한다.
		alist.add("apple");
		System.out.println("alist : " + alist);
		
		//원하는 인덱스 위치에 객체를 추가할 수도 있다.
		alist.add(1, "banana");
		
		System.out.println("alist : " + alist);
		//객체를 중간에 추가하는 경우 인덱스 위치를 덮어쓰는 것이 아니고
		//하나씩 뒤로 밀리게 된다
		
		//저장된 객체를 삭제할 때는 remove() 메소드를 사용한다.
		alist.remove(1);
		System.out.println("alist : " + alist);
		//객체를 중간에 삭제하는 경우 자동으로 인덱스를 하나씩 앞으로 땡긴다
		System.out.println(alist.get(0).hashCode());
		
		//지정된 위치의 객체를 수정할 때에도 인덱스를 활용하며
		//set()메소드를 사용한다
		alist.set(1,new Boolean(true));
		System.out.println("alist : " + alist);
		
	}
	
	public void testArrayListSort() {
		//ArrayList는 오름차순 정렬할 수 있도록 sort()메소드를 제공해줌
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		list.add("mango");
		list.add("grape");
		
		System.out.println("list : " + list);
		list.sort(null);
		System.out.println("list : " + list);
		Collections.sort(list);
		System.out.println("list : " + list);
		//sort메소드를 사용하면 list가 오름차순 정렬 처리된 후 유지
		
		//내림차순 정렬
		//Iterator 반복자 인터페이스를 활용해서 역순으로 정렬
		//LinkedList 객체를 기존 리스트를 이용해서 만든 후
		//decendingIteratior() 메소드를 사용한다.
		Iterator dIter = new LinkedList(list).descendingIterator();

		/*while(dIter.hasNext()) {
			System.out.println(dIter.next());
		}
		
		//한번 꺼내면 다시 쓸 수 없다
		while(dIter.hasNext()) {
			System.out.println(dIter.next());
		}*/
		
		ArrayList descList = new ArrayList();
		
		while(dIter.hasNext()) {
			descList.add(dIter.next());
		}
		System.out.println("descList : " + descList);
		list = descList;
		System.out.println("list : " + list);
		
	}
	
}













































