package com.kh.variable;

public class E_�����÷ο��׽�Ʈ {

	public static void main(String[] args) {
		//printValueSize();
		//testOverFlow();
		calc();
	}
	public static void printValueSize() {
		//������ ������
		System.out.println("byte�� ũ�� : " + Byte.BYTES + "byte");
		System.out.println("short�� ũ�� : " + Short.BYTES + "byte");
		System.out.println("int�� ũ�� : " + Integer.BYTES + "byte");
		System.out.println("long�� ũ�� : " + Long.BYTES + "byte");
		
		System.out.println("float�� ũ�� : " + Float.BYTES + "byte");
		System.out.println("double�� ũ�� : " + Double.BYTES + "byte");
		
		System.out.println("char�� ũ�� : " + Character.BYTES + "byte");
	}
	public static void testOverFlow() {
		//byte bnum = 128; //����, �ִ��� 127�� ������ ��� ���̱� ����
		
		//��� �������� ������ ����� �����÷ο� ó���ȴ�.
		//���� ��ȯ�� �ִ밪 127 --> �ּҰ� -128
		
		byte bnum = 127;
		bnum = (byte)(bnum); //byte + int --> int(����ȯ�� �ʿ�)
		System.out.println("bnum : " + bnum);

	}
	public static void calc() {
		//������ �߻������� ������ ����Ǵ� ������� ������ �ʱ� ������ �����ؾ���.
		int num1 = 100000000;
		int num2 = 70000000;
		
		//int multi = num1 * num2;
		long multi = num1 * (long)num2;
		
		
		System.out.println(multi);
	}

}
