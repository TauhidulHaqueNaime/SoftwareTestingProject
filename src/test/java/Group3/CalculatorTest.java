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
	
	@Test
	
	public void SubTest() {
		Calculator junit= new Calculator();
		int result = junit.sub(20,10);
		assertEquals(10,result);
	}
	
	public void MulTest() {
		Calculator junit= new Calculator();
		int result = junit.mul(20,10);
		assertEquals(200,result);
	}
	
	
	public void DivTest() {
		Calculator junit= new Calculator();
		int result = junit.div(20,10);
		assertEquals(2,result);
	}
	
	public void SquareTest() {
		Calculator junit= new Calculator();
		int result = junit.square(20);
		assertEquals(400,result);
	}
	
}
