package com.sync.method.reference;

import java.util.function.BiFunction;

public class StaticMethodReference {

	public static void main(String args[]) {
		Sayable say = StaticMethodReference::saying;
		say.saySomething();

		BiFunction<Integer, Integer, Integer> sum = StaticMethodReference::sum;
		System.out.println("Sum is " + sum.apply(20, 34));

		Thread t = new Thread(StaticMethodReference::saying);
		t.start();
	}

	public static void saying() {
		System.out.println("I also say something");
	}

	public static int sum(int x, int y) {
		return x + y;
	}
}
