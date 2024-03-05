package com.sds.project0305.chat;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class ChatA extends Frame{
								/* is a */
	TextArea area; //html 에서의 textarea 와 동일
	Panel p_south;
	TextField t;
	Button bt;
	
	public ChatA() {
		area = new TextArea();
		p_south = new Panel();
		t = new TextField(15);
		bt = new Button("open");
		
		//스타일 적용 
		area.setBackground(Color.YELLOW);
		
		//조립 
		add(area); //BorderLayout.CENTER 부착
		p_south.add(t);//판자에 텍스트 필드 부착
		p_south.add(bt); //판자에 버튼 부착 
		
		add(p_south, BorderLayout.SOUTH);//판자를 남쪽 영역에 부착 
		
		setSize(300,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ChatA();
	}

}
