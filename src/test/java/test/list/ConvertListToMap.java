package test.list;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.Test;

import test.Employee;
import test.util.TestData;

public class ConvertListToMap {
	
	@Test
	public void arrayListToMap() {
		//Note:By default, toMap() method converts List into HashMap
		
		List<Employee> employee = TestData.getEmployeeList();

		Map<String, Employee> map = employee.stream()
				.collect(Collectors.
						toMap(
								Employee::getEmployeeId, 
						        Function.identity(),
						        (oldValue, newValue) -> newValue));

		System.out.println(map);
	}
	
	@Test
	public void arrayListToLinkedHashMap() {
		List<Employee> employee = TestData.getEmployeeList();

		LinkedHashMap<String, Employee> map = employee.stream()
				.collect(Collectors.
						toMap(
								Employee::getEmployeeId, 
						        Function.identity(),
						        (oldValue, newValue) -> newValue,
						        LinkedHashMap<String, Employee>::new));

		System.out.println("arrayListToLinkedHashMap   :  "+map);
	}
	
	@Test
	public void arrayListToTreeMap() {
		List<Employee> employee = TestData.getEmployeeList();

		TreeMap<String, Employee> map = employee.stream()
				.collect(Collectors.
						toMap(
								Employee::getEmployeeId, 
						        Function.identity(),
						        (oldValue, newValue) -> newValue,
						        TreeMap<String, Employee>::new));

		System.out.println("arrayListToTreeMap   :  "+map);
	}
}
