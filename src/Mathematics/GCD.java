package Mathematics;

public class GCD {
	//Greatest common divisor is a biggest number which divides both the i/p number
	public static void main(String[] args) {
		System.out.println(gcd_1(4,6));
		System.out.println(gcd_2(7,13));
		System.out.println(gcd_3(100,200));
	}
	
	//O(min(a,b)) 
	public static int gcd_1(int a, int b) {
		int min = Math.min(a,b);
		while (min > 0) {
			if (a%min==0 && b%min==0) {
				break;
			}
			min--;
		}
		return min;
	}
	
	//Euclidian basic logic
	public static int gcd_2(int a, int b) {
		while (a!=b) {
			if(a>b) a -=b;
			else b -= a;
		}
		return a;
	}
	
	//Euclidian optimized logic --- Efficient
	public static int gcd_3(int a, int b) {
		
		if (b==0) return a;
		 return gcd_3(b,a%b);
	}
}
