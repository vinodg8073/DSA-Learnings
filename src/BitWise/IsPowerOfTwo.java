package BitWise;

public class IsPowerOfTwo {

	public static void main(String[] args) {
		boolean res=isPowerOfTwo_1(6);
		boolean res1=isPowerOfTwo_2(8);
		System.out.println(res + "\n" +res1);
	}
	//Theta(d)
	private static boolean isPowerOfTwo_1(int num) {
		while(num>1) {
			if((num%2)!=0)
				return false;
			num /=2;
		}
		return true;
	}
	//Theta(d)
	private static boolean isPowerOfTwo_2(int num) {
		while(num>0) {
			if((num &(num-1))!=0)
				return false;
			num /=2;
		}
		return true;
	}
	//O(1)
	private static boolean isPowerOfTwo_3(int num) {
		
		return (num!=0 &&((num&(num-1))==0));  //Note: power of two contains only 1 single bit eg: num= 4 ==> 100 & 011 == 000  num=6 ==> 101 & 100 == 100 false
	}
}
