package com.sync.function;

import java.util.function.Function;

public class AndThenAndComposeTest {

	public static void main(String[] args) {

		String test = "ShraddhaTejalWaingankar";

		Function<String, String> uppercase = str -> str.toUpperCase();
		Function<String, String> substring = str -> str.substring(0, 13);

		String upper = uppercase.apply(test);
		String sub = substring.apply(test);
		String andThen = uppercase.andThen(substring).apply(test);
		String compose = uppercase.compose(substring).apply(test);

		System.out.println("Uppercase : " + upper);
		System.out.println("Substring : " + sub);
		System.out.println("andThen  : " + andThen);
		System.out.println("Compose : " + compose);
	}
}
