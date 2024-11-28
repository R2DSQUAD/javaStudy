package org.java.thread;

// 문자열 -> java Project 2024 -> 한글자 씩 콘솔로 출력
// Thread
// 글자 공백 제거, string.leng로 크기, 뽑아내기

class ThreadSub4 implements Runnable {

	String str = "java Project 2024";
	int num=0;
	
	String str_replace = str.replaceAll(" ", "");
	
	@Override
	public void run() {
		for (int i = 0; i < str_replace.length(); i++) {
			num++;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("i -> " +i);
			System.out.println("t1 run() 실행 -> " + str_replace.charAt(num-1));
		}
	}
	
}

public class ThreadEx4 {
	public static void main(String[] args) {
		System.err.println("Thread");

		Thread t1 = new Thread(new ThreadSub4());
		t1.start();

	}
}
