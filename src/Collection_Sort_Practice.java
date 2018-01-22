import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection_Sort_Practice {
	public static void main(String[] args) {
		seq[] newseq=new seq[5];
		newseq[0]=new seq(1,'A',"ACDS");
		newseq[1]=new seq(0,'C',"AC");
		newseq[2]=new seq(4,'D',"BACCC");
		newseq[3]=new seq(3,'B',"AAB");
		newseq[4]=new seq(2,'E',"A");
		List<seq> listseq=Arrays.asList(newseq);
		
		Collections.sort(listseq, Comparator.comparing(seq::compare_1));
		for(int i=0;i<5;i++)
			System.out.println(listseq.get(i).outl());
		System.out.println("------");
		Collections.sort(listseq, Comparator.comparing(seq::compare_2));
		for(int i=0;i<5;i++)
			System.out.println(listseq.get(i).outl());
		System.out.println("------");
		Collections.sort(listseq, Comparator.comparing(seq::compare_3));
		for(int i=0;i<5;i++)
			System.out.println(listseq.get(i).outl());
		System.out.println("------");
	}
}
class seq
{
	int _1;
	char _2;
	String _3;
	public seq(int a,char b,String c)
	{
		_1=a;
		_2=b;
		_3=c;
	}
	public int compare_1() {
        return this._1;
    }
	public char compare_2() {
        return this._2;
    }
	public String compare_3() {
        return this._3;
    }
	public String outl()
	{
		return Integer.toString(_1)+" "+_2+" "+_3+" ";
	}
}