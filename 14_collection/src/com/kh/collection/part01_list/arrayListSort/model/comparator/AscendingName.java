package com.kh.collection.part01_list.arrayListSort.model.comparator;

import java.util.Comparator;

import com.kh.collection.part01_list.arrayListSort.model.vo.Customer;

public class AscendingName implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Customer cob1 = (Customer)o1;
		Customer cob2 = (Customer)o2;
		
		//String 클래스의 compareTo를 이용한다.
		//문자열을 서로 비교하여 오름차순으로 되어 있는 경우 음수를 리턴,
		//문자열이 서로 같으면 0을, 내림차순으로 되어 있는경우 양수를 리턴
		
		return cob1.getName().compareTo(cob2.getName());
		
		
	}

	
}
