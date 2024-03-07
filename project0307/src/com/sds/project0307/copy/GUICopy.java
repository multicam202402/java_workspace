package com.sds.project0307.copy;

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
		
		
	}
	
	public static void main(String[] args) {
		new GUICopy();

	}

}
