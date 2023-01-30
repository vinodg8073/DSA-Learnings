package Mathematics;

public class CountDigits {
	
	private static int noOfDigits(long n) {
		int count=0;
		while(n>0) {
			count++;
			n /= 10;
		}
		//Order is theta of digits (-)(d)
		return count;
	}

	public static void main(String[] args) {
		System.out.println(noOfDigits(123478987678L));
	}

}
