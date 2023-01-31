package Mathematics;

public class Factorial {
	
	public static long getFactorialOfN(int n) {
		if(n<0) { 
			System.err.println("Cannot count Factorial for Negative number :");
			return n;
		}
		long fact=1L;
//		Order is big O of n
		for (int i=2;i<=n;i++) {
			fact *= i;
		}
		return fact;
	}
	
	private static int primeDigitsInFactorial(int n) {
		return Digits.noOfPrimeDigits(getFactorialOfN(n));
	}
	
	//inEfficient code
	private static int leadingZerosOfFactorial(long n) {
		int count=0;
		while(n%10==0) {
			count++;
			n /=10;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(getFactorialOfN(20));
		System.out.println(primeDigitsInFactorial(20));
		System.out.println(leadingZerosOfFactorial(getFactorialOfN(20)));
	}
}
