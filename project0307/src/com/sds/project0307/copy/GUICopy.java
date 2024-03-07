package com.sds.project0307.copy;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUICopy extends JFrame{
	JLabel la_ori, la_dest;
	JTextField t_ori, t_dest;
	JButton bt;
	
	public GUICopy() {
		la_ori = new JLabel("원본 위치");
		la_dest = new JLabel("복사 위치");
		
		t_ori  = new JTextField();
		t_dest  = new JTextField();
		
		bt = new JButton("복사 실행");
		
		//스타일 
		Dimension d1 = new Dimension(180, 35);
		Dimension d2 = new Dimension(500, 35);
		
		la_ori.setPreferredSize(d1);
		la_dest.setPreferredSize(d1);
		
		t_ori.setPreferredSize(d2);
		t_dest.setPreferredSize(d2);
		
	}
	
	public static void main(String[] args) {
		new GUICopy();

	}

}
