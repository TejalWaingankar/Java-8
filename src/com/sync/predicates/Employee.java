package com.sync.predicates;

public class Employee {

	private String name;
	private String designation;
	private String city;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", city=" + city + ", salary=" + salary
				+ "]";
	}
	public Employee(String name, String designation, String city, double salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.city = city;
		this.salary = salary;
	}
	
}
