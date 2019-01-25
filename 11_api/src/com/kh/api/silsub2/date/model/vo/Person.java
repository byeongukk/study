package com.kh.api.silsub2.date.model.vo;

public class Person {
	private String rrn ;
	private int birthYear ;
	private int birthMonth;
	private int birthDay;
	public Person() {}
	public Person(String rrn) {
		this.rrn = rrn;
	}
	public String getRrn() {
		return rrn;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}
	
	
}
