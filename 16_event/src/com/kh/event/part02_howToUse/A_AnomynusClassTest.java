package com.kh.event.part02_howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class A_AnomynusClassTest {
	public static void main(String[] args) {
		//익명클래스를 사용하는 방법
		JFrame mf = new JFrame("익명클래스 예제");
		
		mf.setSize(300, 200);
		
		JPanel panel = new JPanel();
		JButton button = new JButton("버튼을 눌러보세요");
		JLabel label = new JLabel("아직 버튼이 눌려지지 않았습니다");
		
		button.addActionListener(new ActionListener() {
			//지역변수를 사용할 수 있다
			//접근하기 용이하나,
			//재사용이 불가능
			@Override
			public void actionPerformed(ActionEvent e) {
				//이벤트 실행 내용을 적는다
				//e.getSource 이벤트의 내용
				if(e.getSource() == button) {
					label.setText("드디어 버튼이 눌려졌습니다");
				}
			}
		});
		
		panel.add(button);
		panel.add(label);
		
		mf.add(panel);
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}
}
