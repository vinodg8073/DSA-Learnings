package Mathematics;

public class Custom {
	static int custom_1(long N) {
		//in given number return biggest between two digits from starting 
		//eg -- Ip: 1473 --Op: 47
		N= Numbers.reverseNumber(N);
		String res="";
		long fst=0,sec=0,big=0,count=1;
		//2543741
		while(N>0) {
			
			if(count==2) sec=N%10;
			else if(count==1) fst=N%10;
			if(count==3) {
				if(sec>fst) big=sec;
				else big=fst;
				res = res+big;
				count=1;
			}
			count++;
			
			N/=10;
		}
		return Integer.parseInt(res);
	}
	
	public static void main(String[] args) {
		System.out.println(custom_1(147345));
	}
}
