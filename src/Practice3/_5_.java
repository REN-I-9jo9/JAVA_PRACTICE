package Practice3;

import java.util.*;

public class _5_ {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int count=scanner.nextInt();
		int start[]=new int[count];
		int end[]=new int[count];
		boolean canselect[]=new boolean[count];
		for(int i=0;i<count;i++)
		{
			start[i]=scanner.nextInt();
			end[i]=scanner.nextInt();
			canselect[i]=true;
		}
		scanner.close();
		
		int nowtime=0,pretime=0,donejob=0;
		
		
		do
		{
			int select=0;
			pretime=nowtime;
			for(int i=0;i<count;i++)
				select=((canselect[i]==true)&(end[i]<end[select]))?i:select;
			if(canselect[select]==true)
			{
				nowtime=end[select];
				canselect[select]=false;
				for(int i=0;i<count;i++)
					if(start[i]<nowtime)
						canselect[i]=false;
				if(nowtime!=pretime)
					donejob++;
			}
		}while(nowtime!=pretime);
		System.out.print(donejob);

	}

}