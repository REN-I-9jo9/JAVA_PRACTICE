package Practice3;

import java.util.*;

public class _1_ {
	static long[] ff;
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		ff=new long[n];
			System.out.println(f(n-1));
	}
	
	static long f(int n)
	{
		if(ff[n]==0)
		{
			if(n==0||n==1)
				ff[n]= 1;
			else
				ff[n]= f(n-1)+f(n-2);
		}
		return ff[n];
	}
}
