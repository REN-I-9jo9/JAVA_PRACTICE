package Practice3;

import java.util.*;

public class _2_ {
	static long[] ff;
	static long[] a;
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		ff=new long[n+1];
		a=new long[n+1];
		System.out.println(f(n));
		
		
	}
	static long fab(int n)
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
	static long f(int n)
	{
		if(a[n]==0)
			a[n]= fab(n);
		return a[n];
	}
}
