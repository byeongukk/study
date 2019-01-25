package com.kh.api.silsub1.date.run;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.kh.api.silsub1.date.controller.DateCalcuator;

public class Run {

	public static void main(String[] args) {
		DateCalcuator dc = new DateCalcuator();
		System.out.println(dc.getDays());

	}

}
