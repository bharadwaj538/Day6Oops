package ai.jobiak.otherclasses;

public class Triangle extends Shapes {

	public void area(double length,double breadth,double height)
	{
		double triar;
		triar=1/2*(breadth*height);
		System.out.println("Area of triangle is : "+"1/2(b*h)");
		System.out.println("Area of triangle is : "+triar);
	}
	public void volume(double length,double breadth,double height)
	{
		double trivol;
		trivol=length*breadth*height;
		System.out.println("volume of triangle is : "+"l*b*h");
		System.out.println("volume of triangle is : "+trivol);
	}
}
