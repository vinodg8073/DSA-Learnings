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
		System.out.println("5 : Close");
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		if(num==5) break;
		printResult(num);
		}
	}
	
	private  static void printResult(int n) {
		Scanner sc =new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=0;
		if (n!=4) {num2=sc.nextInt();}
		switch (n) {
		
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
			System.out.println(~num1);
			break;
		}

		}
			
		
	}

}
