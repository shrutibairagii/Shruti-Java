/*
Average acceleration is defined as the change of velocity didvided by the time taken to make the
change as shown in the following formula:
a= v1-v0/t

Write a java program that prompts the user to enter the starting velocityv0 in meter/second, the ending velocity v1
in meter/second, and the time span t in second, abd display the average acceleration.

*/
import java.util.Scanner;
class Acceleration
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr the starting velocity v0 : ");
		double v0= sc.nextDouble();
		System.out.print("Eneter the ending velocity v1 : ");
		double v1 = sc.nextDouble();
		System.out.print("Time span in second : ");
		double time =sc.nextDouble();
		double acceleration=(v1-v0)/time;
		System.out.print("The average acceleration is "+acceleration);
		
	}
}