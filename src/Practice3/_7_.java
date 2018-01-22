package Practice3;

import java.util.Scanner;

public class _7_ {
	public static void main(String[] args) {
		int w[] = new int[100];
		int v[] = new int[100];
		int dp[][] = new int[100][100];
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			w[i]=scn.nextInt();
			v[i]=scn.nextInt();
		}
		int max=scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=max;j++)
			{
				if(j>=w[i]&&v[i]+dp[i-1][j-w[i]]>dp[i-1][j])
					dp[i][j]=v[i]+dp[i-1][j-w[i]];
				else
					dp[i][j]=dp[i-1][j];
			}
		}
		System.out.println(dp[n][max]);
		scn.close();
		
	}
}
