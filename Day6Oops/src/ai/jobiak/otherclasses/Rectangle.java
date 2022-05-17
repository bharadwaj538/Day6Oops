package ai.jobiak.otherclasses;

public class Rectangle extends Shapes {
	public void area(double length,double breadth,double height)
	{
		double rectar;
		rectar=length*breadth;
		System.out.println("Area of rectangle is : "+"l*b");
		System.out.println("Area of rectangle is : "+rectar);
	}
	public void volume(double length,double breadth,double height)
	{
		double rectvol;
		rectvol=2*(length+breadth);
		System.out.println("volume of rectangle is : "+"2*(l+b)");
		System.out.println("volume of rectangle is : "+rectvol);
	}
	

}
