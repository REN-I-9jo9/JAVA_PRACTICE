package Practice5;

import java.util.Scanner;

abstract class Score 
  {
	 protected String name; // �ǥͩm�W
	 protected int math; // �ƾǦ��Z
	 protected int eng; // �^�妨�Z 
	 public abstract void stuAvg(); //�p�����ܨC�Ӿǥͪ��������� 
  }
class CScore extends Score
 {
	 public CScore(String str,int m,int e)
	 {
		 this.name=str;
		 this.math=m;
		 this.eng=e;
	 }
	 public void stuAvg()
	 {
		 System.out.println(name+" "+(math+eng)/2);
	 }
 }

public class _4_ {

	public static void main(String[] args) {
		int count;
		Scanner s=new Scanner(System.in);
		count=s.nextInt();
		CScore[] c=new CScore[count];
		for(int i=0;i<count;i++)
		{
			String str=s.next();
			int m=s.nextInt();
			int e=s.nextInt();
			c[i]=new CScore(str,m,e);
		}
		s.close();
		for(int i=0;i<count;i++)
		{
			c[i].stuAvg();
		}
		showMax(c);
	}
	static void showMax(CScore c[])
	{
		int mm=c[0].math,em=c[0].eng;
		for(CScore s:c)
		{
			if(s.math>=mm)
				mm=s.math;
			if(s.eng>=em)
				em=s.eng;
		}
		System.out.println("MATH "+mm);
		System.out.println("ENGLISH "+em);
	}
}