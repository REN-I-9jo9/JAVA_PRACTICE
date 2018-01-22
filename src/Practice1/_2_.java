package Practice1;

import java.util.*;

public class _2_ {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input=scanner.nextLine();
		int _2468[]={0,0,0,0};
		for(int i=0;i<input.length();i++)
		{
			switch(input.charAt(i))
			{
				case '2':
					_2468[0]++;
					break;
				case '4':
					_2468[1]++;
					break;
				case '6':
					_2468[2]++;
					break;
				case '8':
					_2468[3]++;
					break;
			}
		}
		System.out.println("2 "+_2468[0]);
		System.out.println("4 "+_2468[1]);
		System.out.println("6 "+_2468[2]);
		System.out.println("8 "+_2468[3]);
	}

}