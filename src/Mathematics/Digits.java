package Mathematics;


public class Digits {
	
	private static int noOfDigits(long n) {
		int count=0;
		while(n>0) {
			count++;
			n /= 10;
		}
		//Order is theta of digits (-)(d)
		return count;
	}
	
	public static int noOfPrimeDigits(long n) {
		int count=0;
		while (n>0) {
			if(PrimeNumber.isPrime(n%10))
				count++;
			n /=10;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(noOfDigits(123478987678L));
		System.out.println(noOfPrimeDigits(123478987678L));

	}

}
