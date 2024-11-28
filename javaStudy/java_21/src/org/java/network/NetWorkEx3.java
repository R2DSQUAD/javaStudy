package org.java.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetWorkEx3 {
public static void main(String[] args) {
	System.out.println("network");
//	String urlData = "http://192.168.23.211:8096/api/todo/shop";
	String urlData = "http://www.nave.com";
	
	OutputStreamWriter out = null;
	BufferedReader in = null;
	
	try {
		
		URL url = new URL(urlData);
		
		// 1. 연결
		URLConnection uC = url.openConnection();
		uC.setDoOutput(true);
		
		//2. 연결 URL 쿼리문 작성
		//쿼리문 저장 객체
		out = new OutputStreamWriter(uC.getOutputStream());
		//쿼리문 보내려고
		out.write("userId=11&userPw=11");
		//3. 결과를 콘솔에 출력
		//다시 정보를 읽어드린다
		in=new BufferedReader(new InputStreamReader(uC.getInputStream()));
		String htmlStr="";
		while((htmlStr = in.readLine()) != null) {
			System.out.println(htmlStr);
		}
		
	}catch(MalformedURLException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
