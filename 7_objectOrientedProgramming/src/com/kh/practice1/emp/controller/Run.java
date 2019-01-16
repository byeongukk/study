package com.kh.practice1.emp.controller;

import com.kh.practice1.emp.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		//기본 생성자를 통한 객체 생성
		Employee e1 = new Employee();
		//4개의 매개변수를 받는 생성자를 통해 객체 생성
		Employee e2 = new Employee(1,"홍길동",'남',"010-7777-7777");
		Employee e3 = new Employee(2,"유관순",'여',"010-3131-3131","영업부",3300000,0.15);
		e1.printEmployee();
		e2.printEmployee();
		e3.printEmployee();
	}
}
