package com.kh.api.part03_date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
	public void testDate() {
		//Date클래스는 기본생성자와 long형 값을 받는 두 개의 생성자 외에는
		//Deprecated 되어 있다.
		
		//defalut constructor는 현재 시간에 대한 정보를 가지고 객체를 생성한다.
		Date today = new Date();
		
		//1970년 1월 1일 00시 00분 00초 이후로 흐른 시간을  ms단위로 가져온다
		System.out.println(today.getTime());
		/*System.out.println(today.getYear());*/
	
		//Date(long date) 사용하는 방법
		Date time = new Date(1001L);
		
		System.out.println(time);
	}
	public void testCalendar() {
		//Calendar는 추상클래스이기 떄문에 객체를 생성하지 못하고
		//후손클래스인 GregorianCalendar로 객체 생성을 한다.
		//혹은 getInstance()메소드를 호출하여 객체 생성을 한다.
		Calendar c = Calendar.getInstance();
		
		System.out.println(c);

		//GregorianCalendar 클래스의 생성자를 이용한 방법
		Calendar gc = new GregorianCalendar();
		
		System.out.println(gc);
		
		//년, 월, 일, 시, 분, 초 등의 정보를 Calendar클래스의 상수를 이용해서
		//get() 메소드를 통해 가져올 수 있다.
		/*System.out.println(Calendar.YEAR);
		System.out.println(gc.get(1));
		System.out.println(gc.get(Calendar.YEAR));*/
		
		int year = gc.get(Calendar.YEAR);
		int month = gc.get(Calendar.MONTH) + 1;
		int date = gc.get(Calendar.DATE);
		int amPm = gc.get(Calendar.AM_PM);
		int hour = gc.get(Calendar.HOUR);
		int min = gc.get(Calendar.MINUTE);
		int sec = gc.get(Calendar.SECOND);
		
		//오전 오후의 경우 0은 오전, 1은 오후를 나타낸다
		String sAmPm = (amPm == Calendar.AM) ? "오전":"오후";
		
		System.out.println(year + "년 " + month + "월 " + date + "일 " +
		sAmPm + " " + hour + "시 " + min +"분 " + sec + "초 ");
	}
	public void testDateFormat() {
		//현재 날짜가 아닌 특정한 날짜값을 입력하여 객체를 생성하는 기능을
		//GregorianCalendar가 생성자로 제공하고 있다.
		
		int year = 2019;
		int month = 6; //0부터 시작함
		int day = 17;
		int hour = 21;
		int min = 30;
		int sec = 0;
		
		//특정 일자에 대한 GregorianCalendar객체를 만들어
		//long형 값으로 변경(1970년 1월1일 0시0분0초 기준)하여
		//Date 클래스의 매개변수 있는 생성자 이용한 방식
//		Calendar c = new GregorianCalendar(year,month,day,hour,min,sec);
//		long time = c.getTimeInMillis();
//		Date endDay = new Date(time);
		
		Date endDay = new Date(new GregorianCalendar(year,month,day,hour,min,sec).getTimeInMillis());
		
		System.out.println(endDay);
		
		//원하는 출력 형식(format)으로 출력을 원할 경우
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일 hh시 mm분 ss초");
		String fmtToday = sdf.format(endDay);
		System.out.println(fmtToday);
	}
}







































