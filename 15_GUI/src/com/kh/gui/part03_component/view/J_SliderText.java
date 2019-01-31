package com.kh.gui.part03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class J_SliderText {

	public static void main(String[] args) {
		JFrame mf = new JFrame("슬라이더 테스트");
		
		mf.setSize(500,300);
		
		JPanel panel1 = new JPanel();
		JLabel label = new JLabel("슬라이더를 움적여 보세요", JLabel.CENTER);
		
		panel1.add(label);
		
		JPanel panel2 = new JPanel();
		JSlider slider = new JSlider(0,30,15);//최소,최대,기본
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		panel2.add(slider);
		
		JButton button = new JButton("전송");
		panel2.add(button);
		
		JPanel panel3 = new JPanel();
		JLabel text = new JLabel("결과값 : ");
		panel3.add(text);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText(slider.getValue()+"");
				
			}
		});
		
		mf.add(panel1,"North");
		mf.add(panel2, "Center");
		mf.add(panel3, "South");
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
