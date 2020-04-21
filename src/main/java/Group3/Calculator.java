package Group3;

import static org.junit.Assert.assertEquals;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mul (int a, int b) {
		return a*b;
	}
	
	public int div (int a, int b) {
		if (b==0) {
			throw new IllegalArgumentException("Number Cannot be divided by zero!");
		}
		
		return a/b;
	}
	
	public int square(int a) {
		return a*a;
	}
}
