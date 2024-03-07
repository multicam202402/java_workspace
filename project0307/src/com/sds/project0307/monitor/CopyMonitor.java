package com.sds.project0307.monitor;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//파일을 복사하는 과정에서 실행중인 프로그램으로 들어오고 나가는 바이트들을 육안으로 확인해보기 위한
//프로그램 
public class CopyMonitor extends JFrame{
	JLabel la_ori, la_dest;
	JTextField t_ori, t_dest;
	JTextArea area;
	JButton bt;
	
	public CopyMonitor() {
		super("복사 데이터 모니터링"); //부모님인 JFrame의 생성자 호출
		
		la_ori = new JLabel("원본 경로");
		la_dest = new JLabel("복사 경로");
		t_ori = new JTextField("");
		t_dest = new JTextField("");
		area = new JTextArea();
		bt = new JButton("복사실행");
		
		//스타일 
		Dimension d1 = new Dimension(150, 35);//JLabel 꺼
		Dimension d2 = new Dimension(630, 35); //JTextField 꺼
		Dimension d3 = new Dimension(780, 450); //JTextArea 꺼
		
		la_ori.setPreferredSize(d1);
		la_dest.setPreferredSize(d1);
		t_ori.setPreferredSize(d2);
		t_dest.setPreferredSize(d2);
		area.setPreferredSize(d3);
		
		//조립 
		
		
	}
	
	public static void main(String[] args) {
		new CopyMonitor();
	}

}






