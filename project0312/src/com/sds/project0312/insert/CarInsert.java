package com.sds.project0312.insert;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/*mysql 의 테이블에 데이터 넣어보기
   드라이버란? 프로그래밍 언어가 DBMS 제품을 제어하기 위한 소프트웨어이고, 이 소프트웨어는 
   DBMS 제조사가 개발자들에게 제공할 의무가 있다, 제공하지 않으면??? 상품 못팔아 먹는다...
   MySQL을 연동하려면 MySQL 제조사로 가서 드라이버를 다운로드 받으면 됨
   
   [MySQL 가동 법 - 바이너리 압축 버전 인 경우 즉 installer 없이 설치된 경우]
   1.환경변수 path에 ~~/bin 까지 등록되어 있어야 함 
   2.cmd창에서 mysqld.exe  가동 프로그램으로 서버를 시작한다
   3.새로운 cmd 창을 열고서 mysql  -h  localhost  -u  root  
*/

public class CarInsert extends JFrame{
	JButton bt_connect; //접속
	JTextField t_name; //차 이름
	JTextField t_price; //차 가격 
	JButton bt_regist; //등록 
	
	public CarInsert() {
		//생성 
		bt_connect = new JButton("접속");
		t_name = new JTextField();
		t_price = new JTextField();
		bt_regist = new JButton("등록");
		
		//스타일
		Dimension d = new Dimension(270, 38);
		t_name.setPreferredSize(d);
		t_price.setPreferredSize(d);
		
		//조립
		setLayout(new FlowLayout());
		add(bt_connect);
		add(t_name);
		add(t_price);
		add(bt_regist);
		
		setSize(300,250);
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		new CarInsert();

	}

}
