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
			if(PrimeNumber.isPrime_3(n%10))
				count++;
			n /=10;
		}
		return count;
	}
	
	private static int averageOfdigits(int N) {
		int sum=0,num=0;
		while(N>0) {
			sum += N%10;
			num++;
			N /= 10;
		}
		
		return sum/num;
	}
	
	private static int oddEvenDifference(int N) {
		int on=0, en=0;
		while(N>0) {
			int digit=N%10;
			if(digit%2==0) en+=digit;
			else on += digit;
			N /=10;
		}
		int res=on-en;
		return (res<0)?(res*-1):res;
	}
	
	public static void main(String[] args) {
		System.out.println("noOfDigits-- "+noOfDigits(123478987678L));
		System.out.println("noOfPrimeDigits-- "+noOfPrimeDigits(123478987678L));
		System.out.println("biggestDigit--"+biggestDigit(12349));
		System.out.println(averageOfdigits(102));
		System.out.println(oddEvenDifference(12325));
	}

}
