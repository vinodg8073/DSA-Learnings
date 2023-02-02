package Mathematics;

import java.util.ArrayList;

public class PerfectNumber {
	
	private static boolean isPerfectNumber_1(int n) {
		int sum =0,i=1, temp=n;
		//n/2 bcoz after half of N none of the num will be divisors of N
		while (i<(n/2)) {
			if(n%i==0)
				sum +=i;
			i++;
		}
		if (sum==temp) return true;
		return false;
	}
	
	public static boolean isPerfectNumber(int N) {
		// sum of divisors except the number itself eg: 28 =1+2+4+7+14
		// if prime or 1 the it cannot be perfect number as there will be no divisors
		if(PrimeNumber.isPrime(N)) return false;
		ArrayList<Integer> arr= DivisorsOfN.allDivisors(N);
		int sum=0;
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
//			System.out.println(arr.get(i));
		}
//		System.out.println(sum);
		if(sum==N) return true;
	    return false;
	}
	public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber_1(28));
	}
}
