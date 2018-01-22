package Practice6;

import java.io.*;
public class _1_ {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("file_practice.txt");
			BufferedReader br=new BufferedReader(fr);
			FileWriter fw=new FileWriter("out.txt");
			
			String str;
			while((str=br.readLine())!=null)
			{
				String[] n=str.split(" ");
				double sum=0;
				for(int i=0;i<n.length;i++)
					sum+=Integer.parseInt(n[i]);
				sum/=n.length;
				fw.write(Double.toString(sum)+"\r\n");
			}
			fr.close();
			fw.close();
		}
		catch (FileNotFoundException e) {}
		catch(IOException e){}
	}

}