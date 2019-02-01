package com.kh.collection.part01_list.arrayListSort.controller;

import java.util.ArrayList;
import java.util.Comparator;

import com.kh.collection.part01_list.arrayListSort.model.comparator.AscendingName;
import com.kh.collection.part01_list.arrayListSort.model.comparator.DescendingAge;
import com.kh.collection.part01_list.arrayListSort.model.comparator.DescendingName;
import com.kh.collection.part01_list.arrayListSort.model.vo.Customer;

public class CustomerManager {
	public void testArrayListSort() {
		//Customer 객체 생성 후 ArrayList에 담기
		ArrayList list = new ArrayList();
		
		list.add(new Customer("홍길동",25,'남',1250.5));
		list.add(new Customer("이순신",30,'남',1780.3));
		list.add(new Customer("유관순",20,'여',2200.9));
		
		/*System.out.println("list : " + list);*/
		
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		//기본적으로 sort() 메소드를 사용하는 경우엔 어떤 정렬 기준으로
		//정렬할 것인지 알려줘야한다.
		//Collections.sort()의 경우 한 개의 객체 타입끼리 비교할 때 주로 사용한다.
		//list.sort()를 사용한다
		//sort()는 내부적으로 Comparable 인터페이스를 구현한 객체를 전달해주면
		//그 객체 안에 있는 compare()메소드를 호출 하여 정렬 기준으로 삼는다

		//이름순 오름차순 정렬
		list.sort(new AscendingName());
		System.out.println("이름순 오름차순 정렬-------------------- ");
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		//이름순 내림차순 정렬
		list.sort(new DescendingName());
		System.out.println("이름순 내림차순 정렬----------------");
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		//나이순 오름차순 정렬
		list.sort(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Customer cob1 = (Customer)o1;
				Customer cob2 = (Customer)o2;
				
				int result = 0;
				if(cob1.getAge() == cob2.getAge()) {
					result = 0;
				}
				if(cob1.getAge() > cob2.getAge()) {
					result = 1;
				}
				if(cob1.getAge() < cob2.getAge()) {
					result = -1;
				}
				
				return result;
			}
			
		});
		System.out.println("나이순 오름차순 정렬----------------");
		for(Object obj : list) {
			System.out.println(obj);
		}
		//나이순 내림차순 정렬
		list.sort(new DescendingAge());
		System.out.println("나이순 내림차순 정렬---------------");
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
}























































































