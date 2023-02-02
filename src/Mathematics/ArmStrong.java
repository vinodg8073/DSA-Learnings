package Mathematics;

public class ArmStrong {
	
	public static boolean isArmstrong(int N) {
		int sum =0, temp=N;
		while (N>0) {
			int digit=N%10;
			sum += (digit*digit*digit);
			N /=10;
		}
		if(temp == sum) return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isArmstrong(153));
	}

}
