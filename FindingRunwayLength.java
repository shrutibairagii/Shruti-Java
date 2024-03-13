/*
given an airplan acceleration a and take-off speed v, you can compute the maximum runway length
needed for an airplane to take off using the following formula:
length= v2/2a
*/


import java.util.Scanner;

class FindingRunwayLength
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter velocity: " );
		double velocity = sc.nextDouble();
		System.out.print("Enter acceleration: ");
		double acceleration = sc.nextDouble();

		System.out.print("The minimum runway length for this airplane is: "+(velocity*velocity)/(2*acceleration));	
	}
}