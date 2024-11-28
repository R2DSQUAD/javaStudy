package org.java.thread;

class ThreadSub3 implements Runnable {

	int num = 0;

	@Override
	public void run() {
		System.out.println("Thread run () -> ");
		for (int i = 0; i < 3; i++) {
			num++;

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("i -> " + i);

			System.out.println(" run() 실행 -> " + num);
		}
	}

}

public class ThreadEx3 {
	public static void main(String[] args) {
		System.out.println("Thread");

		// 1. Runnable
		Runnable t1 = new ThreadSub3();

		// 2. Thread <-
		Thread t2 = new Thread(t1);
		t2.start();

		System.out.println("==============");

		Thread t3 = new Thread(new ThreadSub3());
		t3.start();

		System.out.println("========익명클래스 이용=======");

		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread t4 run () -> ");
				int num = 0;
				for (int i = 0; i < 3; i++) {
					num++;

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println("i -> " + i);

					System.out.println("t4 run() 실행 -> " + num);
				}

			}
		});

		t4.start();

		System.out.println("========익명클래스 이용 -> 람다식 =======");
		Thread t5 = new Thread(() -> {

			System.out.println("Thread t5 run () -> ");
			int num = 0;
			for (int i = 0; i < 3; i++) {
				num++;

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("i -> " + i);

				System.out.println("t5 run() 실행 -> " + num);
			}
		});
		
		t5.start();

		System.out.println("실행 중인 Thread -> " + Thread.currentThread());

		System.out.println("main() -> 종료");
	}
}
