package com.kh.variable;

public class A_�������� {
	//��Ű���� �ٸ��� ���� �̸��� Ŭ������ ���� �� �ִ�.
	//Ŭ������ �̸��� ��� ��Ű���� ������ �̸��̱� �����̴�.
	//ex) com.kh.variable.A_�������� <- ���� Ŭ������ fullName
	public void declareVariable() {
		//������
		//������
		byte bnum;
		short snum;
		int inum;
		long lnum;
		//�Ǽ���
		float fnum;
		double dnum;
		
		//��
		boolean  isTrue;
		
		//����
		char ch;
		
		//������
		String str; //�̹� ��������ִ� class  ���� ����
		
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8;  //L �� ������ �ʾƵ� �ڵ� ����ȯ�� �ǹǷ� ��밡��
		
		fnum = 4.0f; //float�� ���ͷ��� f�� �ٿ��� �Ѵ�.
		dnum = 8.0;
		
		isTrue = false; // true �� false �� ����Ѵ�
		
		ch = 'A';
		str = "A"; //���ڸ� �� ���� �ᵵ ���ͷ��� ""�� ����ؾ� �Ѵ�.
		
		//������ ����� �� ����ϱ�
		System.out.println("bnum�� ��" + bnum);
		System.out.println("snum�� ��" + snum);
		System.out.println("inum�� ��" + inum);
		System.out.println("lnum�� ��" + lnum);
		
		System.out.println("fnum�� ��" + fnum);
		System.out.println("dnum�� ��" + dnum);
		
		System.out.println("isTrue�� ��" + isTrue);
		
		System.out.println("ch�� ��" + ch);
		
		System.out.println("str�� ��" + str);
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
	}
	
	public void initVariable() {
		//���� ����� ���ÿ� �ʱ�ȭ
		//������
		//������
		byte bnum = 1;
		short snum = 2;
		int inum = 4;
		long lnum = 8;
		//�Ǽ���
		float fnum = 4.0f;
		double dnum = 8.0;
		
		//��
		boolean  isTrue = true;
		
		//����
		char ch = 'A';
		//���ڿ�
		String str = "A";
		
		//������ ����� �� ����ϱ�
		System.out.println("bnum�� ��" + bnum);
		System.out.println("snum�� ��" + snum);
		System.out.println("inum�� ��" + inum);
		System.out.println("lnum�� ��" + lnum);
		
		System.out.println("fnum�� ��" + fnum);
		System.out.println("dnum�� ��" + dnum);
		
		System.out.println("isTrue�� ��" + isTrue);
		
		System.out.println("ch�� ��" + ch);
		
		System.out.println("str�� ��" + str);
	}
	
	public static void main(String[] args) {
		A_�������� test = new A_��������();
		test.declareVariable();
		test.initVariable();
	}
}
