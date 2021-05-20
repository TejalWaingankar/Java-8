package com.sync.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsMethodsTest {
	
	private static List<Integer> myInts = Arrays.asList(1,2,3,4,5,11,22,33,44,55,54,53,52,67,68,69,22);
	private static ArrayList<Student> myStudents;
	
	public static void main(String args[]) {
		streamFilter();
		streamDistinct();
		streamMap();
		streamCount();
		streamsSorted();
		streamsMinMax();
	}

	private static void streamsMinMax() {
		Optional<Integer> min = myInts.stream()
		.min(Comparator.naturalOrder());
		if(min.isPresent()) {
			System.out.println("Minimum value of list : " +min.get());
		}
		
		OptionalInt max = myInts.stream()
		.mapToInt(i ->i)
		.max();
		if(max.isPresent()) {
			System.out.println("Max value of list : "+max.getAsInt());
		}
		
		Optional<Integer> max2 = myInts.stream()
		.max(Integer::compare);
		if(max2.isPresent()) {
			System.out.println("Max value of list : "+max2.get());
		}
	}

	private static void streamsSorted() {
		populateStudents();
		List<Student> sortedStudents = myStudents.stream()
		.sorted(Comparator.comparing(Student::getName).reversed())
		.collect(Collectors.toList());
		
		System.out.println("Comparing students by Name reversed : ");
		sortedStudents.forEach(System.out::println);
		
		System.out.println("Sorting integers naturally... ");
		myInts.stream()
		.sorted()
		.collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("Sorting integers in reverse order... ");
		myInts.stream()
		.sorted((i1,i2) ->(i1 > i2) ? -1 : (i1 < i2) ? 1 : 0)
		.collect(Collectors.toList()).forEach(System.out::println);
		
		Optional<Student> student = myStudents.stream()
		.collect(Collectors.minBy(Comparator.comparing(Student::getMarks)));
		if(student.isPresent()) {
			System.out.println("Student with less marks : " +student.get().getName());
		}
		
		// Not good way without checking Optional isPresent. But just for presentation purpose.
		String studentWithMaxMarks = myStudents.stream()
		.collect(Collectors.maxBy(Comparator.comparing(Student::getMarks)))
		.get().getName();
		
		System.out.println("Student with Max marks : " +studentWithMaxMarks);
	}

	private static void populateStudents() {
		myStudents = new ArrayList<>();
		myStudents.add(new Student("Amit", 45));
		myStudents.add(new Student("Tejal", 88));
		myStudents.add(new Student("Deveki", 60));
		myStudents.add(new Student("Ajay", 30));
		myStudents.add(new Student("Hemant", 50));
	}

	private static void streamCount() {
		long count = myInts.stream()
		.count();
		
		System.out.println("Total Number of elements : " +count);
		
		Long countByCounting = myInts.stream()
		.collect(Collectors.counting());
		
		System.out.println("Total Number of elements by Collectors.counting: " +countByCounting);
	}

	private static void streamMap() {
		List<Integer> doubleValues = myInts.stream()
		.map(i -> i*2)
		.collect(Collectors.toList());
		
		System.out.println("Mapping to double values : ");
		doubleValues.forEach(System.out::println);
		
		System.out.println("Mapping to double values with mapping collectors method");
		myInts.stream()
		.collect(Collectors.mapping(i->i*2, Collectors.toList()))
		.forEach(System.out::println);
		
		IntStream mapToIntValues = myInts.stream()
		.mapToInt(i -> i*i);
		
		System.out.println("Mapping to square values using mapToInt : ");
		mapToIntValues.forEach(System.out::println);
	}

	private static void streamDistinct() {
		List<Integer> distinctValues = myInts.stream()
		.distinct()
		.collect(Collectors.toList());
		System.out.println("Distinct Numbers : ");
		distinctValues.forEach(System.out::println);
	}

	private static void streamFilter() {
		List<Integer> evenNums = myInts.stream()
		.filter(i -> i%2==0)
		.collect(Collectors.toList());
		
		evenNums.forEach(System.out::println);
		
		System.out.println("Divide by 3 : ");
		myInts.stream()
		.filter(i->i%3==0)
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("Numbers between 20 - 60");
		myInts.stream()
		.filter(i-> i>=20 && i<=60)
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}

}
