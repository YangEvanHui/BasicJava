package intro.to.java.ch10;

import java.math.BigInteger;

public class LargeFactorial {
	public static BigInteger factorial(long n) {
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			result = result.multiply(new BigInteger(i + ""));
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("50! is \n" + factorial(50));
	}
}
