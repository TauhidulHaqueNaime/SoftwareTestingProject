package Group3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void AddTest() {
		Calculator junit = new Calculator();
		int result= junit.add(101, 200);
		assertEquals(301,result);
	}

}
