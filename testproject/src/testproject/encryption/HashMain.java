package testproject.encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
 * 해시란? 섞어놓은 음식의 한 종류
 * 해시함수란? 어떠한 입력 값이라도 같은 길이를 가지며, 고유한 값을 반환해주는 함수
 * 암호화 중 하나 
 * 
 * 암호화 - 
 *	 	양방향(복호화가 가능한 암호화), 
 * 		대칭
 * 		비대칭
 * 단방향 
 *		해시 
 * */
public class HashMain {
	
	public static void main(String[] args) {
		String pass="minzino";
		
		try {
			MessageDigest digest=MessageDigest.getInstance("SHA-256");
			
			byte[] bytes = digest.digest(pass.getBytes());
			
			StringBuffer sb = new StringBuffer();
			
			for(int i=0;i<bytes.length;i++) {
				String hex = Integer.toHexString( 0xff & bytes[i]); //두 값의 비트 연산 
				if(hex.length()==1) {
					sb.append("0");	
				}
				sb.append(hex);
			}
			System.out.println(sb.toString());
			System.out.println(sb.toString().length());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			System.out.println("알고리즘 이름을 확인해주세요");
		}
	}
}
