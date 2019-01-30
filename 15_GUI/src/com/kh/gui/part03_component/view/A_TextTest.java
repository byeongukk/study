package com.kh.gui.part03_component.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class A_TextTest {
	public static void main(String[] args) {
		JFrame mf = new JFrame();
		/*mf.setSize(800,300);*/
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(3,2));
		/*panel.setSize(800,300);*/
		
		//글을 입력할 수 있는 텍스트 상자를 TextField라고 한다
		JTextField id = new JTextField(30);
		panel.add(new JLabel("ID"));
		panel.add(id);
		
		//비밀번호를 입력할 수 있는 TextField를 PasswordField라고 한다
		//입력되는 값을 화면상에서 볼 수 없으며 한글을 입력할 수도 없다.
		JPasswordField password = new JPasswordField(30);
		panel.add(new JLabel("PASSWORD"));
		panel.add(password);
		
		//여러 줄의 텍스트를 입력할 수 있는 상자를 textArea라고 한다.
		//TextArea(row, col)
		JTextArea textArea = new JTextArea(10,30);
		//내용을 수정 할 수 없도록 한다(ReadOnly)
		textArea.setEditable(false);
		
		JButton btn = new JButton("보내기");
		
		//보내기 버튼을 눌렀을 때 이벤트 동작 연결
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "id = " + id.getText() + "\n";
				text += "password = " + password.getPassword() + "\n";
				
				char[] pass = password.getPassword();
				
				for(int i = 0; i < pass.length; i++) {
					System.out.print(pass[i]);
				}
				
				textArea.append(text);
			}
		});
		
		
		mf.add(panel, BorderLayout.NORTH);
		mf.add(textArea, BorderLayout.CENTER);
		mf.add(btn, BorderLayout.SOUTH);
		
		
		//컴포넌트의 크기에 맞게 프레임을 조절한다.
		mf.pack();
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
