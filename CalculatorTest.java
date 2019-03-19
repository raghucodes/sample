package raghucodes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void additionTest() {
		Calculator calculate = new Calculator();
		assertEquals(100,calculate.add(0, 100));
		assertEquals(-6,calculate.add(6, -12));
		assertEquals(0,calculate.add(125,-125));
	}
	
	@Test
	void multiplyTest() {
		Calculator calculate = new Calculator();
		assertEquals(-18,calculate.multiply(-6, 3));
		assertEquals(18,calculate.multiply(6, 3));
		assertEquals(-18,calculate.multiply(6, -3));
		assertEquals(18,calculate.multiply(-6, -3));
	}
	
	@Test
	void divisionTest() {
		Calculator calculate = new Calculator();
		assertEquals(6,calculate.division(18,3));
		assertEquals(-6,calculate.division(18,-3));
		Assertions.assertThrows(ArithmeticException.class, () -> calculate.division(5, 0));
	}
}
