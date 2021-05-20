package com.sync.function;

import java.util.ArrayList;
import java.util.function.Function;

public class StudentGradeCalculator {

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

		for (Student s : myStudents) {
			System.out.println(
					"Name : " + s.getName() + ", Marks : " + s.getMarks() + ", Grade : " + gradeCalculator.apply(s));
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
