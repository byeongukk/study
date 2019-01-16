package com.kh.silsup7.emp.controller;

import java.util.Scanner;

import com.kh.silsup7.emp.model.vo.*;

public class Run {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee e1 = new Employee();
		
		System.out.print("사원번호 입력 : ");
		e1.setEmpNo(scan.nextInt());
		System.out.print("사원이름 입력 : ");
		e1.setEmpName(scan.nextLine());
		scan.nextLine();
		System.out.print("부서 입력 : ");
		e1.setDept(scan.next());
		System.out.print("직책 입력 : ");
		e1.setJob(scan.next());
		scan.nextLine();
		System.out.print("나이 입력 : ");
		e1.setAge(scan.nextInt());
		scan.nextLine();
		System.out.print("성별 입력 : ");
		e1.setGender(scan.nextLine().charAt(0));
		System.out.print("월급 입력 :");
		e1.setSalary(scan.nextInt());
		System.out.print("보너스포인트 : ");
		e1.setBonusPoint(scan.nextDouble());
		scan.nextLine();
		System.out.print("폰번호 입력 : ");
		e1.setPhone(scan.nextLine());
		System.out.print("주소 입력 : ");
		e1.setAddress(scan.nextLine());
		
		System.out.println(e1.getEmpNo());
		System.out.println(e1.getEmpName());
		System.out.println(e1.getDept());
		System.out.println(e1.getJob());
		System.out.println(e1.getAge());
		System.out.println(e1.getGender());
		System.out.println(e1.getSalary());
		System.out.println(e1.getBonusPoint());
		System.out.println(e1.getPhone());
		System.out.println(e1.getAddress());
		
	}

}
