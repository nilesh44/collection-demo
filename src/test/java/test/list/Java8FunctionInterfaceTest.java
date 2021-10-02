package test.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

import org.junit.Test;

public class Java8FunctionInterfaceTest {

	@Test
	public void functionInterfaceTest() {
		//integer is argument and String is suppose to return
		//Function is functional interface.
		Function<Integer, String> fun= number-> String.valueOf(number);
		String output=fun.apply(126);
		assertEquals("126", output);
	}
	
	
	@Test
	public void biFunctionInterfaceTest() {
		//two input argument and one output argument
		BiFunction<Integer, Integer, String> bi= (num1,num2)->String.valueOf(num1+num2);
		String output=bi.apply(2, 5);
		assertEquals("7", output);
	}
	
	
	
	
	@Test
	public void binaryOperatorTest() {
		//two input param
		//also return same type which we pass as argument
		//both input and return type are of same type
		BinaryOperator<Integer> biopertor= (in1,in2)->{
			return in1+in2;
			
		};
		
		assertEquals("7", biopertor.apply(2, 5).toString());
		
	}
	@Test
	public void biPredicateTest() {
		//two input param
	   // return boolean
		BiPredicate<Integer, Integer> biPredicte=(num1,num2)->{
			if(num1==num2) {
				return true;
			}
			return false;
		};
		assertTrue(biPredicte.test(2, 2));
	}
	
	// we have 
	
	
}
