package org.java.thread;

class ThreadSub2 extends Thread {
//배열 생성
	int[] arrInt = new int[10];
//thread 횟수 체크
	int num = 0;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			num++;
			System.out.println("Thread 실행 -> 횟수 : " + num);
			System.out.println("실행중인 Thread: " + Thread.currentThread());
			arrInt[i] = num;

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();

				System.out.println("Thread num : " + num);
			}
		}
	}
}

public class Thread2 {
	public static void main(String[] args) {
		System.out.println("Thread ===");
		ThreadSub2 t1 = new ThreadSub2();
		t1.run();
		t1.start();
	}
}
