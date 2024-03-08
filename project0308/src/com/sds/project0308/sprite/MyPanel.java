package com.sds.project0308.sprite;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

//개발자가 그림을 뺏어서 그리기 위해 JPanel 을 상속받아 paint() 메서드를 재정의 해야 한다
public class MyPanel extends JPanel{
	//스프라이트 이미지는 배열로 선언...
	Toolkit kit=Toolkit.getDefaultToolkit(); //이미지를 얻기 위한 도구
	String[] path = {
		"D:/java_workspace/project0308/res/hero/image1.png",
		"D:/java_workspace/project0308/res/hero/image2.png",
		"D:/java_workspace/project0308/res/hero/image3.png",
		"D:/java_workspace/project0308/res/hero/image4.png",
		"D:/java_workspace/project0308/res/hero/image5.png",
		"D:/java_workspace/project0308/res/hero/image6.png",
		"D:/java_workspace/project0308/res/hero/image7.png",
		"D:/java_workspace/project0308/res/hero/image8.png",
		"D:/java_workspace/project0308/res/hero/image9.png",
		"D:/java_workspace/project0308/res/hero/image10.png",
		"D:/java_workspace/project0308/res/hero/image11.png",
		"D:/java_workspace/project0308/res/hero/image12.png",
		"D:/java_workspace/project0308/res/hero/image13.png",
		"D:/java_workspace/project0308/res/hero/image14.png",
		"D:/java_workspace/project0308/res/hero/image15.png",
		"D:/java_workspace/project0308/res/hero/image16.png",
		"D:/java_workspace/project0308/res/hero/image17.png",
		"D:/java_workspace/project0308/res/hero/image18.png"
	};
	
	Image[] imgArray=new Image[path.length];//이미지가 들어갈 공간 확보 
	
	public MyPanel() {
		for(int i=0;i<imgArray.length;i++) {
			imgArray[i] = kit.getImage(path[i]);
		}
	}

	public void paint(Graphics g) {
		g.drawImage(imgArray[0], 200, 150, 200, 213, this);
	}
}
