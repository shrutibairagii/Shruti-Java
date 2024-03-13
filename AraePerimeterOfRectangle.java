/* Area and Perimeter of rectangle
Write a program thar display the area and perimeter of a rectangle with the width of 4.5
and height of 7.9 using the following formula:
area = width*height
*/

class AraePerimeterOfRectangle
{
	public static void main(String[] args)
	{
		double width = 4.5;
		double height = 7.9;
		double area = width*height;
		System.out.println("Area of Rectangle - "+area);
		double perimeter=2*(height+width);
		System.out.println("Perimeter of Rectangle - "+perimeter);
	}
}