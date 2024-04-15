package BitWise;

public class PowerSet {

	public static void main(String[] args) {
		printPowerSet("abc");
	}
	
	//O(n*2power(n))  --> here n is string length
	private static void printPowerSet(String s) {
		int len = s.length();
		int numOfSubset = 1<<len;  //give 2 power (n) ==> no.. of subsets
		char arr[]=s.toCharArray();
		for(int i=0;i<numOfSubset;i++) {
			System.out.println("");
			for (int j=0;j<len;j++) {
				if((i&(1<<j))==0) {
					System.out.print(arr[j]);
				}
			}
		}
	}
}
