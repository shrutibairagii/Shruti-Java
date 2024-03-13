/*
area of a hexagon
write a java program that prompts the user to enter the side of a hexagon and display its area
the formula for computing the arae of a hexagon is

area=3(root3/2)(side*side)
*/

import java.util.Scanner;

class AreaOfHexagon
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Side: ");
		double side= sc.nextDouble();
		double area = (3*(1.7320508075688/2))*(side*side);  //3*(root 3/2)*(side*side)
		System.out.print("The area of hexagon is: "+area);	
	}
}