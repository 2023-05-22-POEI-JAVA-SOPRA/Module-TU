package service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;



public class BinaryToolsTest {

	static BinaryTools bt;
	
	
	@BeforeAll
	public static void beforeAll() {
		BinaryToolsTest.bt = new BinaryTools();
	}
	
	@ParameterizedTest()
	@CsvSource(value = {"1010,0,1010", "0,1010,1010", "1010,1010,10100", "1,0,1" }, delimiter = ',')
	public void test_add_0_to_10(String s1, String s2,String output) {
		
		String result = bt.add(s1,s2);
		assertEquals(result, output);
	}
	
	
	@Test
	public void test_add_two_string_that_are_not_binary() {
		
		
		assertThrows(IllegalArgumentException.class, () -> {
			bt.add("lala","lolo");
		});
	}
	
	@Test
	public void test_binary_to_integer_10() {
		
		int result = bt.toInteger("1010");
		assertEquals(result, 10);
	}
	
	@Test
	public void test_binary_to_integer_5() {
		
		int result = bt.toInteger("101");
		assertEquals(result, 5);
	}
	
	@Test
	public void test_binary_to_integer_32() {
		
		int result = bt.toInteger("100000");
		assertEquals(result,32);
	}
	
	
	@Test
	public void integer_to_binary() {
		
		String result = bt.toBinary(7);
		
		assertEquals(result , "111");
		
	}
	
	@Test
	public void integer_to_binary_8() {
		
		String result = bt.toBinary(8);
		
		assertEquals(result , "1000");
		
	}
	
	@Test
	public void integer_to_binary_with_negative_number() {
		
		String result = bt.toBinary(-8);
		
		assertEquals(result , null);
		
	}
	
	
	
	
}
