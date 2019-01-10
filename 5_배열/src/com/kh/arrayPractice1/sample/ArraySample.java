package com.kh.arrayPractice1.sample;

import java.util.Random;
import java.util.Scanner;

public class ArraySample {
	Scanner scan = new Scanner(System.in);	
	
	public void test1() {
		int sum=0;
		int[] arr = new int[10];
		Random ran = new Random();
		for(int i=0; i<arr.length; i++) {
			int random = ran.nextInt(100)+1;
			arr[i] = random;
			System.out.println(i+1 + "번 : " + arr[i]);
			sum += arr[i];
		}
		System.out.println("합계 : " + sum);
	}
	public void test2() {
		int min=0,max=0;
		int[] arr = new int[10];
		Random ran = new Random();
		for(int i=0; i<arr.length; i++) {
			int random = ran.nextInt(100)+1;
			arr[i] = random;
			System.out.println(i+1 + "번 : " + arr[i]);
			if(i==0) {
				min = arr[i];
				max = arr[i];
			} else {
				if(max<=arr[i]) {
					max = arr[i];
				} else if(min>=arr[i]) {
					min = arr[i];
				}
			}
		}
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	
	}
	public void test3() {
		byte barr[] = new byte[10];
		Random ran = new Random();
		int sum = 0;
		for(int i=0; i<barr.length; i++) {
			barr[i] = (byte)(ran.nextInt(255)-Byte.MAX_VALUE);
			System.out.println(i+1+"번째 : "+barr[i]);
			if(barr[i]%2==0) {
				System.out.println(i+1+"번째는 짝수");
				sum += barr[i];
			}
		}
		System.out.println(sum);
	}
	public void test4() {
		String strNum = null;
		System.out.print("숫자를 입력하세요");
		strNum = scan.nextLine();
		int sum = 0;
		int[] arr = new int[strNum.length()];
		for(int i=0; i<strNum.length(); i++) {
			arr[i] = Integer.parseInt(strNum.substring(i, i+1)); 
			sum += arr[i];
		}
		System.out.println("각자리를 더한 값은" + sum);
	}
	public void test5() {
		String strNum = null;
		System.out.print("숫자를 입력하세요");
		strNum = scan.nextLine();
		int sum = 0;
		int[] arr = new int[strNum.length()];
		for(int i=0; i<strNum.length(); i++) {
			arr[i] = (int)(strNum.charAt(i)-48);
			sum += arr[i];
		}
		System.out.println("각자리를 더한 값은" + sum);
	}
	public void test7() {
		int iarr[] = new int[10];
		for(int i = 0 ; i < iarr.length; i++) {
			iarr[i] = i+1;
			System.out.println("iarr["+i+"] : " + iarr[i]);
		}
	}
	public void test8() {
		String[] fruit = {"딸기","바나나","복숭아","키위","사과"};
		System.out.println(fruit[1]);
		
		for(int i = 0; i < fruit.length; i++) {
			if(fruit[i].equals("바나나")) {
				System.out.println( fruit[i] );
			}
		}
	}
	public void test9() {
		System.out.print("문자열을 입력하세요  : ");
		String str = scan.nextLine();
		char[] ch = new char[str.length()];
		
		System.out.println("검색하실 문자값을 입력하세요");
		char ch2 = scan.nextLine().charAt(0);
		
		
		
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			if(ch[i]==ch2) {
				count ++;
			}
		}
		System.out.println(" 입력값 : " + str);
		System.out.println(" 검색값 : " + ch2);
		System.out.println("입력하신 문자열  " + str + "에서 찾으시는 문자 " + ch2 + "은" + count + "개 입니다" );
		
	}
	public void test10() {
		
		System.out.print("주민등록번호를 입력하세요 : ");
		String str = "";
		String jumin = scan.nextLine().replace("-", "");
		char carr[] = new char[jumin.length()];
		for(int i = 0; i<carr.length; i++) {
			carr[i] = jumin.charAt(i);
			//6번째 자리에 "-" 추가하기
			if(i != 6) {
				str += carr[i];
			} else {
				str += "-"+carr[i];
			}
		}
		System.out.println("암호화 전 : " + str);
		
		str = "";
		char cloneNum[] = carr.clone();
		for(int i=0; i < cloneNum.length; i++) {
			if(i>=7) {
				cloneNum[i] = '*';
			}
			if(i != 6) {
				str += cloneNum[i];
			} else {
				str += "-"+cloneNum[i];
			}
		}
		System.out.println("암호화 후 : " + str);
	}
	public void test11() {
		do {
			System.out.print("홀수인 양의 정수 하나 입력 : ");
			int num = scan.nextInt();
			int arr[] = new int[num];
			
			if(num%2 != 0) {
				for(int i = 0,j = arr.length; i < arr.length; i++,j--) {
					if(arr.length/2>=i) {
						arr[i] = i+1;
					} else {
						arr[i] = j;
					}
				}
			} else if(num<0) {
				System.out.println("값은 0보다 커야합니다");
			} else if(num%2 == 0) {
				System.out.println("홀수를 입력하셔야 합니다");
			}
			for(int i=0; i < arr.length; i++) {
				System.out.print(arr[i] + ",");
			}
			break;
		}while(true);
	
	
	
	
		
	}
	public void test12() {
		int lottoNum[] = new int[6];
		Random ran = new Random();
		
		//6자리 랜덤값 생성
		for(int i=0; i<lottoNum.length; i++) {
			lottoNum[i] = ran.nextInt(45)+1;
		}
		//오름차순으로 정렬
		for(int i=0; i<lottoNum.length; i++) {
			for(int j=0; j < i; j++) {
				if(lottoNum[i] < lottoNum[j]) {
					int temp;
					temp = lottoNum[i];
					lottoNum[i] = lottoNum[j];
					lottoNum[j] = temp;
				}
			}
		}
		//출력
		for(int i = 0; i < lottoNum.length; i++) {
			System.out.println(i+1 +"번째 번호 : " + lottoNum[i]);
		}
		
	
	
	}
}
