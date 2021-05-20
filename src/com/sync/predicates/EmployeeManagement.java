package com.sync.predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeManagement {

	private static final double EMPLOYEE_SALARY = 1500.00;
	private static final String EMPLOYEE_DESIGNATION = "Manager";
	private static final String EMPLOYEE_CITY = "Pune";

	public static void main(String[] args) {
		Predicate<Employee> p1 = emp -> emp.getSalary() > EMPLOYEE_SALARY;
		Predicate<Employee> p2 = emp -> emp.getCity().equals(EMPLOYEE_CITY);
		Predicate<Employee> p3 = emp -> emp.getDesignation().equals(EMPLOYEE_DESIGNATION);

		ArrayList<Employee> myEmps = new ArrayList<>();
		populate(myEmps);
		System.out.println("All Employees : " + myEmps);

		EmployeeManagement empMgmt = new EmployeeManagement();

		System.out.println("Employees with salary more than 1500 : ");
		empMgmt.display(p1, myEmps);

		System.out.println("Employees from Pune : ");
		empMgmt.display(p2, myEmps);

		System.out.println("Employees who are managers : ");
		empMgmt.display(p3, myEmps);

		System.out.println("Employees who are managers and from Pune : ");
		empMgmt.display(p2.and(p3), myEmps);

		System.out.println("Employees who are not from Pune : ");
		empMgmt.display(p2.negate(), myEmps);

		System.out.println("Pune employees with salary less than 1500 : ");
		empMgmt.display(p2.and(p1.negate()), myEmps);

		System.out.println("Employees who are not managers : ");
		empMgmt.display(p3.negate(), myEmps);

		System.out.println("Employees who are out of Pune OR with salary more than 1500 : ");
		empMgmt.display(p2.negate().or(p1), myEmps);
	}

	public void display(Predicate<Employee> p, ArrayList<Employee> myEmps) {
		for (Employee e : myEmps) {
			boolean match = p.test(e);
			if (match) {
				System.out.println(e);
			}
		}
	}

	public static void populate(ArrayList<Employee> myEmps) {
		myEmps.add(new Employee("Tejal", "Sr. Manager", "Pune", 2000.00));
		myEmps.add(new Employee("Ajay", "Manager", "Pune", 1000.00));
		myEmps.add(new Employee("Deveki", "Lead", "Banglore", 500.00));
		myEmps.add(new Employee("Amit", "Developer", "Mumbai", 300.00));
		myEmps.add(new Employee("Sundeep", "Tester", "Pune", 700.00));
		myEmps.add(new Employee("Nitesh", "Manager", "Banglore", 1800.00));
		myEmps.add(new Employee("Anil", "Manager", "Pune", 900.00));
	}

}
