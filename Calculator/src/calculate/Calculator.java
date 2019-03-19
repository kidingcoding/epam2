package calculate;
public class Calculator {

	/**
	 * finds addition of two numbers
	 * @param x
	 * @param y 
	 * @return int addition of two numbers
	 */
	public int Addition(int x , int y) {
		return x+y;
	}
	/**
	 * finds multiplication of two numbers
	 * @param x 
	 * @param y
	 * @return int multiplication of two numbers
	 */
	public int Multiplication(int x , int y) {
		return x*y;
	}
	/**
	 * finds division of two numbers
	 * @param x
	 * @param y
	 * @return double a divides b
	 */
	public double Division(int x, int y) {
		if(y==0)
			throw new ArithmeticException("Cannot divide by zero");
		else
			return x/(double)y;
	}
}
