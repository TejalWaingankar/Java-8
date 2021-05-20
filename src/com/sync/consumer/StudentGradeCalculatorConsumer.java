package com.sync.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.sync.function.Student;

public class StudentGradeCalculatorConsumer {

	public static void main(String[] args) {
		ArrayList<Student> myStudents = new ArrayList<>();
		populate(myStudents);

		Function<Student, String> gradeCalculator = str -> {
			int marks = str.getMarks();
			if (marks >= 75) {
				return "Distinction";
			} else if (marks >= 60 && marks < 75) {
				return "First Class";
			} else if (marks >= 35 && marks < 60) {
				return "Second Class";
			} else {
				return "Failed";
			}
		};

		Predicate<Student> p1 = std -> std.getMarks() >= 60;

		Consumer<Student> c1 = std -> {
			System.out.println("Name : " + std.getName() + ", Marks : " + std.getMarks() + ", Grade : "
					+ gradeCalculator.apply(std));
		};

		for (Student s : myStudents) {
			if (p1.test(s)) {
				c1.accept(s);
			}
		}
	}

	private static void populate(ArrayList<Student> myStudents) {
		myStudents.add(new Student("Amit", 45));
		myStudents.add(new Student("Tejal", 88));
		myStudents.add(new Student("Deveki", 60));
		myStudents.add(new Student("Ajay", 30));
		myStudents.add(new Student("Hemant", 50));
	}

}
