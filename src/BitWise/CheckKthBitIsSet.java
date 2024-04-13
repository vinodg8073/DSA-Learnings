package BitWise;

import java.util.Scanner;

public class CheckKthBitIsSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Press 1 to check k th bit");
			System.out.println("Press any to close");
			int inp = sc.nextInt();
			if (inp==1) {
				System.out.println("Enter Number");
				int num = sc.nextInt();
				System.out.println("Enter kth bit to check");
				int bit = sc.nextInt();
				if (bit <1 && bit>32) {
					System.out.println("Bit should be between 0 and 33");
					continue;
				}
				
				isKthBitOfNumIsSet_4(num, bit);
			}
		}
		
	}
	
	//Theta(bit)
	private static void isKthBitOfNumIsSet_1(int num, int bit) {
		for(int i = 1; i<bit ; i++)
			num /=2;   // number is reduced to have the k th bit at the trailing end. eg:(4) 0100 bit=3 ==> 4 is now 1/2 ==> 0 and remainder 1 ==> 01
		if((num&1)!=0)
			System.out.println("Set");  // 01 & 01 ==> 01 (1)!= 0 
		else
			System.out.println("Not Set");
	}
	//Theta(bit)
	private static void isKthBitOfNumIsSet_2(int num, int bit) {
		int pos=1;
		for(int i = 1; i<bit ; i++)
			pos *= 2;   // number to have the set bit at the kth position. eg:bit=3 ==> 1*2*2 = 4 (0100) 
		if((num&pos)!=0)
			System.out.println("Set"); 
		else
			System.out.println("Not Set");
	}
	
	// O(1)
	private static void isKthBitOfNumIsSet_3(int num, int bit) {
		if (((1<<(bit-1))&num)!=0) // moves the bit and set's at position 
			System.out.println("Set");
		else
			System.out.println("Not Set");
	}
	
	// O(1)
	private static void isKthBitOfNumIsSet_4(int num, int bit) {
		if (((num>>(bit-1))&1)!=0)  // (num>>(bit-1)) right shifts for the num binary reps.. and brings the bit to trailing end checks with 01
			System.out.println("Set");
		else
			System.out.println("Not Set");
	}
}
