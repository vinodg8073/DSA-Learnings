package Mathematics;

public class SpecialTwoDigit {
	private static boolean specialTwoDigit(int N) {
		if(N>99||N<10) 
			System.err.println(N +" is not a two digit number....");
		else {
			int sum=0, mul=1,temp=N;
			//Order TC-- big O of digits  eg:59--- (5+9)+(5*9)
			while (N>0) {
				sum+=N%10;
				mul*=N%10;
				N=N/10;
			}
			
			if(temp==(sum+mul)) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(specialTwoDigit(59));
	}
}
