package com.sync.predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	private Predicate<String> stringLengthGreaterThanFive = str -> str.length() > 5;

	private Predicate<Collection<?>> collectionIsEmpty = collection -> collection.isEmpty();

	private Predicate<String> startsWithK = str -> str.startsWith("K");

	public static void main(String[] args) {
		PredicateTest test = new PredicateTest();
		test.checkStringLegth("Whats up man");
		test.checkStringLegth("Dude");

		ArrayList<String> myList = new ArrayList<>();
		myList.add("1");
		test.isCollectionEmpty(myList);

		ArrayList<Integer> myInts = new ArrayList<>();
		test.isCollectionEmpty(myInts);

		List<String> myNames = Arrays.asList("Amar", "Kaajal", "Kangana", "Deepika", "Katrina");
		test.checkNameStartsWith(myNames);
		test.checkNameNotStartsWith(myNames);

	}

	private void checkNameStartsWith(List<String> myNames) {
		System.out.println("Matching names : ");
		for (String name : myNames) {
			boolean nameMatch = startsWithK.test(name);
			if (nameMatch)
				System.out.println(name);
		}
	}

	private void checkNameNotStartsWith(List<String> myNames) {
		System.out.println("Not Matching names : ");
		for (String name : myNames) {
			boolean nameMatch = startsWithK.negate().test(name);
			if (nameMatch)
				System.out.println(name);
		}
	}

	public void checkStringLegth(String toBeChecked) {
		boolean lengthChecker = stringLengthGreaterThanFive.test(toBeChecked);
		System.out.println("Length of " + toBeChecked + " greater than 5 ? : " + lengthChecker);
	}

	public void isCollectionEmpty(Collection<?> collection) {
		boolean collectionEmpty = collectionIsEmpty.test(collection);
		System.out.println("Collection empty : " + collectionEmpty);
	}

}