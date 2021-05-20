package com.sync.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

import com.sync.predicates.Employee;
import com.sync.predicates.EmployeeManagement;

public class TotalSalaryCalculator {

	public static void main(String[] args) {
		ArrayList<Employee> myEmps = new ArrayList<>();
		EmployeeManagement.populate(myEmps);

		calculateTotalSalaryOfEmployees(myEmps);
		salaryHikeForEmployees(myEmps);
	}

	private static void salaryHikeForEmployees(ArrayList<Employee> myEmps) {
		System.out.println("All Employees : " + myEmps);

		Function<Employee, Employee> f1 = emp -> {
			emp.setSalary(emp.getSalary() + 500);
			return emp;
		};
		Predicate<Employee> p1 = emp -> emp.getSalary() <= 500;

		ArrayList<Employee> hikedResources = new ArrayList<>();
		for (Employee e : myEmps) {
			if (p1.test(e)) {
				Employee employee = f1.apply(e);
				hikedResources.add(employee);
			}
		}
		System.out.println("Hiked Employees : " + hikedResources);
	}

	private static void calculateTotalSalaryOfEmployees(ArrayList<Employee> myEmps) {
		Function<ArrayList<Employee>, Double> salarySum = emp -> {
			double totalSalary = 0;
			for (Employee e : emp) {
				totalSalary += e.getSalary();
			}
			return totalSalary;
		};
		System.out.println("Total salary of Employees : " + salarySum.apply(myEmps));
	}
}
