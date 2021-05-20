package com.sync.lambda;

import java.util.TreeSet;

public class SortTreeSetByLambda {

	public static void main(String[] args) {
		TreeSet<Integer> myInts = new TreeSet<>();
		myInts.add(100);
		myInts.add(500);
		myInts.add(250);
		myInts.add(650);
		myInts.add(480);
		System.out.println("Before Sorting: " + myInts);

		myInts = new TreeSet<>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		myInts.add(100);
		myInts.add(500);
		myInts.add(250);
		myInts.add(650);
		myInts.add(480);
		System.out.println("After Sorting: " + myInts);

	}

}
