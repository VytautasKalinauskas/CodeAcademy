
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WarmupTest {
	
	Warmup warmup;

	@BeforeEach
	void setUpBeforeClass() throws Exception {
		warmup = new Warmup();
	}

	@Test
	void testMultiplication() throws Exception {
		
		Integer result = warmup.calculator(4, '*', 6);
		
		assertEquals(24, result);
	}
	
	@Test
	void testDivision() throws Exception {
		
		Integer result = warmup.calculator(9, '/', 3);
		
		assertEquals(3, result);
	}
	
	@Test
	void testAddition() throws Exception {
		
		Integer result = warmup.calculator(4, '+', 6);
		
		assertEquals(10, result);
	}
	
	@Test
	void testSubtraction() throws Exception {
		
		Integer result = warmup.calculator(6, '-', 4);
		
		assertEquals(2, result);
	}
	
	@Test
	void testDivisionByZero() {
		
	    assertThrows(
	    		ArithmeticException.class, () -> warmup.calculator(4, '/', 0));
		
	}
	
	
	@Test
	void testIncorrectOperator() {
		
	    assertThrows(
	    		ArithmeticException.class, () -> warmup.calculator(4, '#', 0));
		
	}
	
	

	@Test
	void testAdvancedMultiplication() throws Exception {
		
		Integer result = warmup.calculatorParser("4*6");
		
		assertEquals(24, result);
		
	}
	
	@Test
	void testAdvancedAddition() throws Exception {
		
		Integer result = warmup.calculatorParser("4+6");
		
		assertEquals(10, result);
		
	}
	
	@Test
	void testAdvancedDivision() throws Exception {
		
		Integer result = warmup.calculatorParser("8/4");
		
		assertEquals(2, result);
		
	}
	
	@Test
	void testAdvancedSubtraction() throws Exception {
		
		Integer result = warmup.calculatorParser("9-4");
		
		assertEquals(5, result);
		
	}
	
	@Test
	void testAdvancedSubtractionFail() throws Exception {
		
		Integer result = warmup.calculatorParser("6*10");
		
		assertEquals(60, result);
		
	}
	
	
	@Test
	void testCountWords4Words() throws Exception {
		
		Integer result = warmup.countWords("As jau laukiu penktadienio");
		
		assertEquals(4, result);
		
	}
	
	
	@Test
	void testCountWordsOne6Words() throws Exception {
		
		Integer result = warmup.countWords("As jau laukiu penktadienio ir alaus");
		assertEquals(6, result);
		
	}

}
