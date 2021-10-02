package test.list;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

import test.Employee;
import test.util.TestData;

public class ConvertListToSet {

	
	@Test
	public void arrayListToSet() {
		// for converting list of employee to set we need to override equals and
		// hashcode method
		// to make key as employeeId which is suppose to be unique.
		List<Employee> employee = TestData.getEmployeeList();

		// it is bad practice to convert listof employee into set of employee
		// good practice is to convert it into map
		//HashSet<Employee> set = new HashSet<Employee>(employee);
		//System.out.println(set);
		
		Set<String>mobilenumber=employee
				.stream()
				.map(Employee::getMobileNumber)
				.collect(Collectors.toSet());
		
        System.out.println(mobilenumber);
	}
}
