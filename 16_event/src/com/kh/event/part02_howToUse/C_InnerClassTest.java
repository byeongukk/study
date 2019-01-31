package com.kh.event.part02_howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C_InnerClassTest extends JFrame {
	private JButton button;
	private JLabel label;
	
	
	public C_InnerClassTest() {
		this.setSize(300,200);
		this.setTitle("내부 클래스 테스트");
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르세요");
		label = new JLabel("아직 버튼이 눌러지지 않았습니다");
		
		button.addActionListener(new MyEvent());
		
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	//내부클래스 사용 ,클래스가 가지는 멤버로서 사용가능
	private class MyEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				label.setText("드디어 버튼이 눌러졌습니다");
			}
		}
		
	}
	
	public static void main(String[] args) {
		new C_InnerClassTest();
	}
}
