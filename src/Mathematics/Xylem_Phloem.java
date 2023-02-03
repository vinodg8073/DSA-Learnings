package Mathematics;

public class Xylem_Phloem {
	public static void main(String[] args) {
		System.out.println(isXylemOrPhloem(1432));
	}
	
	private static String isXylemOrPhloem(int n) {
		//sum of middle digits is equal to sum of first and last digit its xylem else phloem
		int endNum = n%10;
		n /=10;
		int sum=0;
		while (n>9) {
			sum += n%10;
			n /= 10;
		}
		return ((endNum+n)==sum?"Xylem":"Phloem");
	}
}
