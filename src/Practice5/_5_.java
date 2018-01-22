package Practice5;

import java.util.Arrays;

abstract class Math {
	protected int a,b; //a,b
	protected int ans; //�p�⪺���G 
	public abstract void mod(); // �p��a%b
	public abstract void fac(); // �p��a!
	public abstract void mul(); // �p�� a*b
	public abstract void pow(); // �p��a��b���� 
	public abstract void show();//��ܭp�⪺���G
}
class Compute extends Math
{
	public Compute(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void mod() {
		ans=a%b;
	}
	public void fac() {
		ans=1;
		for(int i=1;i<=a;i++)
			ans*=i;
	}
	public void mul() {
		ans=a*b;
	}
	public void pow() {
		ans=1;
		for(int i=1;i<=b;i++)
			ans*=a;
	}
	public void show() {
		System.out.print(ans+" ");
	}
}
public class _5_ {

	public static void main(String[] args) {
		Math[] m=new Math[5];
		m[0]=new Compute(2,6);
		m[1]=new Compute(3,5);
		m[2]=new Compute(4,3);
		m[3]=new Compute(5,2);
		m[4]=new Compute(6,1);
		
		int max=0;
		System.out.println("[a*b]");
		for(int i=0;i<5;i++)
		{
			m[i].mul();
			m[i].show();
			if(i==0||m[i].ans>=max)
				max=m[i].ans;
		}
		System.out.println("�̤j��:"+max);
		
		max=0;
		System.out.println("[a*b]");
		for(int i=0;i<5;i++)
		{
			m[i].fac();
			m[i].show();
			if(i==0||m[i].ans>=max)
				max=m[i].ans;
		}
		System.out.println("�̤j��:"+max);
		
		int[] in=new int[5];
		System.out.println("[a��b����]");
		System.out.print("�Ƨǫe:");
		for(int i=0;i<5;i++)
		{
			m[i].pow();
			m[i].show();
			in[i]=m[i].ans;
		}
		Arrays.sort(in);
		System.out.println();
		System.out.print("�Ƨǫ�:");
		for(int i=0;i<5;i++)
		{
			System.out.print(in[i]+" ");
		}
		
	}
}