package com.sds.project0308.keyboard;

import java.io.IOException;
import java.io.InputStream;

/*
 * 지금까지는 파일을 대상으로 해서, 스트림을 제어했다면, 
 * 이번에는 또 다른 매체인  키보드를 대상으로 스트림을 제어해본다 
 * 배경지식) 입력도구엔 어떤 것이 있을까?
 *  - 키보드, 바코드 스캐너, 트랙볼, 타블렛..(입력 디바이스), 복합기 스캐너
 *  
 * 자바 언어는 모든 입력 매체,도구 마다 1:1 대응하는 클래스를 지원하지 않는다...
 * 이유? 하드웨어는 os가 먼저 처리하고, 자바는 단지 os에서 만들어놓은 스트림을 연결하는 것 뿐이다.. 
 * */
public class KeyboardStream {

	public static void main(String[] args) {
		//키보드와 입력스트림 연결하기
		//키보드는 별도의 클래스로 지원될 대상이 아니다! 따라서 입력스트림 중 가장 최상위의 추상클래스인
		//그냥 입력스트림으로 받자!! 
		//System.out.println();
		
		InputStream is=System.in; //이미 OS  차원에서 생성해 놓은 입력스트림을 얻어오자
		//os 차원에서 얻어놓은 입력 스트림은 표준을 따르기 때문에 자바 언어가 별도의 하드웨어를 인식
		//할필요도 없이 그냥 모든 디바이스에 대한 스트림은 InputStream으로 연결만 하면 된다..
		
		
		int data=-1;

		try {
			data = is.read();//키보드로 부터 1 byte 읽기
									//데이터를 읽기 전까지는 대기 상태에 빠진다
			
			//출력하자 
			System.out.print(data);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}



