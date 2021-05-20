package com.sync.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayListByLambda {

	public static void main(String[] args) {
		ArrayList<Integer> myInts = new ArrayList<>();
		myInts.add(100);
		myInts.add(500);
		myInts.add(250);
		myInts.add(650);
		myInts.add(480);
		System.out.println("Before Sorting: " + myInts);

		Collections.sort(myInts);
		System.out.println("After Default Sorting: " + myInts);

		Collections.sort(myInts, new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0;
			}
		});
		System.out.println("After Anonymus class Sorting: " + myInts);

		Collections.sort(myInts, (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		System.out.println("After Lambda Sorting: " + myInts);
	}
}
