package Practice3;

import java.util.Scanner;

public class _3_ {
	
	static long[][] block;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int count=scanner.nextInt();
		int[] x=new int[count];
		int[] y=new int[count];
		for(int i=0;i<count;i++)
		{
			x[i]=scanner.nextInt();
			y[i]=scanner.nextInt();	
		}
		for(int i=0;i<count;i++)
		{
			block=new long[x[i]][y[i]];
			
			for(int j=0;j<x[i];j++)
			{
				for(int k=0;k<y[i];k++)
				{
					if(j==0||k==0)
						block[j][k]=1;
					else
						block[j][k]=block[j-1][k]+block[j][k-1];
				}
			}
			System.out.println(block[x[i]-1][y[i]-1]);
			
		}
	}

}
/*
public class P3_3 {
	
	static long[][] a;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int count=scanner.nextInt();
		int x[]=new int[count];
		int y[]=new int[count];
		a=new long[21][21];
		for(int i=0;i<count;i++)
		{
			x[i]=scanner.nextInt();
			y[i]=scanner.nextInt();	
		}
		for(int i=0;i<count;i++)
			System.out.println(step(x[i],y[i]));
	}
	
	public static long step(int x,int y)
	{
		if(a[x][y]==0)
		{
			if(x<=1||y<=1)
				a[x][y]= 1;
			else
				a[x][y]= step(x-1,y)+step(x,y-1);
		}
		return a[x][y];
	}

}
 * */
