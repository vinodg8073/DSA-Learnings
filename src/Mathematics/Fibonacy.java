package Mathematics;

public class Fibonacy {
	
	public static long getFibonacy_1(long N) {
		if (N == 0 || N == 1)
			return N;
		//Not Efficient as space complexity is theta of n that function stack stores n function calls
		return getFibonacy_1(N-1) + getFibonacy_1(N-2);
	}
	
	public static long getFibonacy_2(long N) {
		//Not Efficient as Auxilary space is theta of n
		long arr[]=new long[(int) (N+1)];
		arr[0]=0;
		arr[1]=1;
		
		for (int i=2;i<=N;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[(int)N];
	}
	
	//Efficient
	public static long getFibonacy_3(long N) {
		//Auxilary space, space complexity = theta of 1, 
		//Time complexity is theta of N
		if (N==0||N==1) return N;
		int a=0, b=1;
		long c=N;
		for (int i=2; i<=N; i++) {
			c=a+b;
			a=b;
			b=(int)c;
		}
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println(getFibonacy_2(6));
		System.out.println(getFibonacy_1(6));
		System.out.println(getFibonacy_3(7));
		
	}
}
