package ai.jobiak.otherclasses;

public class Square extends Shapes {

	public void area(double length,double breadth,double height)
	{
		double squar;
		squar=length*length;
		System.out.println("Area of square is : "+"a*a");
		System.out.println("Area of square is : "+squar);
	}
	public void volume(double length,double breadth,double height)
	{
		double squvol;
		squvol=length*length*length;
		System.out.println("volume of square is : "+"a**3");
		System.out.println("volume of square is : "+squvol);
	}
}
