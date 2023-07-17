import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstTest {

	@BeforeAll
	public static void befAll() {
		System.out.println("Before All");
	}
	
	@AfterAll
	public static void aftAll() {
		System.out.println("After All");
	}
	
	
	@BeforeEach
	public void befEach() {
		System.out.println("Before Each");
	}
	
	@AfterEach
	public void aftEach() {
		System.out.println("After Each");
	}
	
	
	
	
	@Test
	void trueAssumption() {
		System.out.println("\tIn True Assumption");
		
		
	    ArrayList<Integer> numbers = new ArrayList<Integer>();

	    numbers.forEach( (n) -> {
	    	System.out.println(n);
	    });
		
		boolean isTrue = true;
		
		assertTrue(isTrue);
		
		assertThrows(ArithmeticException.class, () -> {
			int shouldThrows = 5/0;		
		});
		
		assertEquals(5+2, 7);
	}
	
	
	@Test
	void groupAssertions() {
		System.out.println("\tIn Group Assertions");

		int[] numbers = {0,1,2,3,4};
		
		assertAll("numbers",
				() -> assertEquals(numbers[0], 0),
				() -> assertEquals(numbers[4], 4),
				() -> assertEquals(numbers[2], 2)				
		);
	}
	
	
}
