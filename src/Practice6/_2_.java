package Practice6;

import java.io.*;
public class _2_ {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("file_practice_2.txt");
			FileWriter fw=new FileWriter("out2.txt");
			char[] ch = new char[1000];
			int num=fr.read(ch);
			System.out.println(num);
			
			String str=new String(ch,0,num);
			int nospacenum=num;
			for(int i=0;i<str.length();i++)
				if(str.charAt(i)==' ')
					nospacenum--;
			System.out.println(nospacenum);
			
			int thecount=0;
			String writedata="";
			for(int i=0;i<str.length()-3;i++)
			{
				if(str.charAt(i)=='t'&&str.charAt(i+1)=='h'&&str.charAt(i+2)=='e'&&str.charAt(i+3)==' ')
				{
					thecount++;
					i+=3;
					writedata+="THE ";
				}
				else
					writedata+=str.charAt(i);
			}
			System.out.println(thecount);
			
			fw.write(writedata);
			
			
			
			
			
			
			
			
			
			fr.close();
			fw.close();
		}
		catch (FileNotFoundException e) {}
		catch(IOException e){}
	}

}