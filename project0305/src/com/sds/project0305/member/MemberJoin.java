package com.sds.project0305.member;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * java.awt 패키지는 os 에 따라 다른 디자인으로 보여질 수 있기 때문에 
 * 이를 개선한 패키지인 javax.swing 패키지를 이용해보자 
 * os 중립적인  자체적인 Look&Feel 을 가진다..
 * No 걱정 - awt와 크게 달라지지 않고 기존의 awt 컴퍼넌트에 J접두어 붙이자 
 * 그리고 여전히 java.awt 의 레이아웃 배치관리자와 java.awt.event  여전히 java.awt 를 유지   
 * 
 * 이벤트 프로그래밍의 3단계 절차 
 * 1) 적절한 리스너 선택 
 * 2) 해당 리스너의 메서드 오버라이드(개발자가 원하는 코드로 재정의)
 * 3) 컴포넌트와 리스너 연결
 * */
public class MemberJoin extends JFrame implements WindowListener{
	JLabel la_title; //회원가입 제목 
	JPanel p_content; // 가운데 영역 
	JLabel la_id, la_pass, la_jumin, la_gender, la_hobby, la_file, la_zip;
	
	JTextField t_id; //아이디 
	JPasswordField t_pass; //비밀번호 
	JTextField t_jumin1, t_jumin2;//주민번호 앞,뒤자리 
	//Checkbox를 그룹화 시켜놓아야 라디오가 등장, html 에서도  radio는 배열로 존재시켜야 함 
	
	Checkbox[] hobby = new Checkbox[4]; //취미
	String[] hobbyName= {"Travel","Programming","exercise", "pet protection"};
	JTextField t_profile; //프로필 사진 경로 
	JTextField t_filename, t_ext; //파일명과 확장자 
	JTextField t_zip1, t_zip2; //우편번호 앞,뒤자리 
	JButton bt_regist; //가입버튼
	
	
	public MemberJoin() {
		//생성
		la_title = new JLabel("Member Regist");
		p_content = new JPanel();
		la_id = new JLabel("ID");
		la_pass = new JLabel("Password");
		la_jumin = new JLabel("주민번호");
		la_gender = new JLabel("성별");
		la_hobby = new JLabel("취미");
		la_file = new JLabel("프로필 사진명"); 
		la_zip = new JLabel("우편번호");
		
		t_id = new JTextField();
		t_pass = new JPasswordField();
		t_jumin1 = new JTextField();
		t_jumin2 = new JTextField();
		
		for(int i=0;i<hobby.length;i++) {
			hobby[i] = new Checkbox(hobbyName[i]);
		}
		t_profile = new JTextField();
		t_filename = new JTextField();
		t_ext = new JTextField();
		t_zip1 = new JTextField();
		t_zip2 = new JTextField();
		bt_regist = new JButton("가입하기");
		
		//스타일
		//제목의 텍스트 크게 하기 
		la_title.setFont(new Font("Verdana", Font.BOLD, 50));
		p_content.setBackground(Color.YELLOW);
		
		//아이디스타일 
	 	Dimension d=new Dimension(290, 28);
		la_id.setPreferredSize(d);		
		t_id.setPreferredSize(d);
		
		//패스워드 스타일 
		la_pass.setPreferredSize(d);
		t_pass.setPreferredSize(d);
		
		//주민번호 스타일 
		la_jumin.setPreferredSize(d);
		Dimension d2 = new Dimension(145, 28);
		t_jumin1.setPreferredSize(d2);
		t_jumin2.setPreferredSize(d2);
		
		//취미 라벨 스타일
		la_hobby.setPreferredSize(d);
		
		//프로필 스타일 
		la_file.setPreferredSize(d);
		Dimension d3 = new Dimension(110, 28);
		t_profile.setPreferredSize(d3);
		t_filename.setPreferredSize(d3);
		t_ext.setPreferredSize(d3);
		
		//우편번호 스타일 
		la_zip.setPreferredSize(d);
		t_zip1.setPreferredSize(d2);
		t_zip2.setPreferredSize(d2);
		
		
		//조립
		add(la_title, BorderLayout.NORTH); //프레임의 북쪽에 부착 
		add(p_content); // 센터에 부착 
		
		p_content.add(la_id);
		p_content.add(t_id);
		
		p_content.add(la_pass);
		p_content.add(t_pass);
		
		p_content.add(la_jumin);
		p_content.add(t_jumin1);
		p_content.add(t_jumin2);
		
		//취미를 반복문으로 부착 
		p_content.add(la_hobby);
		for(int i=0; i<hobby.length;i++) {
			p_content.add(hobby[i]);
		}
		
		//프로필 사진 부착 
		p_content.add(la_file);
		p_content.add(t_profile);
		p_content.add(t_filename);
		p_content.add(t_ext);
		
		//우편번호 부착
		p_content.add(la_zip);
		p_content.add(t_zip1);
		p_content.add(t_zip2);
		
		//버튼 부착 
		p_content.add(bt_regist);
		
		//현재 프레임과 리스너 연결 
		//현재프레임.addWindowListener( 리스너 구현한 者)
		//this 의 정의? 레퍼런스 변수이다.
		this.addWindowListener(this);
		
		//윈도우 설정 
		setSize(700,500);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		MemberJoin mj = new MemberJoin();
	}



	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0); //프로세스(실행중인 프로그램) 종료
	}



	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}






