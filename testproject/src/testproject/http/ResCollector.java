package testproject.http;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ResCollector {
	HttpURLConnection httpCon;
	URLConnection con; 

	
	public ResCollector() {
		InputStream is=null;
		
		try {
			URL url = new URL("http://127.0.0.1:8888/images/Shrek/img0.jpg");
			con = url.openConnection();
			httpCon=(HttpURLConnection)con;
			
			int len = httpCon.getContentLength();
			
			System.out.println(len/1000+" kb");
			
			is = httpCon.getInputStream();
			
			int data=-1;
			int count=0;
			
			while(true) {
				data = is.read();
				if(data==-1)break;
				count++;
				
				float percent = (count/(float)len)*100;
				
				System.out.println((int)percent) ;
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(is !=null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new ResCollector(); 
	
		
	}

}
