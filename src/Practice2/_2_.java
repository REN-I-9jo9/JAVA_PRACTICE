package Practice2;

import java.util.*;

public class _2_ {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String line=scanner.next().toUpperCase();
		String word=scanner.next().toUpperCase();
		scanner.close();
		
		String cut[]=line.split(word);
		int end=(line.charAt(line.length()-1)==word.charAt(0))?cut.length:cut.length-1;
		for(int i=1;i<end;i++)
			System.out.print(cut[i].length()+1+" ");
	}

}
