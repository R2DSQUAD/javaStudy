package org.java.thread;

class ThreadSub5 extends Thread {

	int num = 0;

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			num++;
			System.out.println("num-> " + num);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread 1-> " + Thread.currentThread() + ", " + Thread.currentThread().getName());
		}
	}
}

public class ThreadEx5 {
	public static void main(String[] args) {
		System.out.println("Thread");

		ThreadSub5 t5 = new ThreadSub5();
		t5.start();

		new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				int num = 0;
				num++;
				System.out.println("num2-> " + num);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 2-> " + Thread.currentThread() + ", " + Thread.currentThread().getName());
			}
		}).run();

		System.out.println("Thread(main) -> " + Thread.currentThread() + ", " + Thread.currentThread().getName());
		System.out.println("main() -> 종료!! ");

	}
}
