package com.sync.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployeesByLambda {

	public static void main(String[] args) {
		ArrayList<Employee> myEmp = new ArrayList<Employee>();
		myEmp.add(new Employee(1, "Tejal"));
		myEmp.add(new Employee(34, "Amit"));
		myEmp.add(new Employee(32, "Deveki"));
		myEmp.add(new Employee(8, "Vikram"));

		System.out.println("Before custom sorting : " + myEmp);

		Collections.sort(myEmp, (e1, e2) -> (e1.empId > e2.empId) ? 1 : (e1.empId < e2.empId) ? -1 : 0);
		System.out.println("After custom sorting : " + myEmp);
	}
}

class Employee {
	int empId;
	String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
