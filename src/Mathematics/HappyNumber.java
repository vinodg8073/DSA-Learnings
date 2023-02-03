package Mathematics;

public class HappyNumber {
	
	private static boolean isHappyNum(int N) {
//		Input: n = 19 ---happy num's 1, 7, 10, 13, 19, 23, 28, 31, 32, etc.
//		Output: True
//		19 is Happy Number,
//		1^2 + 9^2 = 82
//		8^2 + 2^2 = 68
//		6^2 + 8^2 = 100
//		1^2 + 0^2 + 0^2 = 1
		if (N == 1 || N == 7) return true;
		while (N>9) {
			int sum=0;
			do {
				int digit=N%10;
				sum += digit*digit;
				N/=10;
			}while (N!=0);
			N=sum;
		}
		return (N==1||N==7)?true:false;
	}
	
	public static void main(String[] args) {
		System.out.println(isHappyNum(14));
	}
}
