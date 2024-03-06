package com.sds.project0306.gallery;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class MyCanvas extends Canvas{
	int index; //몇번째 이미지를 접근해야 할지를 결정짓는 변수
	
	String[] filename= {
		"D:\\java_workspace\\project0306\\images\\card\\h1.png",
		"D:\\java_workspace\\project0306\\images\\card\\h2.png",
		"D:\\java_workspace\\project0306\\images\\card\\h3.png",
		"D:\\java_workspace\\project0306\\images\\card\\h4.png",
		"D:\\java_workspace\\project0306\\images\\card\\h5.png",
		"D:\\java_workspace\\project0306\\images\\card\\h6.png",
		"D:\\java_workspace\\project0306\\images\\card\\h7.png",
		"D:\\java_workspace\\project0306\\images\\card\\h8.png",
		"D:\\java_workspace\\project0306\\images\\card\\h9.png",
		"D:\\java_workspace\\project0306\\images\\card\\joker.png"
	};
	
	//이미지 객체 배열 
	Image[] imageArray=new Image[filename.length];//String 배열만큼 배열의 크기 지정
	
	Toolkit kit=Toolkit.getDefaultToolkit(); //
	
	public MyCanvas() {
		for(int i=0;i<imageArray.length;i++) {
			imageArray[i] = kit.getImage(filename[i]);//이미지 생성 후 배열에 넣기
		}
	}
	
	//이전 이미지 보여주기
	public void prev() {
		index--;
		repaint();//다시 그리기		
	}
	
	//다음 이미지 보여주기 
	public void next() {
		index++;
		repaint();//다시 그리기
	}

	@Override
	public void paint(Graphics g) {
		//프로그램 가동과 동시에 0번째 이미지가 그려지게..
		g.drawImage(imageArray[index], 0, 0, 600,550, this);
	}
	
}




