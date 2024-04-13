package BitWise;

import java.util.Scanner;

public class Operators {
	
	public static void main(String[] args) {
		while (true) {
		System.out.println("Select a bit wise operator");
		System.out.println("1 : AND");
		System.out.println("2 : OR");
		System.out.println("3 : XOR");
		System.out.println("4 : NOT");
		System.out.println("5 : Left Shift");
		System.out.println("6 : Signed right shift");
		System.out.println("7 : Unsigned right shift");
		System.out.println("8 : Exit");
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		if(num==8) {System.out.println("Closed"); break;}
		printResult(num);
		}
	}
	
	private  static void printResult(int num) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first Number");
		int num1=sc.nextInt();
		int num2 = 0;
		if(num!=4) {
			System.out.println("Enter second number");
			num2 = sc.nextInt();
		}
		switch (num) {
		
		case 1:{
			System.out.println(num1 & num2);
			break;
		}
		case 2:{
			System.out.println(num1 | num2);
			break;
		}

		case 3:{
			System.out.println(num1^num2);
			break;
		}
		
		case 4:{
			System.out.println(~num1);  // Formula (-1 -num1) for +ve i/p number. (-1 +num1) for -ve i/p number
			break;
		}
		case 5:{
			System.out.println(num1<<num2); // Formula ( num1 * 2 pow(num2)) unless overflow i.e num1 > 1073741823 (01111111111111111111111111111111)
			// formula for overflow number which results in negative/positive number eg: num1 = 1073741824 (10000000000000000000000000000000)
			// formula ( num1 * 2 pow(num2)) - (2 pow(32))
			// sign get changed based on binary representation eg: 1073741827<<1 = -2147483642 , 1073741827<<2 = 12 ::::: 1073741827 (0100000000000000000000000000011)
			break;
		}
		case 6:{
			System.out.println(num1>>num2); // Formula num1/(2 pow(num2)) for positive num1. |num1|/(2 pow(num2)) for negative round up (max) floor value eg: 1.5 => 2
			break;
		}
		case 7:{
			System.out.println(num1>>>num2); // Results only positive number Formula num1/(2 pow(num2)). 
			//If num1 is negative - formula (num1 + 2 pow(32))/(2 pow(num2)). here round down the value (min) eg: 1.5 => 1
			break;
		}
		}
	}
}
