package Mathematics;

public class Palindrome {
	private static boolean isPalindrme(int N) {
		int temp=N, rev=0;
		while(N>0) {
			rev = rev*10 +N%10;
			N /=10;
		}
		if (rev == temp)return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrme(102));
	}
}
