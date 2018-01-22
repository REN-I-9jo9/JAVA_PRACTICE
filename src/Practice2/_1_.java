package Practice2;

import java.util.*;

public class _1_ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int k=scanner.nextInt();
		boolean light[]=new boolean[n];
		for(int i=1;i<=k;i++)
			for(int j=0;j<n;j++)
				if((j+1)%i==0)
					light[j]=(light[j]==false);
		for(int i=0;i<n;i++)
			if(light[i])
				System.out.print((i+1)+" ");
	}
}