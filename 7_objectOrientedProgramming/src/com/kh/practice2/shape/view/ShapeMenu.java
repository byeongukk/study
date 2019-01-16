package com.kh.practice2.shape.view;

import java.util.Scanner;

import com.kh.practice2.shape.controller.TriangleManager;
import com.kh.practice2.shape.model.vo.Shape;

public class ShapeMenu {
	public void inputMenu() {
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		//반복문을 이용해 메뉴 실행
		do {
			System.out.println("===== 도형계산기 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사격형");
			System.out.println("9. 프로그램종료");
			System.out.println("==================");
			System.out.print("계산하려는 도형을 선택하세요 :");
			int menuNum = scan.nextInt();
			double height,width;
			switch(menuNum) {
				case 3 :
					System.out.println("도형의 높이를 입력하세요 : ");
					height = scan.nextDouble();
					System.out.println("도형의 너비를 입력하세요 : ");
					width = scan.nextDouble();
					Shape tri = new Shape(menuNum,height,width);
					triangleMenu(tri);
					break;
				case 4 : 
					System.out.println("도형의 높이를 입력하세요 : ");
					height = scan.nextDouble();
					System.out.println("도형의 너비를 입력하세요 : ");
					width = scan.nextDouble();
					Shape sqr = new Shape(menuNum,height,width);
					squareMenu(sqr);
					break;
				case 9 : System.out.println("프로그램이 종료됩니다 ");
						run = false; break;
				default : System.out.println("계산할 수 없는 도형입니다 다시입력하세요");
				
			}
			
			
		
		}while(run);
		
	}
	public void triangleMenu(Shape s) {
		TriangleManager tm = new TriangleManager();
		boolean run = true;
		do {
			System.out.println("==== 삼각형 계산기 ==== ");
			System.out.println("1. 삼각형의 둘레 구하기 ");
			System.out.println("2. 삼각형의 면적 구하기");
			System.out.println("3. 선택한 도형 정보 출력하기");
			System.out.println("4. 도형의 색상 칠하기 ");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println("===================");
			
		}while(run);
		
		
	}
	public void squareMenu(Shape s) {
		
	}
}
