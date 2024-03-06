package com.sds.project0306.painting;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

//그림이 그려질 캔버스 정의
public class PaintCanvas extends Canvas{
	
	public PaintCanvas() {
		this.setBackground(Color.YELLOW);
	}
	
	@Override
	public void paint(Graphics g) {
		//선이란, 점의 연결 
		g.fillOval(100, 100, 30, 30); // 채워진 원을 그리자
	}
}
