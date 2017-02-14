package main.structural.composite.employeehierarchy;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * This class is used to illustrate the Employee hierarchy example of the Composite Pattern.
 * 
 * @author Sophie
 *
 */
public class TestCompositeEmployee {

	Employee CEO;
	Employee headSales;
	Employee headMarketing;
	Employee clerk1;
	
	@Before
	public void before() {
		CEO = new Employee("John", 30000, "CEO");

		headSales = new Employee("Robert", 20000, "Head Sales");

		headMarketing = new Employee("Michel", 20000, "Head Marketing");

		clerk1 = new Employee("Laura", 10000, "Marketing");
		Employee clerk2 = new Employee("Bob", 10000, "Marketing");

		Employee salesExecutive1 = new Employee("Richard", 10000, "Sales");
		Employee salesExecutive2 = new Employee("Rob", 10000, "Sales");

		CEO.addSubordiate(headSales);
		CEO.addSubordiate(headMarketing);

		headSales.addSubordiate(salesExecutive1);
		headSales.addSubordiate(salesExecutive2);

		headMarketing.addSubordiate(clerk1);
		headMarketing.addSubordiate(clerk2);
	}

	@Test
	public void testAllEmployees() {
		System.out.println(CEO.printDepartment());
	}
	
	@Test
	public void testMarketing() {
		System.out.println(headMarketing.printDepartment());
	}	
}
