package Mathematics;


public class Digits {
	private  static int biggestDigit(int n) {
		int res=0;
		while(n>0) {
			int a=n%10;;
			int b=n%10%10;
			
			if(a>=b && res<=a)res=a;
			else if( res<=b ) res=b;
			n=n/10;
		}
		return res;
	}
	
	
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
		System.out.println("noOfDigits-- "+noOfDigits(123478987678L));
		System.out.println("noOfPrimeDigits-- "+noOfPrimeDigits(123478987678L));
		System.out.println("biggestDigit--"+biggestDigit(12349));
	}

}
