package BitWise;

public class FindOddOne {

	public static void main(String[] args) {
		int arr[]= {1,1,2,3,2,7,7};
		findOddOne_1(arr);
		findOddOne_2(arr);
	}
	
	//O(n square)
	private static void findOddOne_1(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int count =0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if (count%2!=0) {
				System.out.println("Odd element : "+arr[i]);
				break;
			}
		}
	}
	
	//O(n)
	private static void findOddOne_2(int arr[]) {
		int res=0;
		for (int i=0;i<arr.length;i++) {
			res ^= arr[i];
		}
		System.out.println("Odd element : "+res);
	}
}
