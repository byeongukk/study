package com.kh.api.part02_wrapper.controller;

public class WrapperTest {
	
	public void boxingTest() {
		//기본 자료형을 객체로 변환하는 것을 boxing 한다고 하며
		//객체를 기본 자료형으로 변환하는 것을 unboxing 이라고 한다
		Integer num1 = new Integer(3);
		Integer num2 = 3;		//오토박싱
		
		int num3 = num1;		//오토언박싱

		System.out.println(num1);
		System.out.println(num3);
		
	}
	public void parsingTest() {
		//문자열(String) 객체 값을 기본자료형으로 변환하는 것을 parsing 한다고함
		byte b = Byte.parseByte("1");
		short s = Short.parseShort("2");
		int i = Integer.parseInt("4");
		long l = Long.parseLong("8");
		float f = Float.parseFloat("4.0");
		double d = Double.parseDouble("8.0");
		boolean bl = Boolean.parseBoolean("true");
		
		//Character는 part을 제공하지 않는다
		char c = "abc".charAt(0);
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bl);
		System.out.println(c);
		
	}
	public void valueOfTest() {
		//기본 자료형을 문자열 객체로 변환하는 기능을 제공
		//valueOf는 기본 자료형 값을 wrapper클래스 객체 타입으로 변경하는 것이고,
		//해당 wrapper 클래스별 toString이라는 메소드로 스트링으로 변환해준다.
		
		String b = Byte.valueOf((byte)1).toString();
		String s = Short.valueOf((short)2).toString();
		String i = Integer.valueOf(4).toString();
		String l = Long.valueOf(8L).toString();
		String f = Float.valueOf(4.0f).toString();
		String d = Double.valueOf(8.0).toString();
		String bl = Boolean.valueOf(true).toString();
		String c = Character.valueOf('c').toString();
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bl);
		System.out.println(c);
		
		//String 클래스의 valueOf를 사용할 수도 있다.
		String str = String.valueOf(10);
		
		//문자열 합치기를 이용해 Strong으로 변환할 수도 있다.
		String str2 = 123 + "";
	}
	
	
}





































