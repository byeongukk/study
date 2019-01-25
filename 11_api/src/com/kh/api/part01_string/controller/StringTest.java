package com.kh.api.part01_string.controller;

import java.util.StringTokenizer;

public class StringTest {
	
	public void stringTest() {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		System.out.println("s1과 s2 주소가 같은지 비교 : " +(s1 == s2));
		System.out.println("s1과 s3 주소가 같은지 비교 : " +(s1 == s3));
		
		System.out.println("s1과 s2 값이 같은지 비교   : "  +(s1.equals(s2)));
		System.out.println("s1과 s3 값이 같은지 비교   : " +(s1.equals(s3)));
		
		/*System.out.println("s1 의 해쉬코드 : " + s1.hashCode());
		System.out.println("s2 의 해쉬코드 : " + s2.hashCode());
		System.out.println("s3 의 해쉬코드 : " + s3.hashCode());
		*///해쉬코드는 주소값이 아니다
		
		s2 += "oracle"; //문자열이 더해지면서 다른 주소값으로 변경
		System.out.println("s1의 해쉬코드 : " + s1.hashCode());
		System.out.println("s2의 해쉬코드 : " + s2.hashCode());
		
		System.out.println("s1과 s2의 주소값이 변경후에도 같은지  " + (s1==s2));
		
	}
	public void stringBuilderTest() {
		//StringBuilder 클래스는 문자열을 저장하기 위한 클래스이다.
		//문자열 저장소에 저장하는 것이 아닌 객체를 통해 저장한다.
		StringBuilder sb = new StringBuilder("java");
		System.out.println("sb의 값 : " + sb); //toString이 오버라이딩 되있다
		System.out.println("sb의 hashcode : " + sb.hashCode());
		
		//기존 문자열에 문자열을 추가하는 메소드
		sb.append("oracle"); // oracle이라는 문자열을 추가
		System.out.println("sb의 값 : " + sb);
		
		System.out.println("sb의 hashcode : " + sb.hashCode());
	}
	
	public void splitTest() {
		String str = "java, oracle, JDBC, HTML5, CSS3";
		String[] split = str.split(", ");
		System.out.println("분리된 문자열의 갯수 : " + split.length);
/*		for(int i=0; i < split.length; i++) {
			System.out.println(split[i]);
		}
*/
		//객체 배열 사용시 향상된 for문을 사용할 수 있다.
		for(String s : split) {
			System.out.println(s);
		}
		
		//분리한 문자열을 String 배열로 처리하고 때는 split을 사용하면 되고,
		//분리된 문자열을 객체로 취급하기 위해서는 StringTokenizer 클래스를 사용 
		StringTokenizer stn = new StringTokenizer(str,", ");
		System.out.println("분리된 문자열 갯수 : " + stn.countTokens());
		
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		System.out.println("값을 꺼낸 후 문자열의 갯수 stn : " + stn.countTokens());
		//한번 사용하면 사라지기 때문에 저장을 한 후 사용해야함
	}
	
}















