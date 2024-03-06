package com.sds.project0306.draw;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPic extends JFrame{
	MyCanvas can;//그림을 그릴 빈 도화지 객체, 다른 컴포넌트들(예, 버튼, 텍스트필드 등)은 개발자가 그림을 
					//뺏어서 그리면 본연의 디자인을 해치므로, 특별한 이유가 아니면 그림을 뺏어그리지 말아야 하지만, 
					// Canvas  는 오히려 개발자가 적극적으로 그림을 그려야 하는 컴포넌트이다
					//사실  JPanel도 그림을 그리는데 아주 아주 많이 사용함 
	
	JPanel p_south;
	JButton bt;
	
	public MyPic() {
		can = new MyCanvas();//빈 도화지 생성 
		p_south = new JPanel();
		bt = new JButton("action");
		
		//style 부여 
		can.setBackground(Color.YELLOW);
		
		//can.paint();//재정의 아니라 호출, 호출은 시스템이 하는 거임.
		
		//조립 
		add(can); //도화지를 센터에 부착 
		p_south.add(bt); //패널에 버튼 부착 
		add(p_south, BorderLayout.SOUTH);//남쪽에 패널 부착 
		
		//닫기 버튼 누르면, 프로세스 종료하는 메서드 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //System.exit(0) 동일
		
		setSize(800,700);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyPic();
	}

}
