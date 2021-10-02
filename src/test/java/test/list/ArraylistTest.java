package test.list;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.Test;

import test.Employee;
import test.util.TestData;

public class ArraylistTest {

	@Test
	public void checkInitialOfSize() {
		// list has default initial capacity of 10
		// there is no such public method provided by list interface to get value for it
		// capacity

		// we can check the size of the list i.e., number of element present
		List<String> words = TestData.ListOfWords();
		assertEquals(20, words.size());
	}

	@Test
	public void convertArrayIntoList() {
		String[] array = new String[] { "anil", "sunil", "rahul", "raj" };
		List<String> names = Arrays.asList(array);
		assertEquals("anil", names.get(0));
	}




	
	
	

}