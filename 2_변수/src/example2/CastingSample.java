package example2;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class CastingSample {
	Scanner scan = new Scanner(System.in);
	ArrayList<String> arr = new ArrayList<>();
	public void printUnicode() {
		System.out.println("유니코드로 변환하시려는 문자를 입력해 주세요");
		char ch = scan.next().charAt(0);
		int uniNum = ch;
		System.out.println(ch +"is unicode : " + uniNum );
	}
	public void calculaorScore() {
		arr.add("kor");
		arr.add("en");
		arr.add("ma");
		double kor,en,ma;
		System.out.println("국어 점수를 입력해주세요 : ");
		kor = scan.nextDouble();
		System.out.println("영어 점수를 입력해주세요 : ");
		en = scan.nextDouble();
		System.out.println("수학 점수를 입력해주세요 : ");
		ma = scan.nextDouble();
		
		int sum = (int)(kor+en+ma);
		int avg = sum/3;
		System.out.println("총점 : " +sum);
		System.out.println("평균 : " +avg);
	}
	public void calcularScore() {
		
	}
	
}
