package Mathematics;

import java.util.Scanner;

public class Numbers {
	
	private  static long sumOfN_No_1(int n) {
		int sum=0;
		while(n>0) {
			sum += n;
			n--;
		}
		return sum;
	}
	
	//Efficient TC--O(1)
	public static long sumOfN_No_2(int N) {
		return N*(N+1)/2;
	}
	
	private static String evenOrOdd() {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a number to check even or odd:");
		int a =sc.nextInt();
		String line_seperator=System.lineSeparator();
		System.out.println("Choose option to execute:"+line_seperator+"1: using if case \r\n "+"2: using ternery \r\n"+"3: using array \r\n"+"4: without modulos");
		switch(sc.nextInt()) {
		case 1:{
			if(a%2==0)return "Even";
			return "Odd";
		}
		case 2:{
			return (a%2==0)?"Even":"Odd";
		}
		case 3:{
			String arr[]= {"Even","Odd"};
			return arr[a%2];
		}
		case 4:{
			if((a/2)*2==a) return "Even";
			return "Odd";
		}
		}
		return "";
	}
	
	public static long reverseNumber(long N) {
		long res=0;
		while(N>0) {
			res = res*10 + N%10;
			N /= 10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfN_No_1(10));
		System.out.println(sumOfN_No_2(10));
		System.out.println(evenOrOdd());
		System.out.println(reverseNumber(12398279334L));
	}
}
