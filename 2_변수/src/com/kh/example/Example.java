package com.kh.example;

import java.util.Scanner;

public class Example {
	Scanner scan = new Scanner(System.in);
	public void example1() {
		
		System.out.println("ù��° ������ �Է��� �ּ��� :");
		int num1 = scan.nextInt();
		System.out.println("�ι�° ������ �Է��� �ּ��� :");
		int num2 = scan.nextInt();
		
		System.out.println("�� ���� �� : " + (num1 + num2));
		System.out.println("�� ���� �� : " + (num1 - num2));
		System.out.println("�� ���� �� : " + (num1 * num2));
		System.out.println("�� ���� ���� �� : " + (num1 / num2));
		System.out.println("�� ���� ���� ������ ��: " + (num1 % num2));
		
	}
	public void example2() {
		
		System.out.println("���� ���� �Ҽ������� �����ּ��� : ");
		double width = scan.nextDouble();
		System.out.println("���� ���� �Ҽ������� �����ּ��� : ");
		double height = scan.nextDouble();
		
		System.out.println("���� : " + width * height);
		System.out.println("�ѷ� : " + (width+height)*2);
	}
	public void example3() {
		int num;
		System.out.println("���ڿ��� �Է��Ͻÿ�  : ");
		String str = scan.nextLine();
		System.out.println("����������� ���ڿ� ������ �Է��ϼ��� : ");
		num = scan.nextInt()-1;
		System.out.println(str.charAt(num)+ " ��° ���� : " + str.charAt(num));
		System.out.println("����������� ���ڿ� ������ �Է��ϼ��� : ");
		num = scan.nextInt()-1;
		System.out.println(str.charAt(num)+ " ��° ���� : " + str.charAt(num));
		System.out.println("����������� ���ڿ� ������ �Է��ϼ��� : ");
		num = scan.nextInt()-1;
		System.out.println(str.charAt(num)+ " ��° ���� : " + str.charAt(num));
	}
	
}
