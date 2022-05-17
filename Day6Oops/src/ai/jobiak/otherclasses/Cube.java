package ai.jobiak.otherclasses;

public class Cube extends Shapes {

	public void area(double length,double breadth,double height)
	{
		double cubar;
		cubar=6*length*length;
		System.out.println("Area of Cube is : "+"6*a**2");
		System.out.println("Area of Cube is : "+cubar);
	}
	public void volume(double length,double breadth,double height)
	{
		double cubvol;
		cubvol=length*length*length;
		System.out.println("volume of Cube is : "+"a**3");
		System.out.println("volume of Cube is : "+cubvol);
	}
}
