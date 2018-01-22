package Practice4;

import java.util.Scanner;

public class _3_ {
	public static void main(String[] args) {
		CSphere3 sp1,sp2;
		int x,y,z;
		double r;
		Scanner s=new Scanner(new Scanner(System.in).nextLine());
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		r=s.nextDouble();
		sp1=new CSphere3(x,y,z,r);
		s=new Scanner(new Scanner(System.in).nextLine());
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		r=s.nextDouble();
		sp2=new CSphere3(x,y,z,r);
		s.close();
		
		sp1.showCenter();
		System.out.println(", radius="+sp1.radius);
		sp2.showCenter();
		System.out.println(", radius="+sp2.radius);
		
		System.out.println("2球圓心的距離="+sp1.distance(sp2));
		System.out.println("2球"+((sp1.isIntersect(sp2))?"有":"無")+"碰觸");
	}
}
class CSphere3 {
	private int x; // 圓心的x 座標
	private int y; // 圓心的y 座標
	private int z; // 圓心的z 座標
	public double radius; // 圓球的半徑
	public CSphere3(int a, int b, int c, double r){
		this.x=a;
		this.y=b;
		this.z=c;
		this.radius=r;
	}
	public void setLocation(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double surfaceArea(){
		return 4*Math.PI*radius*radius;		
	}
	public double volume(){
		return (4*Math.PI*radius*radius*radius)/3;		
	}
	public void showCenter(){
		System.out.print("x="+x+", y="+y+", z="+z);
	}
	public double distance(CSphere3 other){
		return Math.sqrt(Math.pow(this.x-other.x,2)+Math.pow(this.y-other.y,2)+Math.pow(this.z-other.z,2));
	}
	public double distance(int x,int y,int z){
		return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2)+Math.pow(this.z-z,2));
	}
	public boolean isIntersect(CSphere3 other){
		return (distance(other)<(this.radius+other.radius));
	}
}