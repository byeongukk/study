package com.kh.variable;

public class F_����ȯ�׽�Ʈ {
	//(�ٲ��ڷ���)�� �Ǵ� (�ٲ��ڷ���) ����
	//cast������ : ���� �ڷ����� �ٲ� �� ���
	//����ȯ : �ڵ�(������)����ȯ, ����(�����)����ȯ�� �ִ�.
	
	//��ǻ�Ϳ����� �� ó�� ��Ģ(����ȯ�� �ʿ��� ��Ȳ)
	//1. ���� �ڷ��������� ������ �����ϱ� ������, �ٸ� �ڷ��� ���� ������ ����
	//	  ����ȯ ó�� �ؾ� �Ѵ�.
	//2. ���� �ڷ��������� ����� �� ������, ��� ����� ���� �ڷ����̴�.
	//3. �⺻������ �������� �Ǽ������� �ڵ� ����ȯ�� ����������,
	//	  �Ǽ����� ���������� ���� ����ȯ�� �ؾ� �Ѵ�.
	public void rule1() {
		boolean flag = true;
		// flag = 1; // boolean�� true�� false�� ���� �� �����Ƿ� ����ȯ���� ����
		
		//�ڷ����� �ٸ����� ���� ũ���� ���� Ÿ���� ū ���� Ÿ������ ������ �� �ִ�.
		//=> �ڵ�����ȯ
		//������ ū ����Ÿ���� ���� ���� Ÿ������ �ڵ� ��ȯ���� �ʱ� ������
		//����ȯ�� �����(����)�� �ؾ��Ѵ�
		//=> ���� ����ȯ
		
		//�ڵ� ����ȯ�� �Ͼ
		int num = 'a';
		System.out.println(num);
		
		char ch = 65;
		System.out.println("ch : "+ ch);
		
		// char ch2 = -1; //��ȣ��Ʈ�� ���⶧���� ��������
		// char�� intŸ�Ժ��� �����Ƿ� ���� ����ȯ�� �ʿ���
		char ch2 = (char)num;
		System.out.println("ch2 : " + ch2);
		//���� ���ͷ��� ���¿��� ���鼭 Ÿ���� ������.
		
		//������ ������ ������ char�� ���� ����ȯ�� �ϰ� �Ǹ�
		//char�� ��ȣ ��Ʈ�� ���� ������ ���ڷ� �ν����� ���Ѵ�.
		//����ǥ�� �ƴ� ���� ���ڸ� �ǹ���.
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3  : "+ ch3);
	}
	public void rule2() {
		//�ٸ� �ڷ��������� ������ ū �ڷ������� �ڵ� ����ȯ �� ����ó���ȴ�.
		int inum = 10;
		long lnum = 100;
		
		//int isum = inum + lnum; intŸ�԰� longŸ���� ����Ҷ�
								//ū Ÿ���� long���� �ڵ� ����ȯ�� �ǹǷ� int isum�� ��� �� ����
		//��� 1. ���� ����� int�� ���� ����ȯ�Ѵ�.
		int isum = (int)(inum + lnum);  
		
		//��� 2. long�� ���� int�� ���� ����ȯ�Ѵ�.
		int isum2 = inum + (int)lnum;
		
		//��� 3. 
		long isum3 = inum + lnum;
	
		System.out.println("isum : " + isum);
		System.out.println("isum2 : " + isum2);
		System.out.println("isum3 : " + isum3);
		
		//������ byte�� short�� �������� ������ int�� �ȴ�.
		byte bnum = 1;
		short snum = 2;
		
		//���� ����ȯ�� ������ ���
		short sum = (short)(bnum + snum);
		//���� ����� int������ �����ϴ� ���
		int sum2 = bnum + snum;
		
	}
	public void rule3() {
		//������ �Ǽ��� �ڵ� ����ȯ�� �ȴ�.
		long lnum = 100000000001L;
		
		float fnum = lnum;
		System.out.println("fnum : " + fnum);
		//�Ǽ��� ������ ������ �� ���� ����ȯ�� �� ��� �Ѵ�.
		double dnum = 10.8;
		
		int inum = (int)dnum; // int�� ����ȯ�ϸ鼭 �Ҽ��� ����
		System.out.println("inum : " + inum);
	}
	public void testDataloss() {
		//������ �ս� �׽�Ʈ
		int inum = 300;
		System.out.println("inum : " + inum);
		
		byte bnum = (byte)inum;
		System.out.println("bnum : " + bnum);
		
	}
	
	
	public static void main(String[] args) {
		F_����ȯ�׽�Ʈ test = new F_����ȯ�׽�Ʈ();
		//test.rule1();
		//test.rule2();
		//test.rule3();
		test.testDataloss();
	}
	
	
}
