package example2;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class CastingSample {
	Scanner scan = new Scanner(System.in);
	ArrayList<String> arr = new ArrayList<>();
	public void printUnicode() {
		System.out.println("�����ڵ�� ��ȯ�Ͻ÷��� ���ڸ� �Է��� �ּ���");
		char ch = scan.next().charAt(0);
		int uniNum = ch;
		System.out.println(ch +"is unicode : " + uniNum );
	}
	public void calculaorScore() {
		arr.add("kor");
		arr.add("en");
		arr.add("ma");
		double kor,en,ma;
		System.out.println("���� ������ �Է����ּ��� : ");
		kor = scan.nextDouble();
		System.out.println("���� ������ �Է����ּ��� : ");
		en = scan.nextDouble();
		System.out.println("���� ������ �Է����ּ��� : ");
		ma = scan.nextDouble();
		
		int sum = (int)(kor+en+ma);
		int avg = sum/3;
		System.out.println("���� : " +sum);
		System.out.println("��� : " +avg);
	}
	public void calcularScore() {
		
	}
	
}
