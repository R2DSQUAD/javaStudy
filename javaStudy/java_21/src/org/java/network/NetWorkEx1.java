package org.java.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.List;

public class NetWorkEx1 {
	public static void main(String[] args) {
		System.out.println("network");

		BufferedReader reader = null;

		String urlData1 = "http://192.168.23.211:8096/api/todo/shop";
		String urlData2 = "http:s";
		String urlData3 = "http://192.168.23.211:8096/api/todo/shop";

		try {
			URL url = new URL(urlData1);
			String urlStr = "";
			reader = new BufferedReader(new InputStreamReader(url.openStream()));

			while ((urlStr = reader.readLine()) != null) {
				System.out.println(urlStr);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
		}
	}
}
