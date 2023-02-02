package Mathematics;

public class StrongNumber {
	public static void main(String[] args) {
		System.out.println(isStrongNumber(144));
	}
	
	public static boolean isStrongNumber(int N) {
		//equal to sum of factorial of it's all digits  145 = 1! + 4! + 5!
		int sum=0, temp=N;
		while(N>0) {
			sum += Factorial.getFactorialOfN(N%10);
			N /=10;
		}
		if (sum==temp) return true;
		return false;
	}

}
