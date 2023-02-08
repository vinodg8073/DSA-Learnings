package Mathematics;

public class PrimeNumber {
	
	static public boolean isPrime_1(long n){
		if(n<=1)return false;
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		//Order is theta of n so not efficient	
		return true;
	}
	
	static public boolean isPrime_2(long n) {
		if (n<=1)return false;
		// O(root(n))  -- Eg: 30 (1,30)(2,15),(3,10),(5,6) --1,2,3,5 < root(n)
		for (int i=2;i*i<=n;i++) { 
			if(n%i==0)
			return false;
		}
		return true;
	}
	
	static public boolean isPrime_3(long n) {
		if (n<=1) return false;
		if (n==2||n==3) return true;
		if(n%2==0||n%3==0) return false;
		//O(root(n)) -- idea is if n=5/7/11/13/17/19/23... the below for loop will fail to check condition
		// if n=4,6,8,9,10,12,14,15,16,18,20,21,22,24,... this no's is divisible by 2/3 hence executes above conditions
		for (int i=5;i*i<=n;i=i+6) {
			if (n%i==0||n%(i+2)==0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime_1(2));
		System.out.println(isPrime_2(7));
		System.out.println(isPrime_3(19));
	}

}
