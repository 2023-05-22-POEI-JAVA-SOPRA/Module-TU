package service;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	public void test_fizz_buzz_class_have_play_method_that_return_string_and_take_integer_as_parameters() {
		
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		String result = fizzBuzz.play(5);
		
		assertEquals(result.getClass(), String.class);
		
		
	}
	
	@Test
	public void assert_play_return_1_when_send_1() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		String result = fizzBuzz.play(1);
		assertEquals(result, "1");

	}
	
	@Test
	public void assert_play_return_2_when_send_2() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		String result = fizzBuzz.play(2);
		assertEquals(result, "2");
	}
	
	@Test
	public void assert_6_and_9_return_fizz() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		assertEquals(fizzBuzz.play(3), "fizz");
		assertEquals(fizzBuzz.play(6), "fizz");
	}
	
	@Test
	public void assert_12_and_18_return_fizz() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		assertEquals(fizzBuzz.play(12), "fizz");
		assertEquals(fizzBuzz.play(18), "fizz");
	}
	
	@Test 
	public void assert_5_and_10_return_buzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		assertEquals(fizzBuzz.play(10), "buzz");
		assertEquals(fizzBuzz.play(5), "buzz");
	}
	
	@Test
	public void assert_15_return_fizz_buzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		assertEquals(fizzBuzz.play(15), "fizzbuzz");
	}
	
	@Test
	public void assert_30_return_fizz_buzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		assertEquals(fizzBuzz.play(30), "fizzbuzz");
	}
	
}
