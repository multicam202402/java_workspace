package com.sds.project0305.event;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

//현재 정의하고 있는 클래스를 프레임 자체로 정의해보자 (is a 정의)
public class EventTest extends Frame {
	/* EventTest is a Frame */
	// has a 관계란 , 멤버변수가 객체자료형일때를 의미
	// 어떤 사물이 사물을 부품으로 보유하는 관계
	
	//멤버변수들은 개발자가 초기화하지 않으면 컴파일러에 의해 디폴트값이 들어감 
	//객체자료형의 경우 - null로,  기본자료형 숫자-0, 논리값-false, 문자 - 공백
	Button bt; // EventTest has a Button 버튼을 가지고 있다
	int x; // x는 기본자료형이지, 객체자료형이 아니므로 has a 관계 아니다!

	public EventTest() {
		bt = new Button("Click Me !");
		
		//프레임에 부착 (아무런 배치관리자를 적용하지 않으면 Frame 경우 BorderLayout)
		this.setLayout(new FlowLayout());
		add(bt);
		
		this.setBackground(Color.YELLOW);//프레임에 배경색 적용
		setSize(300,400);//윈도우 크기 지정
		setVisible(true); //윈도우 창 보이게 처리
	}

	public static void main(String[] args) {
		//객체 생성후 할일이 없다면, 굳이 변수를 사용할 이유가 없기 때문에 아래와 같이 
		//생성만 했다
		new EventTest();
	}

}
