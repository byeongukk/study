package com.kh.variable;

import java.util.Scanner;

public class C_�����������׽�Ʈ {
	public static void main(String[] args) {
		changeValue();
	}
	public static void changeValue() {
		String name;
		char gender;
		int age;
		double height;
		
		name = "�ֺ���";
		gender = 'M';
		age = 20;
		height = 199.9;
		
		
		System.out.println("�̸��� :" + name);
		System.out.println("������ :" + gender);
		System.out.println("���̴� :" + age);
		System.out.println("Ű��   :" + height);
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ��� : ");
		name = scan.nextLine();
		System.out.println("������ �Է����ּ��� : ");
		//���ڸ� �о���� �޼ҵ�� charAt �޼ҵ�� �޾ƿ´� 
		gender = scan.next().charAt(0);
		System.out.println("���̸� �Է����ּ���");
		age = scan.nextInt();
		System.out.println("Ű�� �Է��� �ּ��� : ");
		height = scan.nextDouble();
		System.out.println("�̸��� :" + name);
		System.out.println("������ :" + gender);
		System.out.println("���̴� :" + age);
		System.out.println("Ű��   :" + height);
		
		
	}
	
}
