package Practice1;

import java.util.*;

public class _10_ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int t=0;
		while(n!=1)
		{
			if(n%2==1)
				n=3*n+1;
			else
				n=n/2;
			t++;
		}
		System.out.println(t);
	}

}