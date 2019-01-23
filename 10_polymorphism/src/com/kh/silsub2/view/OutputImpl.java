package com.kh.silsub2.view;

import com.kh.silsub2.salary.model.vo.Salary;

public class OutputImpl implements Output{

	@Override
	public void out(Salary[] sarr) {
		System.out.println("                                      **** 급여명세서 *****                                      ");
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("이름        기본급        가족수        가족수당         시간외근무       시간외수당             세금             인센티브      성과금       실수령액");
		System.out.println("---------------------------------------------------------------------------------------------");
		for(int i=0; i <sarr.length; i++) {
			System.out.print(sarr[i].getName()+"     ");
			System.out.print(sarr[i].getPay()+ "     ");
			System.out.print(sarr[i].getFamily()+ "        ");
			System.out.print(sarr[i].getFamilyP()+"        ");
			System.out.print(sarr[i].getOvertime()+ "          ");
			System.out.print(sarr[i].getOvertimeP()+ "     ");
			System.out.print(sarr[i].getTax()+ "        ");
			System.out.print(sarr[i].getIncentive()+ "     ");
			System.out.print(sarr[i].getIncenP()+ "     ");
			System.out.print(sarr[i].getTotalPay());
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("인원수 : "+Salary.getCount()+"명");
	}
	
}
