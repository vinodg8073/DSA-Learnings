package Mathematics;

public class Conversion {
	
	public static void main(String[] args) {
		System.out.println(decimalToBinary(31));
		System.out.println(decimalToHexaDecimal(160));
	}
	
	static String decimalToBinary(int n) {
		String res="";
		while(n>0) {
			res = n%2+ res;
			n /=2;
		}
		return res;
	}
	
	static String decimalToHexaDecimal(int n) {
		String res="";
		while(n>0) {
			int b= n%16;
			if (b<10) res= b+res;
			else res = (char)(55+b) +res;
			n /=16;
		}
		return res;
	}
}
