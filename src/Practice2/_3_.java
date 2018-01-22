package Practice2;

import java.util.*;

public class _3_ {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String line=scanner.next();
		scanner.close();
		
		int length=line.length();
		for(int sublength=length;sublength>1;sublength--)
		{
			boolean thas=false;
			for(int subno=0;subno<=length-sublength;subno++)
			{
				boolean has=false;
				String sub=line.substring(subno,subno+sublength);
				//System.out.println(sublength+" "+subno+" "+sub);
				for(int i=0;i<sub.length();i++)
				{
					if(sub.charAt(i)==sub.charAt(sub.length()-1-i))
						has=true;
					else
					{
						has=false;
						break;
					}
				}
				if(has)
				{
					thas=true;
					System.out.print(sub+" ");
				}
			}
			if(thas)
				break;
				
		}

	}

}