package test.list;

import java.util.Collections;
import java.util.List;

import org.junit.Test;

import test.Employee;
import test.util.TestData;

public class SortArraylist {


	/*
	 * comparable required to add implementation in POJO class and it is restricted
	 * to implementation of sorting using only one field. very less use in practical
	 * environment
	 */
	@Test
	public void SortArrayListUsingComparble() {
		List<Employee> employee = TestData.getEmployeeList();

		Collections.sort(employee);
		System.out.println(employee);

	}

	/*
	 * comparator is best practice to do sorting in practical env after java 8 we
	 * can use lambda expression to implement compression logic at place where we
	 * required insted of implementing Comparator interface
	 */
	@Test
	public void SortArrayListUsingComparator() {
		List<Employee> employee = TestData.getEmployeeList();

		// java8
		// sort by Id
		employee.sort((w1, w2) -> w1.getEmployeeId().compareTo(w2.getEmployeeId()));
		System.out.println(employee);

		// sort by salary
		employee.sort((w1, w2) -> w1.getSalary().compareTo(w2.getSalary()));
		System.out.println(employee);

	}
}
