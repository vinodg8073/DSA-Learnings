package BitWise;

import java.util.Scanner;

public class CountSetBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to count set bits.");
		countSetBits_3(sc.nextInt());
	}
	
	//Theta (d) or O(log n)
	private static int countSetBits_1(int num) {
		int count = 0;
		while(num>0) {
			if(num%2==1) 
				count++;
			num /=2;
		}
		System.out.printf("Number of set bits is = %d",count);
		return count;
	}
	//Theta (d)  --> where d is bits between trailing bit and most significant bit [eg: 5 == 000...0101 considered until 101]
	private static int countSetBits_2(int num) {
		int count = 0;
		while(num>0) {
			count += (num&1);
			num/=2;
		}
		System.out.printf("Number of set bits is = %d",count);
		return count;
	}
	
	//Theta (sb)  --sb-> set bits  or O(log n)
	//Brian kerringrams algorithm
	private static int countSetBits_3(int num) {
		int count=0;
		while(num!=0) {
			num &= (num-1);
			count++;
		}
		System.out.printf("Number of set bits is = %d",count);
		return count;
	}

}
