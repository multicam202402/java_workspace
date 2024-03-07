package com.sds.project0307.character;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 우리가 지금까지 사용했던 FileInputStream 은 스트림의 분류 중 데이터 처리 단위를 기준으로 보면
 * byte 기반의 스트림이라 한다.. 즉 읽고 쓸때 1 byte 씩 처리한다 
 * 파일복사와 같은 업무를 수행할때는 아무런 문제가 발생X 
 * 영문을 출력할때도 아무런 문제 발생 X (영문은 1byte 크기로 담겨있기 때문에)
 * 하지만, 바이트 기반의 스트림으로 한글,중국어, 일본어, 아랍어 등 유니코드 기반의 언어들을 
 * 실행중인 프로그램으로 1byte씩 읽어들이면서 문자를 출력하려고 할때는 문자가 깨져 보이게 된다..
 * 이유 ? 영미권 이외의 문자들은 2byte 모여 하나의 문자를 표현하고 있기 때문이다...
 * 
 * 만일 이 세상에 1byte씩 처리하는 바이트 기반의 스트림만 지원한다면, 실행중인 프로그램인 문서 편집기에서
 * 한글로 이루어진 메모장 파일등을 프로그램에서 출력할 경우, 한글은 깨진다..
 * 
 * 해결책) 스트림 중 2byte를 묶어서 하나의 문자로 해석할 수 있는 문자 기반 스트림을 지원 
 * 	문자 기반 스트림의 경우 접미어가 ~~Reader, ~~Writer 끝나는 경우가 많다
 * */
public class CharacterRead {
	FileReader reader; //'문서'파일, 즉 텍스트파일을 대상으로 한 스트림이며, 해당 파일에 존재하는 
								//데이터가 영미권 이외의
								//문자라 할지라도, 2byte를 하나로 묶어서 이해할 수 있는 기능이 지원되므로 
								//영미권 이외의 문자가 깨지지 않고 처리될 수 있다.
	public CharacterRead() {
		
		try {
			reader = new FileReader("D:/java_workspace/project0307/res/memo.txt");
			
			//데이터를 읽어와 보자
			int data=-1;
			
			//read() 메서드 몇번 수행할지를 테스트해본다
			while(true) {
				data = reader.read(); //1바이트가 아닌 1문자를 읽어들인다(영문이건, 한글이건..)
				if(data==-1)break;
				System.out.print((char)data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new CharacterRead();

	}

}
