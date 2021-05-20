package com.sync.statictest;

import java.util.Arrays;
import java.util.List;

public class ClassB extends ClassA {

	public static void main(String args[]) {
		ClassB b = new ClassB();
		b.testStatic();
		String s = "Tejal";
				System.out.println(s.startsWith("T"));
	}

	private void testStatic() {
		ClassB.test();
	}

	public static void test() {
		System.out.println("Class B Static Test");
		List<String> myStrings = Arrays.asList("1","2","3","4");
		System.out.println(myStrings);
	}
}
