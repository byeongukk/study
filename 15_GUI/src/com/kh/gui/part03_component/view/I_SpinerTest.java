package com.kh.gui.part03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.xml.soap.Text;

public class I_SpinerTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		mf.setSize(500,100);
		
		JPanel panel = new JPanel();
		
		//ListModel
		String[] items = {"소설","잡지","전공서적","취미"};
		
		SpinnerListModel listModel = new SpinnerListModel(items);
		JSpinner spinner1 = new JSpinner(listModel);
		panel.add(spinner1);
		
		
		//NumberModel
		SpinnerModel numberModel = new SpinnerNumberModel(1, 0, 9, 1);//시작값, 최소,최대 ,증가값
		JSpinner spinner2 = new JSpinner(numberModel);
		panel.add(spinner2);
		
		//DateModel
		Calendar calendar = Calendar.getInstance();
		Date value = calendar.getTime();		//현재 날짜
		calendar.add(Calendar.YEAR, -50);		//현재 날짜에서 -50년
		Date start = calendar.getTime();
		calendar.add(Calendar.YEAR, 100);		//현재날짜에서 +50년
		Date end = calendar.getTime();
		
		SpinnerDateModel dateModel = new SpinnerDateModel(value,start,end,Calendar.YEAR);
		JSpinner spinner3 = new JSpinner(dateModel);
		spinner3.setEditor(new JSpinner.DateEditor(spinner3, "yyyy/MM/dd"));
		panel.add(spinner3);
		
		JButton button = new JButton("전송");
		panel.add(button);
		
		
		
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel();
		resultPanel.add(text);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText(spinner1.getValue() + ", "
						+spinner2.getValue() +", "
						+spinner3.getValue());
				
			}
		});
		
		
		mf.add(panel,"North");
		mf.add(resultPanel, "Center");
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
