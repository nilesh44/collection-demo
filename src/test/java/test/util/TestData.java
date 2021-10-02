package test.util;

import java.util.ArrayList;
import java.util.List;

import test.Employee;

public class TestData {

public static List<String> ListOfWords() {
		
		List<String> words= new ArrayList<String>();
		
		words.add("anil");
		words.add("sunil");
		words.add("rahul");
		words.add("raj");
		words.add("rohit");
		words.add("anil");
		words.add("sunil");
		words.add("rahul");
		words.add("raj");
		words.add("rohit");
		words.add("anil");
		words.add("sunil");
		words.add("rahul");
		words.add("raj");
		words.add("rohit");
		words.add("anil");
		words.add("sunil");
		words.add("rahul");
		words.add("raj");
		words.add("rohit");
		
	return 	words;
	}


public static List<Employee> getEmployeeList(){
	List<Employee> employees= new ArrayList<Employee>();
	Employee e1= new Employee("1","A1","1234567899",new Double(1000));
	Employee e2= new Employee("2","B2","1234567898",new Double(5000));
	Employee e3= new Employee("1","C3","1234567897",new Double(2000));
	Employee e4= new Employee("4","D4","1234567896",new Double(6000));
	Employee e5= new Employee("1","E5","1234567895",new Double(4000));
	Employee e6= new Employee("6","F6","1234567894",new Double(3000));
	Employee e7= new Employee("7","G7","1234567893",new Double(2000));
	Employee e8= new Employee("8","H8","1234567892",new Double(4000));
	Employee e9= new Employee("9","I9","1234567891",new Double(8000));
	employees.add(e1);
	employees.add(e2);
	employees.add(e3);
	employees.add(e4);
	employees.add(e5);
	employees.add(e6);
	employees.add(e7);
	employees.add(e8);
	employees.add(e9);
	return employees;
}
}
