package com.kh.gui.part03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class B_TextFieldTest {

	public static void main(String[] args) {
		//숫자를 입력받아 제곱한 결과를 리턴하기
		JFrame mf = new JFrame();
		
		mf.setSize(300, 130);
		mf.setTitle("제곱 계산기");
		
		JPanel panel = new JPanel();
		
		panel.add(new JLabel("숫자 입력 : "));
		
		JTextField text = new JTextField(15);
		panel.add(text);
		
		panel.add(new JLabel("제곱한 값 : "));
		
		JTextField result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		JButton btn = new JButton("ok");
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int value = Integer.parseInt(text.getText());
				result.setText(value * value+"");
			
				//텍스트 상자로 포커스 되돌리기
				text.requestFocus();
			}
			
		});
		
		panel.add(btn);
		
		mf.add(panel);
		
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
