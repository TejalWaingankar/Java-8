package com.sync.bifunction;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BiFunctionInterfaces {

	public static void main(String[] args) {

		BiPredicate<String, Integer> bipredicate = (s, i) -> s.startsWith("Syne") && i > 5000;
		if (bipredicate.test("Ibm", 8000)) {
			System.out.println("Matching");
		} else if (bipredicate.test("Synechron", 6000)) {
			System.out.println("Matching");
		}

		Function<String, String> fun = str -> "This is " + str;
		System.out.println(fun.apply("Spartaaaa"));

		UnaryOperator<String> unary = str -> "This is " + str;
		System.out.println(unary.apply("Warrior"));

		BiFunction<String, String, String> bif = (str1, str2) -> str1 + str2;
		System.out.println(bif.apply("I am ", "back"));

		BinaryOperator<String> binary = (str1, str2) -> str1 + str2;
		System.out.println(binary.apply("I am ", "Arnold shivajinagar"));

		BiConsumer<String, Integer> bic = (s, i) -> System.out.println(s + i);
		bic.accept("Who is number ", 4);

		BiFunction<String, Integer, Student> bifunSt = (name, marks) -> new Student(name, marks);
		ArrayList<Student> list = new ArrayList<>();
		list.add(bifunSt.apply("A", 20));
		list.add(bifunSt.apply("B", 25));
		list.add(bifunSt.apply("C", 30));
		list.add(bifunSt.apply("D", 56));
		list.add(bifunSt.apply("E", 78));

		System.out.println(list);

		BiConsumer<Student, Integer> graceMarks = (std, marks) -> std.setMarks(std.getMarks() + marks);
		for (Student s : list) {
			graceMarks.accept(s, 5);
		}

		System.out.println(list);
	}
}
