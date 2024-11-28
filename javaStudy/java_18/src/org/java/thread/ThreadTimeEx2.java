package org.java.thread;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread2 extends Thread {
	JLabel timerlabel;
	
	public TimerThread2(JLabel timerlabel) {
		super();
		this.timerlabel = timerlabel;
	}
	int cnt = 0;
	@Override
	public void run() {
		System.out.println("Timer Thread -> ");
		
		while(true) {
			//int -> String
			timerlabel.setText(Integer.toString(cnt));
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
			cnt++;
		}
	}
}

public class ThreadTimeEx2 {
	public static void main(String[] args) {
		System.out.println("Thread 실습");
		
		//1. JFrame 생성
		JFrame jFrame = new JFrame("Thread Test");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//2. Container 생성 -> 컴포넌트의 모아둔~
		Container container = jFrame.getContentPane();
		container.setLayout(new FlowLayout());
		
		//3. Label 생성
		JLabel jLabel = new JLabel();
		jLabel.setFont(new Font("Arial", Font.ITALIC, 100));
		
		//4. Label -> 패널(컨테이너)에 추가
		container.add(jLabel);
		
		//5. JFrame 크기 설정
		jFrame.setSize(300, 200);
		
		//6. JFrame 보여라~
		jFrame.setVisible(true);
		
		//7. Thread 연동
		TimerThread2 timer = new TimerThread2(jLabel);
		timer.start();
		//Thread  시작
		
	}
}


