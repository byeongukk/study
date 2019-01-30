package com.kh.gui.part01_container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameTest1 extends JFrame {


	//프레임을 생성하는 방법1
	//javax.swing.JFream 클래스를 상속받아 생성자에서 프레임에 대한 설정 후
	//다른 클래스에서 호출하는 방식
	public JFrameTest1() {
		/*super();*/
		//프레임 위치와 크기 설정
/*		this.setLocation(300, 200);
		this.setSize(800, 500);*/
		
		//위치와 사이즈를 한 번에 지정
		this.setBounds(300,200,800,500);
		
		//프레임 상단에 이름 설정하기
		this.setTitle("Monster");
		
		//프레임 사이즈 조절 못하게 함
		this.setResizable(false);
		
		//프레임 상단에 기본 자바 로고 변경
		try {
			this.setIconImage(ImageIO.read(new File("images/icon.Png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//닫기버튼(x 버튼)을 눌러도 프로세스는 계속 실행중이므로
		//아래 메소드를 실행시켜야 프레임을 종료시 프로세스도 정상 종료 된다.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//프레임을 화면에 보여지게 하는 메소드
		this.setVisible(true);
		////////////////////////
		/*this.setBounds(300,200,800,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);*/
		///////////////이상 필수작성 코드
		
		
	}
}





























