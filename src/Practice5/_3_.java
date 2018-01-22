package Practice5;

import java.util.Scanner;

class Subject // 父類別Subject
{
	double mid_score; // 期中考成績
	double final_score;// 期末考成績
	double quiz; // 小考成績

	public Subject() {
	}

	public Subject(double m, double f, double q) {
		this.mid_score = m;
		this.final_score = f;
		this.quiz = q;
	}

	public double score() {
		return mid_score * 0.4 + final_score * 0.4 + quiz * 0.2;
	}
}
class Chinese extends Subject
{
	public Chinese(double m, double f)
	{
		this.mid_score=m;
		this.final_score=f;
	}
	public double score() {
		return mid_score * 0.5 + final_score * 0.5;
	}
}
class English extends Subject
{
	public English(double f, double q)
	{
		this.final_score=f;
		this.quiz=q;
	}
	public double score() {
		return final_score * 0.7 + quiz * 0.3;
	}
}
public class _3_ {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int count=scn.nextInt();
		double max=0;
		for(int i=0;i<count;i++)
		{
			int s=scn.nextInt();
			int a=scn.nextInt();
			int b=scn.nextInt();
			Subject sub=(s==1)?new Chinese(a,b):new English(a,b);
			if(i==0||sub.score()>=max)
				max=sub.score();
		}
		scn.close();
		System.out.println(max);
	}

}
