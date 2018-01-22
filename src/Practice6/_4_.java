package Practice6;

class ATM extends Thread
{
	private static int money=10000;
	String name;
	public ATM(String a)
	{
		name=a;
	}
	public void run()
	{
		for(int i=0;i<8;i++)
			take(name);
	}
	public synchronized static void take(String n)
	{
		int t=(int) (Math.random()*2000);
		money-=t;
		if(money>=0)
			System.out.println(n+" takes "+t+",there are "+money);
		else
		{
			money+=t;
			System.out.println(n+" wants to take "+t+" but no enough money");
		}
	}
}
public class _4_ {

	public static void main(String[] args) {
		ATM a=new ATM("a");
		ATM b=new ATM("b");
		a.start();
		b.start();
	}

}