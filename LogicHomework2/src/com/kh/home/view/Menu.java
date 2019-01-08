package com.kh.home.view;
import java.util.Scanner;
import com.kh.home.model.*;
public class Menu {
	static Scanner scan = new Scanner(System.in);
	final static String MENU_VALUE_ERROR = "잘못된 값입니다";
	final static String MENU_SELECT = "메뉴 선택 : ";
	final static String MENU_RETURN = "이전 메뉴로 돌아갑니다";
	
	public static void mainMenu(){
		boolean run = true;
		int menuNum = 0;
		do {
			System.out.println(" ***** 프로그래밍 기본 기능 테스트 프로그램 *****");
			System.out.println();
			System.out.println("  1. 변수 테스트");
			System.out.println("  2. 기본 자료형 테스트");
			System.out.println("  3. if문 테스트");
			System.out.println("  4. switch문 테스트");
			System.out.println("  5. for문 테스트");
			System.out.println("  6. while문 테스트");
			System.out.println("  7. do~while문 테스트");
			System.out.println("  8. break문 테스트");
			System.out.println("  9. continue문 테스트");
			System.out.println("  10. static 메소드 사용 테스트");
			System.out.println("  11. non-static 메소드 사용 테스트");
			System.out.println("  12. 프로그램 종료");
			System.out.println("  메뉴 번호 입력 : ");
			menuNum = scan.nextInt();
			
			switch(menuNum) {
			case 1: subVarMenu(); break;
			case 2: subPTypeMenu(); break;
			case 3: subIfMenu(); break;
			case 4: subSwitchMenu(); break;
			case 5: subForMenu(); break;
			case 6: subWhileMenu(); break;
			case 7: subDoWhileMenu(); break;
			case 8: subBreakMenu(); break;
			case 9: subContinueMenu(); break;
			case 10: subStaticMethodMenu(); break;
			case 11: subNonStaticMethodMenu(); break;
			case 12: System.out.println("프로그램이 종료됩니다");
					 run = false;
					 break;
				default : System.out.println(MENU_VALUE_ERROR); continue;
			}
			
		}while(run);
		
	}
	public static void subVarMenu(){
		VariableSample vSam = new VariableSample();
		do {
			System.out.println(" *** 변수 테스트 부메뉴 *** ");
			System.out.println();
			System.out.println(" 1. 내 신상정보 변수에 담아 출력하기");
			System.out.println(" 2. 사원정보를 키보드로 입력받아 출력하기");
			System.out.println(" 3. 기본 자료형 변수의 초기값 확인하기");
			System.out.println(" 4. 이전 메뉴로 가기");
			System.out.println(MENU_SELECT);
			int menuNum = scan.nextInt();
			switch(menuNum) {
			case 1: vSam.myProfile(); break;
			case 2: vSam.empInformation(); break;
			case 3: vSam.defaultValue(); break;
			case 4: System.out.println(MENU_RETURN);
					return;
			default : System.out.println(MENU_VALUE_ERROR); 
					continue;
			}
			
		}while(true);
	}
	public static void subPTypeMenu(){
		PrimitiveTypeSample pSam = new PrimitiveTypeSample();
		do {
			System.out.println(" *** 기본자료형 테스트 부메뉴 ***");
			System.out.println("");
			System.out.println(" 1. 기본자료형 메모리 할당크기 확인하기");
			System.out.println(" 2. 기본자료형 값의 최소값, 최대값 출력하기");
			System.out.println(" 3. 기본자료형 비트갯수 확인하기");
			System.out.println(" 4. 이전 메뉴로 가기");
			System.out.println(MENU_SELECT);
			int menuNum = scan.nextInt();
			switch(menuNum) {
			case 1: pSam.typeSize(); break;
			case 2: pSam.minMaxValue(); break;
			case 3: pSam.bitSize(); break;
			case 4: System.out.println(MENU_RETURN);
					return;
			default : System.out.println(MENU_VALUE_ERROR); 
					continue;
			}
		}while(true);
	}
	public static void subIfMenu(){
		IfSample iSam = new IfSample();
		do {
			System.out.println(" *** if문 테스트 부메뉴 ***");
			System.out.println("1. 두 개의 정수를 입력받아, 두 수중 큰 값 출력하기");
			System.out.println("2. 두 개의 정수를 입력받아, 두 수중 작은 값 출력하기");
			System.out.println("3. 세 개의 정수를 입력받아, 세 수중 가장 큰수와 가장 작은수 출력하기");
			System.out.println("4. 한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기");
			System.out.println("5. 국,영,수 세 과목의 점수를 입력받아, 합격/불합격 확인하기");
			System.out.println("6. 점수를 입력받아, 학점 확인하기");
			System.out.println("7. 한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기");
			System.out.println("8. 문자 하나를 입력받아, 영어대문자인지 소문자인지 숫자문자인지 기타문자인지 확인하기");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.println(MENU_SELECT);
			int menuNum = scan.nextInt();
			switch(menuNum) {
			case 1: iSam.maxNumber(); break;
			case 2: iSam.minNumber(); break;
			case 3: iSam.threeMaxMin(); break;
			case 4: iSam.checkEven(); break;
			case 5: iSam.isPassFail(); break;
			case 6: iSam.scoreGrade(); break;
			case 7: iSam.checkPlusMinusZero(); break;
			case 8: iSam.whatCaracter(); break;
			case 9: System.out.println(MENU_RETURN);
					return;
			default : System.out.println(MENU_VALUE_ERROR);
					continue;
			}
			
		}while(true);
	}
	public static void subSwitchMenu(){
		SwitchSample sSam = new SwitchSample();
		do {
			System.out.println("*** switch문 테스트 부메뉴 ***");
			System.out.println("");
			System.out.println("1. 두 개의 정수와 한 개의 연산문자를 입력받아 계산한 결과 확인하기");
			System.out.println("2. 과일이름을 문자열로 입력받아, 그 과일의 가격 출력하기");
			System.out.println("3. 이전 메뉴로 가기");
			System.out.println(MENU_SELECT);
			int menuNum = scan.nextInt();
			switch(menuNum) {
			case 1: sSam.calculator();break;
			case 2: sSam.fruitPrice();break;
			case 3: System.out.println(MENU_RETURN);
					return;
			default : System.out.println(MENU_VALUE_ERROR);
					continue;
			}

		}while(true);
	}
	public static void subForMenu(){
		ForSample fSam = new ForSample();
		do {
			System.out.println(" *** for문 테스트 부메뉴 ***");
			System.out.println("");
			System.out.println("1. 1~10까지 정수들의 합계 구하기");
			System.out.println("2. 1~100사이의 짝수들의 합게 구하기");
			System.out.println("3. 정수 하나 입력받아, 그 수의 구구단 출력하기");
			System.out.println("4. 두 개의 정수를 입력받아, 두 수중 작은 값에서 큰 값까지의 합계 구하기");
			System.out.println("5. 줄수와 칸수 입력받아, 입력된 줄수/칸수만큼 별표문자 출력하기");
			System.out.println("6. 7줄에 7칸에 별표문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자 출력하기");
			System.out.println("7. 줄수를 입력받아, 삼각형 모양으로 별표문자 출력하기(양수:직각삼각형, 음수:역삼각형)");
			System.out.println("8. 구구단 2단부터 9단까지 출력하기");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.println(MENU_SELECT);
			int menuNum = scan.nextInt();
			switch(menuNum) {
			case 1: fSam.sum1To10(); break;
			case 2: fSam.sumEven1To100(); break;
			case 3: fSam.oneGugudan(); break;
			case 4: fSam.sumMinToMax(); break;
			case 5: fSam.printStar(); break;
			case 6: fSam.printNumberStar(); break;
			case 7: fSam.printTriangleStar(); break;
			case 8: fSam.guguDan(); break;
			case 9:System.out.println(MENU_RETURN);
					return;
			default : System.out.println(MENU_VALUE_ERROR);
					continue;
			}
			
		}while(true);
	}
	public static void subWhileMenu(){
		WhileSample wSam = new WhileSample();
		do {
			System.out.println("*** while문 테스트 부메뉴 ***");
			System.out.println("");
			System.out.println("1. 문자 하나 입력받아, 그 문자의 유니코드 출력 반복('0' 입력되면 반복종료)");
			System.out.println("2. 1~100까지 정수들의 합계 출력하기(while 문으로 작성)");
			System.out.println("3. 1~100사이의 임의의 정수를 발생시켜, 숫자 알아맞추기");
			System.out.println("4. 문자열을 입력받아, 글자 갯수 알아내어 출력하기");
			System.out.println("5. 문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기");
			System.out.println("6. 이전 메뉴로 가기");
			System.out.println(MENU_SELECT);
			int menuNum = scan.nextInt();
			switch(menuNum) {
			case 1 : wSam.printUniCode(); break;
			case 2 : wSam.sum1To100(); break;
			case 3 : wSam.numberGame(); break;
			case 4 : wSam.countCharacter(); break;
			case 5 : wSam.countInChar(); break;
			case 6 : System.out.println(MENU_RETURN);
					return;
			default : System.out.println(MENU_VALUE_ERROR);
					continue;
			
			}
			
		}while(true);
	}
	public static void subDoWhileMenu(){
		DoWhileSample dwSam = new DoWhileSample();
		do {
			System.out.println("*** do~while문 테스트 부메뉴 ***");
			System.out.println("");
			System.out.println("1. 문자열값 입력받아, 문자 사이에 '-' 끼워넣어 출력하기");
			System.out.println("2. 버거킹 메뉴 주문 테스트");
			System.out.println("3. 문자열 입력받아, \"모든 글자 영문자다\"/\"영문자 아니다.\" 출력하기");
			System.out.println("4. 이전 메뉴로 가기");
			System.out.println(MENU_SELECT);
			int menuNum = scan.nextInt();
			switch(menuNum) {
			case 1 : dwSam.addDashToken(); break;
			case 2 : dwSam.burgerKingMenu(); break;
			case 3 : dwSam.isStringAlphabet(); break;
			case 4 : System.out.println(MENU_RETURN);
					return;
			default : System.out.println(MENU_VALUE_ERROR);
					continue;
			
			}
			
		}while(true);
	}
	public static void subBreakMenu(){
		BreakSample bSam = new BreakSample();
		do {
			System.out.println(" *** break문 테스트 부메뉴 ***");
			System.out.println("");
			System.out.println("1. 1~100까지 정수들의 합계 출력하기(break문 사용)");
			System.out.println("2. 구구단 1단~9단까지 출력하되, * 5 계산에서 반복문 빠지기(break 이름 사용)");
			System.out.println("3. 이전 메뉴로 가기");
			System.out.println(MENU_SELECT);
			int menuNum = scan.nextInt();
			switch(menuNum) {
			case 1 : bSam.sumBreak(); break;
			case 2 : bSam.guguDanBreak(); break;
			case 3 : System.out.println(MENU_RETURN);
					return;
			default : System.out.println(MENU_VALUE_ERROR);
					continue;
			}
			
		}while(true);
	}
	public static void subContinueMenu(){
		ContinueSample cSam = new ContinueSample();
		do {
			System.out.println("*** continue문 테스트 부메뉴 ***");
			System.out.println("");
			System.out.println("1. 1~100까지의 정수 중 3의 배수를 뺀 정수들의 합계 출력하기");
			System.out.println("2. 3행 5열의 행열값 출력하되, 1행 3열부터 1행 5열까지 생략하고 출력하기");
			System.out.println("3. 이전 메뉴로 가기");
			System.out.println(MENU_SELECT);
			int menuNum = scan.nextInt();
			switch(menuNum) {
			case 1 : cSam.sumJumpThree(); break;
			case 2 : cSam.rowColJump(); break;
			case 3 : System.out.println(MENU_RETURN);
					return;
			default : System.out.println(MENU_VALUE_ERROR);
					continue;
			}
			
		}while(true);
	}
	public static void subStaticMethodMenu(){
		StaticMethodSample smSam = new StaticMethodSample();
		do {
			System.out.println("*** static 메소드 사용 테스트 부메뉴 ***");
			System.out.println("");
			System.out.println("1. Math 클래스의 랜덤값 구하는 메소드 : 1~45사이의 임의의 정수 출력");
			System.out.println("2. Math 클래스의 실수값에 대한 절대값 구하는 메소드 : -12.77 절대값 출력하기");
			System.out.println("3. Math 클래스의 두 정수중 큰값 구하는 메소드 : 120, 54 중 큰값 출력하기");
			System.out.println("4. 이전 메뉴로 가기");
			System.out.println(MENU_SELECT);
			int menuNum = scan.nextInt();
			switch(menuNum) {
			case 1 : smSam.testMathRandom(); break;
			case 2 : smSam.testMathAbs(); break;
			case 3 : smSam.testMathMax(); break;
			case 4 : System.out.println(MENU_RETURN);
				return;
			default : System.out.println(MENU_VALUE_ERROR);
					continue;
			}
			
		}while(true);
	}
	public static void subNonStaticMethodMenu(){
		NonStaticMethodSample nsmSam = new NonStaticMethodSample();
		do {
			System.out.println("*** non-static 메소드 사용 테스트 부메뉴 ***");
			System.out.println("");
			System.out.println("1. Scanner 클래스 사용 : 자료형 종류별로 값 입력받아 출력하기");
			System.out.println("2. Date 클래스 사용 : 오늘 날짜, 현재 시간 정보 출력하기");
			System.out.println("3. Random 클래스 사용 : 정수와 실수에 대한 난수 출력하기");
			System.out.println("4. 이전 메뉴로 가기");
			System.out.println(MENU_SELECT);
			int menuNum = scan.nextInt();
			switch(menuNum) {
			case 1 : nsmSam.testScanner(); break;
			case 2 : nsmSam.testDate(); break;
			case 3 : nsmSam.testRandom(); break;
			case 4 : System.out.println(MENU_RETURN);
					return;
			default : System.out.println(MENU_VALUE_ERROR);
					continue;
			}
			
		}while(true);
	}

}
