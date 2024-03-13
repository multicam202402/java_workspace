package com.sds.seshop.main;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//쇼핑몰 관리자 페이지의 메인 
public class ShopMain extends JFrame{
	JPanel p_north;
	JButton bt_regist, bt_list, bt_admin, bt_join, bt_login;
	JPanel p_center; //페이지들이 교체될 컨테이너(상품등록페이지, 상품목록, 관리자명단, 로그인폼)
	
	public ShopMain() {
		p_north = new JPanel();
		//패키지를 기준으로 자원의 경로를 얻기 
		URL url = this.getClass().getClassLoader().getResource("product.png");
		ImageIcon icon = new ImageIcon(url);
		
		bt_regist = new JButton(icon);
		bt_list = new JButton("상품등록");
		bt_admin = new JButton("관리자 목록");
		bt_join = new JButton("관리자 등록");
		bt_login = new JButton("상품등록");
		
		//스타일
		
		//북쪽 패널에 버튼 부착 
		p_north.add(bt_regist);
		p_north.add(bt_list);
		p_north.add(bt_admin);
		p_north.add(bt_join);
		p_north.add(bt_login);
		
		//프레임에 부착 
		add(p_north, BorderLayout.NORTH);
		
		//윈도우 어댑터를 익명으로 연결 (어댑터란 우리 대신 리스너를 구현한 객체 즉 어댑터가 바로 리스너임) 
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				//db커넥션을 닫을 예정 
				System.exit(0);//실행중인 프로그램을 프로세스..프로세스 종료
			}
		});
		
		setSize(1000,850);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ShopMain();
	}

}
