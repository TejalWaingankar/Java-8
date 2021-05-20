package com.sync.lambda;

import java.util.TreeMap;

public class SortTreeMapByLambda {

	public static void main(String[] args) {
		TreeMap<Integer, String> myInts = new TreeMap<>();
		myInts.put(100, "A");
		myInts.put(50, "B");
		myInts.put(10, "C");
		myInts.put(200, "D");
		myInts.put(150, "E");
		myInts.put(250, "F");
		System.out.println("Before Sorting: " + myInts);

		myInts = new TreeMap<>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		myInts.put(100, "A");
		myInts.put(50, "B");
		myInts.put(10, "C");
		myInts.put(200, "D");
		myInts.put(150, "E");
		myInts.put(250, "F");
		System.out.println("After Sorting: " + myInts);

	}

}
