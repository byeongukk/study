package com.kh.variable;

//���� ��ġ�� ��Ű�� ���� �ٸ� ��Ű���� ���� Ŭ������ ����Ҷ�
//import�� ������Ѵ�.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B_Ű�����Է��׽�Ʈ {
	public static void main(String[] args) {
		B_Ű�����Է��׽�Ʈ test = new B_Ű�����Է��׽�Ʈ();
		/*test.inputTest1();*/
		test.inputTest2();
	}
	public void inputTest1() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� �� �� ���� �Է��ϼ��� > ");
		try {
			String value = br.readLine();
			/*System.out.println("value : " + (value*3));*/
			
			//���ڿ� ������ ���ڸ� ���� ���� �����ͷ� ��ȯ�� : parsing
			int number = Integer.parseInt(value);
			
			System.out.println("number : " + (number*3));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void inputTest2() {
		//java 5�������� �߰��� Ŭ���� �̿�
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("�̸��� �Է����ּ���");
		String name = sc.nextLine();
		System.out.print("���̸� �Է����ּ���");
		int age = sc.nextInt();
		System.out.print("Ű(�Ҽ��� ù��¥�������Է�) : ");
		double height = sc.nextDouble();
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("Ű : " + height);
	}
}
