package org.java.thread;

class ThreadSub extends Thread {
	@Override
	public void run() {
		System.out.println("Thread run() -> ");
	}
}

public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("Thread");
		
		ThreadSub t1 = new ThreadSub();
		System.out.println(t1);
		
		t1.run(); 	// Thread 실행 
		t1.start(); // Thread 시작
		System.out.println("current -> "+t1.currentThread());
	}
}
