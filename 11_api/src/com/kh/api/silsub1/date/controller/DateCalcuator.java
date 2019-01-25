package com.kh.api.silsub1.date.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalcuator {

	public long getDays() {
		long sumDays = 0L;
		GregorianCalendar gc = new GregorianCalendar();
		
		
		for(int year=1; year <= gc.get(Calendar.YEAR); year++) {
			
			//해당 년도가 아니라면 
			if(year!=gc.get(Calendar.YEAR)){
				//윤년이 아니라면
				if(!(isLeapYear(year))) {
					sumDays += 365;
				} else {
					sumDays += 366;
				}
			} else {
				for(int month = 1; month <=gc.get(Calendar.MONTH)+1; month++ ) {
					switch(month) {
					case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12:
						if(!(gc.get(Calendar.MONTH)+1==month)) {
							sumDays += 31;
						} 
						break;
					case 4 : case 6 : case 9 : case 11 :
						if(!(gc.get(Calendar.MONTH)+1==month)) {
							sumDays += 30;
						} 
						break;
					case 2 : 
						if(!(gc.get(Calendar.MONTH)+1==month)) {
							sumDays += isLeapYear(Calendar.YEAR)?29:28;
						} 
						break;
					}
				}
				sumDays += gc.get(Calendar.DATE);
			}
		}
		return sumDays;
	}
	public boolean isLeapYear(int year) {
		if((year%4==0) && (year%100!=0 || year%400==0)) {
			return true;
		}
		
		return false;

	}
}









