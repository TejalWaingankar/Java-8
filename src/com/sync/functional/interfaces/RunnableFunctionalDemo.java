package com.sync.functional.interfaces;

public class RunnableFunctionalDemo {

	public static void main(String[] args) {

		Runnable run = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Run : " + i);
			}
		};

		Thread t1 = new Thread(run);
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main : " + i);
		}
	}

}
