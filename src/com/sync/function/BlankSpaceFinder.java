package com.sync.function;

import java.util.function.Function;

public class BlankSpaceFinder {

	public static void main(String[] args) {

		String test = "This is a test string";
		System.out.println("Original string : " +test);
		
		Function<String, String> f1 = str -> str.replaceAll(" ", "");
		String result = f1.apply(test);
		System.out.println("String after removing blank spaces : " + result);
		
		Function<String, Integer> f2 = str -> str.length() - str.replaceAll(" ", "").length();
		int noOfBlankSpaces = f2.apply(test);
		System.out.println("No of blank spaces : " +noOfBlankSpaces);
	}

}
