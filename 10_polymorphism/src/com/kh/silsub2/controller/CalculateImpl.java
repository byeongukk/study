package com.kh.silsub2.controller;

import com.kh.silsub2.salary.model.vo.Salary;

public class CalculateImpl implements Calculate {

	@Override
	public void calc(Salary[] arr) {
		for(int i=0; i <arr.length; i++) {
			//가족수당
			if(arr[i].getFamily()<3) {
				//3명 미만일때 가족수*20000
				arr[i].setFamilyP(arr[i].getFamily()*20000);
			} else {
				//3명 이상일때 무조건 60000
				arr[i].setFamilyP(60000);
			}
			//시간외수당
			if(arr[i].getOvertime()>0) {
				//초과근무시간이 있을시에 초과근무시간 * 5000
				arr[i].setOvertimeP(arr[i].getOvertime()*5000);
			}
			//세금 기본급의 10%
			arr[i].setTax(arr[i].getPay()/10);
			//성과금 인센티브 * 기본급
			arr[i].setIncenP(arr[i].getPay()*((long)(arr[i].getIncentive()*10))/10);
			//실수령액 기본급 + 가족수당 + 성과금 + 시간외수당 - 세금
			arr[i].setTotalPay(arr[i].getPay() + arr[i].getFamilyP() + arr[i].getIncenP() + arr[i].getOvertimeP() - arr[i].getTax());
		}
		
	}

}
