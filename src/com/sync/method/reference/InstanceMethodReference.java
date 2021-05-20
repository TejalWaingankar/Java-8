package com.sync.method.reference;

import java.util.function.IntBinaryOperator;

public class InstanceMethodReference {

	public static void main(String[] args) {
		InstanceMethodReference in = new InstanceMethodReference();
		Sayable say = in::saying;
		say.saySomething();

		Thread t = new Thread(in::saying);
		t.start();

		Thread t1 = new Thread(new InstanceMethodReference()::saying);
		t1.start();

		IntBinaryOperator summing = in::sum;
		System.out.println("Sum is " + summing.applyAsInt(33, 43));
	}

	public void saying() {
		System.out.println("I am instance method");
	}

	public int sum(int x, int y) {
		return x + y;
	}

}
