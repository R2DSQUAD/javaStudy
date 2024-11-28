package org.java.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

public class NetWorkEx2 {
	public static void main(String[] args) {
		System.out.println("network");
		
		BufferedReader reader = null;
		
		String urlData = "http://192.168.23.211:8096/api/todo/shop";
		
		String name = "%EB%85%B8%EC%9B%90%EA%B7%B8%EB%A6%B0%EC%BB%B4%ED%93%A8%ED%84%B0";
		String urlData1 = "http://192.168.23.211:8096/api/todo/shop/"+name;
		
		try {
			URL url = new URL(urlData1);
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
			
			
			System.out.println("url :" + url);
			System.out.println("Protocol :" + url.getProtocol());
			System.out.println("Host :" + url.getHost());
			System.out.println("Port :" + url.getPort());
			System.out.println("Path :" + url.getFile());
			System.out.println("Query :" + url.getQuery());
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
