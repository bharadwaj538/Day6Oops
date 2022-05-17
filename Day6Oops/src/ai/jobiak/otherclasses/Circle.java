package ai.jobiak.otherclasses;

public class Circle extends Shapes {
	double radius;
	public void area(double length,double breadth,double height)
	{
		double cirar;
		radius=length;
		cirar=radius;
		System.out.println("Area of circle is : "+"r");
		System.out.println("Area of circle is : "+cirar);
	}
	public void volume(double length,double breadth,double height)
	{
		double cirvol;
		length=radius;
		cirvol=2*3.14*radius;
		System.out.println("volume of circle is : "+"2*3.14*r");
		System.out.println("volume of circle is : "+cirvol);
	}

}
