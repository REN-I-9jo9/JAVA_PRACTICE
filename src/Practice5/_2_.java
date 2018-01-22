package Practice5;

public class _2_ {
static CShape shp[]=new CShape[6];
	
	public static void main(String[] args) {
		
		shp[0]=new CCircle(2.0);
		shp[1]=new CCircle(3.0);
		shp[2]=new CSquare(4.0);
		shp[3]=new CSquare(5.0);
		shp[4]=new CTriangle(3.0,3.0);
		shp[5]=new CTriangle(5.0,4.0);
		System.out.println("面積1= "+shp[0].area());
		System.out.println("面積2= "+shp[1].area());
		System.out.println("面積3= "+shp[2].area());
		System.out.println("面積4= "+shp[3].area());
		System.out.println("面積5= "+shp[4].area());
		System.out.println("面積6= "+shp[5].area());
		System.out.println("面積最大= "+largest());
	}

	private static double largest() {
		double max=0;
		for(CShape obj : shp)
		{
			if(obj.area()>max)
				max=obj.area();
		}
			
		return max;
	}
	
}

class CShape // 父類別CShape
{	
	public double area()
	{
		return 0.0;
	}
}
class CCircle extends CShape{
	double radius;
	public CCircle(double a)
	{
		radius=a;
	}
	
	public double area()
	{
		return radius*radius*3.14;
	}
}
class CSquare extends CShape{
	double line;
	public CSquare(double a)
	{
		line=a;
	}
	
	public double area()
	{
		return line*line;
	}
}
class CTriangle extends CShape{
	double tall,bottom;
	public CTriangle(double a,double b)
	{
		tall=a;
		bottom=b;
	}
	
	public double area()
	{
		return tall*bottom/2;
	}
}

