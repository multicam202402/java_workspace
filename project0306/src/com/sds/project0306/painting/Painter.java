package com.sds.project0306.painting;

import javax.swing.JFrame;

//그림판을 만들어보자
public class Painter extends JFrame{
	PaintCanvas can;
	
	public Painter() {
		can = new PaintCanvas(); //캔버스 생성 
		
		add(can);
		
		setSize(1400, 800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Painter();
	}
	
}
