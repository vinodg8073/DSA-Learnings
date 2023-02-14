package Mathematics;

public class Power {

	public static void main(String[] args) {
		System.out.println(getPowerofN_1(3,4));
		System.out.println(getPowerofN_2(3,4));
		System.out.println(getPowerofN_3(3,4));
	}
	
	 static public long getPowerofN_1(int base, int pow) {
		 if (base==0) return 1;
		 int temp=base;
		 while(pow>1) {
			 base *= temp;
			 pow--;
		 }
		 //Order TC-- theta of pow
		return base;
	}
	 
	 //TC and ASC both are O(log pow)
	 static public long getPowerofN_2(int base, int pow) {
		 if(pow==0) return 1;
		 long temp= getPowerofN_2(base,pow/2);
		 temp *=temp;
		 if(pow%2==0) return temp;
		 else return temp*base;
	 }
	 
	 //TC is O(log pow) and ASC is O(1)
	 static public long getPowerofN_3(int base, int pow) {
		 if(base==0) return 1;
		 int res =1;
		 while(pow>0) {
			 if (pow%2 != 0)
				 res *= base;
			 base *=base;
			 pow/=2;
		 }
		 return res;
	 }
}
