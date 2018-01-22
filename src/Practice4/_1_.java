package Practice4;

import java.util.*;

public class _1_ {

	public static void main(String[] args) {
		CSphere1 sp=new CSphere1();
		double x,y,z,r;
		Scanner s=new Scanner(System.in);
		x=s.nextDouble();
		y=s.nextDouble();
		z=s.nextDouble();
		r=s.nextDouble();
		s.close();
		sp.setLocation(x, y, z);
		sp.setRadius(r);
		sp.showCenter();
		System.out.println(sp.surfaceArea());
		System.out.println(sp.volume());

	}

}
class CSphere1 {
	private double x; // ��ߪ�x �y��
	private double y; // ��ߪ�y �y��
	private double z; // ��ߪ�z �y��
	private double radius; // ��y���b�|
	public void setLocation(double x,double y,double z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double surfaceArea()
	{
		return 4*Math.PI*radius*radius;
		
	}
	public double volume()
	{
		return (4*Math.PI*radius*radius*radius)/3;
		
	}
	public void showCenter()
	{
		System.out.println("x="+x+" y="+y+" z="+z);
	}
}