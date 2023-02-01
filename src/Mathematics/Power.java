package Mathematics;

public class Power {

	public static void main(String[] args) {
		System.out.println(getPowerofN(3,4));
	}
	
	 static public long getPowerofN(int base, int pow) {
		 if (base==0) return 1;
		 int temp=base;
		 while(pow>1) {
			 base *= temp;
			 pow--;
		 }
		 //Order TC-- theta of pow
		return base;
	}
}
