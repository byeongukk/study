package com.kh.api.silsub2.date.run;

import java.util.Scanner;

import com.kh.api.silsub2.date.controller.Resident;
import com.kh.api.silsub2.date.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		Resident residen = new Resident();
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 입력 ");
		String rrn = sc.nextLine();
		Person p1 = new Person(rrn);
		residen.dateCal(p1);
	}
}
