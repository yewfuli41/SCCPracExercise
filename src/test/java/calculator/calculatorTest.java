package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorTest {

	Calculator calculator = new Calculator();

	@Test
	public void testAdd() {
		assertEquals(5, calculator.add(2, 3));
	}

	@Test
	public void testSubtract() {
		assertEquals(1, calculator.subtract(3, 2));
	}

	@Test
	public void testMultiply() {
		assertEquals(6, calculator.multiply(2, 3));
	}

	@Test
	public void testDivide() {
		assertEquals(2.0, calculator.divide(6, 3), 0.001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivideByZero() {
		calculator.divide(5, 0);
	}

}
