package com.sds.project0307.editor;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//메모장 편집기를 만들어보자
public class MemoApp extends JFrame{
	JMenuBar bar; //메뉴들을 올려놓을 막대기
	
	JMenu m_file; //파일 
	JMenu m_edit; //편집
	JMenu m_style; //서식 
	JMenu m_view; //보기
	JMenu m_help; //도움말 
	
	//파일에 소속된 메뉴 아이템들 
	String[] itemTitle= {"새로만들기","새창","열기","저장","다른 이름으로 저장","페이지 설정","인쇄","끝내기"};
	JMenuItem[] item = new JMenuItem[itemTitle.length];
	JTextArea area;
	JScrollPane scroll;
	
	public MemoApp() {
		bar = new JMenuBar();
		
		m_file = new JMenu("파일");
		m_edit = new JMenu("편집");
		m_style = new JMenu("서식");
		m_view = new JMenu("보기");
		m_help = new JMenu("도움말");
		
		for(int i=0;i<itemTitle.length;i++) {
			item[i] = new JMenuItem(itemTitle[i]);
			//파일 메뉴에 부착 
			m_file.add(item[i]);
			if(i==4 || i==6) {
				m_file.addSeparator();//구분선
			}
		}
		
		//모든 메뉴를 바에 붙이자
		bar.add(m_file);
		bar.add(m_edit);
		bar.add(m_style);
		bar.add(m_view);
		bar.add(m_help);
		
		//바는 개발자가 원하는 위치에 임의로 둘수없고 그 위치가 이미 정해져 있다
		this.setJMenuBar(bar); //프레임의 메서드로 위치를 지정
		
		//스크롤을 적용하고  싶은 컴포넌트를 생성자의 인스로 넣어줘야 함 
		scroll = new JScrollPane(area=new JTextArea());
		
		//조립 
		add(scroll);
		
		//윈도우 설정 
		setSize(900,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 임시로..
	}
	
	public static void main(String[] args) {
		new MemoApp();
	}
}
