package com.kh.variable;

public class D_����׽�Ʈ {

	public static void main(String[] args) {
		new D_����׽�Ʈ().testFinal();
		new D_����׽�Ʈ().testF();
	}
	public void testFinal() {
		//��� �׽�Ʈ
		int age;
		final int AGE; // ����� steak������ �߰���
		age = 20;
		AGE = 20;
		
		age = 30;
		// AGE = 30; ����� �ʱ�ȭ �ϸ� ���� �Ұ�
		System.out.println(AGE + 20);
	}
	public void testF() {
		int i = 300;
		System.out.println(i);
	}
}


