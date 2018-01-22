package Practice1;

import java.util.*;

public class _7_ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		long g_x=0;
		for(int i=0;i<=n;i++)
		{
			g_x+=f(i);
		}
		System.out.println(g_x);
	}

	private static long f(int i) {
		if(i==0)
			return 1;
		else
			return f(i-1)*2+i;
	}

}