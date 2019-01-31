package com.kh.event.part02_howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class B_OtherClassTest extends JFrame{
	private JButton button;
	private JLabel label;
	
	
	
	
	public B_OtherClassTest() {
		this.setTitle("다른 클래스 테스트");
		this.setSize(300,200);
	
		JPanel panel = new JPanel();
		button = new JButton("버튼을 눌러보세요");
		label = new JLabel("아직 버튼이 눌러지지 않았습니다.");
		
		button.addActionListener(new MyEvent(button,label));
		
		
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}

class MyEvent implements ActionListener{
	private JButton button;
	private JLabel label;
	
	public MyEvent(JButton button, JLabel label) {
		this.button = button;
		this.label = label;
	}
	
		
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			label.setText("드디어 버튼이 눌러졌습니다");
		}
	}
	
}




























