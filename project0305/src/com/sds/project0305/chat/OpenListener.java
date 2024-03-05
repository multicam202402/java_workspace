package com.sds.project0305.chat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//open 버튼을 눌렀을때, 즉 액션 이벤트가 발생하면 이 리스너가 감지하여 
//원하는 로직을 actionPerformed() 메서드에 재정의해보자
public class OpenListener implements ActionListener{
	
	//사용자가 버튼을 클릭할때마다, 이 메서드가 호출됨 
	public void actionPerformed(ActionEvent e) {
		System.out.println("클릭했어?");
	}

}
