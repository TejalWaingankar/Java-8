package com.sync.functional.interfaces;

public class MultiplyIntegersDemo {

	public static void main(String[] args) {
		MultiplyIntegers mul = (i1, i2) -> System.out.println(i1 * i2);
		mul.multiply(12, 24);
		mul.multiply(112, 254);
		mul.multiply(2, 54);
		mul.multiply(43, 26);
		mul.multiply(57, 87);
	}
}
