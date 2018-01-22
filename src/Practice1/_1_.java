package Practice1;

import java.util.*;

public class _1_ {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		String num="1";
		for(int i=2;i<=n;i++)
			if(n%i==0)
				num+=" "+i;
		System.out.println(num);
	}
}