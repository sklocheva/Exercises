package main.structural.composite.employeehierarchy;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private int salary;
	private String department;
	private List<Employee> subordinates;

	public Employee(String name, int salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
		subordinates = new ArrayList<Employee>();
	}

	public void addSubordiate(Employee empl) {
		subordinates.add(empl);
	}

	public void removeSubordiate(Employee empl) {
		subordinates.remove(empl);
	}

	public String printDepartment() {
		StringBuilder s = new StringBuilder();
		s.append(this.toString());
		
		for (Employee x : subordinates) {
			s.append(x.printDepartment());
		}
		return s.toString();
	}

	@Override
	public String toString() {
		return String.format("Name: %s, Department: %s, Salary: %d. \r\n", name, department, salary);
	}

}
