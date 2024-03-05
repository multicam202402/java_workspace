package com.sds.project0305.addr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//사용자의 액션이벤트를 감지할 리스너 클래스 정의 
public class BtnListener implements ActionListener{
	
	//사용자가 액션 이벤트를 일으킬때마다 호출되는 메서드
	public void actionPerformed(ActionEvent e) {
		System.out.println("오픈 버튼 눌렀어?");
	}
	
}
