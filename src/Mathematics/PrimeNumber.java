package Mathematics;

public class PrimeNumber {
	
	static public boolean isPrime(long n){
		if(n==0||n==1)return false;
		
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		//Order is theta of n so not efficient	
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(2));
	}

}
