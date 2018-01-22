package Practice2;

import java.util.*;

public class _4_ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String tmp=scanner.nextLine();
		scanner=new Scanner(tmp);
		Vector n = new Vector(0);
		while(scanner.hasNext())
			n.add(scanner.nextInt());
		
		scanner=new Scanner(tmp);
		int num[]=new int[n.size()];
		for(int i=0;i<n.size();i++)
			num[i]=scanner.nextInt();
		
		for(int i=0;i<num.length;i++)
			System.out.print(num[i]+" ");
		System.out.println();
		Arrays.sort(num);
		System.out.println(num[num.length-1]+" "+num[0]);
		for(int i=0;i<num.length;i++)
			System.out.print(num[i]+" ");
	}
}