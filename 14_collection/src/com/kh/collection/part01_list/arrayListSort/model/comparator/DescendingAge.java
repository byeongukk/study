package com.kh.collection.part01_list.arrayListSort.model.comparator;

import java.util.Comparator;

import com.kh.collection.part01_list.arrayListSort.model.vo.Customer;

public class DescendingAge implements Comparator{
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
	
		return result*-1;
		
		
	}
}
