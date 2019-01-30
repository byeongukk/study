package com.kh.gui.part03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class C_TextArea {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		//입력용 텍스트 필드
		JTextField tf = new JTextField(30);
		
		//출력용 텍스트 필드
		JTextArea ta = new JTextArea(10,10);
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				ta.append(text + "\n");
			
				/*tf.selectAll();*/
				//text를 빈공간으로 만들고 포커스를 제일 앞에 고정
				tf.setText("");
				tf.requestFocus();
			}
		});
		
		mf.add(tf, "North");
		mf.add(ta, "Center");
		
		mf.pack();
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
