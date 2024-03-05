package com.sds.project0305.event;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 * 사용자가 프레임창을 대상으로 각종 이벤트를 일으키면 발생하는 이벤트는 WindowEvent 이고 
 * 이 WindowEvent 를 실시간으로 청취하는 리스너가 바로 WindowListener이다..
 * 하지만, 인터페이스이므로, 우리가 원하는 코드로 재정의해놓자.. 
 * */
public class MyWndowListener implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened() 호출");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing() 호출");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed() 호출");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified() 호출");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified() 호출");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated() 호출");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated() 호출");
		
	}
	
}
