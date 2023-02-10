package Mathematics;

public class PrimeFactor {
	
	public static void main(String[] args) {
		printPrimeFactors_1(10000);
		printPrimeFactors_2(10000);
		printPrimeFactors_3(10000);
	}
	
	static void printPrimeFactors_1(int n) {
		//O(n * log n)
		for(int i=2;i<n;i++) {
			if (PrimeNumber.isPrime_3(i)) {
				int x=i;
				while(n%x==0) {
					System.out.print(i+" ");
					x=x*i;
				}
			}
		}
		System.out.println();
	}

	static void printPrimeFactors_2(int n) {
		//O(root n)
		if(n<1) return;
		for (int i=2;i*i<=n;i++) {
			while(n%i==0) {
				System.out.print(i+" ");
				n /=i;
			}
		}
		if(n>1)
			System.out.print(n);
		System.out.println();
	}
	
	static void printPrimeFactors_3(int n) {
		
		if(n<1) return;
		
		while (n%2==0) {
			System.out.print(2+" ");
			n /=2;
		}
		
		while(n%3==0) {
			System.out.print(3+" ");
		}
		//O(root n) -- saves the num.. of iteration
		for (int i=5;i*i<=n;i+=6) {
			while(n%i==0) {
				System.out.print(i+" ");
				n /=i;
			}
			while(n%(i+2)==0) {
				System.out.print(i+" ");
				n /=i;
			}
		}
		if (n>3) 
			System.out.print(n);
		System.out.println();
	}
}
