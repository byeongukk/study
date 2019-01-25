package com.kh.api.silsub2.date.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.kh.api.silsub2.date.model.vo.Person;

public class Resident {
	
	
	
	public void dateCal(Person p1) {
		int prontNum = Integer.parseInt(p1.getRrn().substring(0, 6));
		System.out.println(prontNum);
		int year = Integer.parseInt(p1.getRrn().substring(0, 2));
		int month = Integer.parseInt(p1.getRrn().substring(2, 4));
		int day = Integer.parseInt(p1.getRrn().substring(4,6));
		if(year<50) {
			year += 2000;
		} else {
			year += 1900;
		}
		GregorianCalendar gc = new GregorianCalendar(year,month-1,day);
		System.out.println(gc.get(Calendar.MARCH));
		Date date = new Date(gc.getTimeInMillis());
		System.out.println(date);
		
	}
	
}
