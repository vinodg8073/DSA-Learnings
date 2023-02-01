package Mathematics;

public class DivisorsOfN {
	
	public static void main(String[] args) {
		noOfDivisors_1(15);
		noOfDivisors_2(25);
		noOfDivisors_3(25);
	}
	
	//Order-- tehta of N
	private static void noOfDivisors_1(int N) {
		int num=1;
		while(num<=N) {
			if (N %num==0)
				System.out.print(num + " ");
			num++;
		}
		System.out.println();
	}
	
	//Efficient but doesn't prints divisors in order
	private static void noOfDivisors_2(int N) {
    //considering the pairs for 15 (1,15) (3,5)  for 30 (1,30) (2,15) (3,10) (5,6) they are multiple and can run the loop untill root N
		//when i=6 6*6 >30 hence stops
		for (int i=1;i*i<=N;i++) {
			if(N%i==0) {
				System.out.print(i+" ");
			//below condition is to not print repeated multiple divisors eg: 5*5=25 prints 5 once
			if(i!=N/i)
				System.out.print(N/i+" ");
			}
		}
		System.out.println();
	}
	
	//Efficient and prints divisors in order 
	private static void noOfDivisors_3(int N) {
		int i=1;
		for ( ;i*i<=N;i++) {
			if(N%i==0) 
				System.out.print(i+" ");
		}
		i--;
		//eg 25-- i=6 will become i=5 and to avoid printing 5 again
		if(i*i==N) i--; 
		for (;i>=1;i--) {
			if(N%i==0)
				System.out.print(N/i+" ");
		}
	}
}
