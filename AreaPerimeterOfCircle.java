/* Area of circle
write a program thar displays the area and perimeter of a circle that has a
radius of 5.5 using the folloeing formula:
perimeter= 2*pi(3.14)*radius
area= pi(3.14)*radius*radius
*/

class AreaPerimeterOfCircle
{
	public static void main(String[] args)
	{
		double radius = 5.5;
		final double pi = 3.14;
		double area = pi*(radius*radius);
		System.out.println("Area of the Circle -"+area+"cm^2");
		double perimeter = 2*pi*radius;
		System.out.println("Perimeter of Circle - "+perimeter);
	}
}