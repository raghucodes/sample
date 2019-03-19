package raghucodes;
/**
 * 
 * @author raghu
 * this program does the functionality of calculator
 */
public class Calculator {
	
	/**
	 * addition of two numbers
	 * @param number1
	 * @param number2
	 * @return sum of two numbers
	 */
	public int add(int number1,int number2) {
		return number1+number2;
	}
	/**
	 * multiplies number1 by number2 times
	 * @param number1
	 * @param number2
	 * @return product of two numbers
	 */
	public int multiply(int number1,int number2) {
		return number1*number2;
	}
	/**
	 * divides number1 with number2
	 * @param number1
	 * @param number2
	 * @return
	 */
	public double division(int number1,int number2) {
		if(number2 == 0)
			throw new ArithmeticException("cannot divide with zero");
		else
			return number1/(double)number2;
		
	}

}
