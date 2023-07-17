package service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NombreTest {

	
	@Test
	public void test_add_two_integers_using_nombre_class() {
		
		Nombre n1 = new Nombre(9);
		Nombre n2 = new Nombre(11);
		
		n1.add(n2);
		
		assertEquals(n1.getValue(), 20);	
		assertEquals(n1.getValue(), 20);	
		assertEquals(n1.getValue(), 20);	
		assertEquals(n1.getValue(), 20);	
		assertEquals(n1.getValue(), 20);	
	}
	
	@Test
	public void test_add_two_integers_return_number() {
		
		Nombre n1 = new Nombre(2);
		Nombre n2 = new Nombre(1);
		
		Nombre n3 = n1.add(n2);
		
		assertNotNull(n3);
	}
	
	@Test
	public void test_multiply_two_numbers() {
		Nombre n1 = new Nombre(5);
		Nombre n2 = new Nombre(2);
		n1.multiply(n2);
		assertEquals(n1.getValue(), 10);
	}
	
	
	@Test
	public void test_multiply_two_numbers_equals_to_0 () {
		Nombre n1 = new Nombre(0);
		Nombre n2 = new Nombre(0);
		
		n1.multiply(n2);
		assertEquals(n1.getValue(), 0);
	}
	
	@Test
	public void test_substract() {
		Nombre n1 = new Nombre(10);
		Nombre n2 = new Nombre(5);
		n1.substract(n2);
		
		assertEquals(n1.getValue(), 5);
	}

	@Test
	public void test_substract_with_two_negative_numbers() {
		Nombre n1 = new Nombre(-10);
		Nombre n2 = new Nombre(-5);
		n1.substract(n2);
		
		assertEquals(n1.getValue(), -5);
	}

	
	@Test
	public void test_divide() {
		Nombre n1 = new Nombre(10);
		Nombre n2 = new Nombre(5);
		n1.divide(n2);
		
		assertEquals(n1.getValue(), 2);
	}
	
	
	@Test
	public void test_divide_by_zero() {
		Nombre n1 = new Nombre(10);
		Nombre n2 = new Nombre(0);
		
		assertThrows(ArithmeticException.class, () -> {
			n1.divide(n2);

		});
	}
}
