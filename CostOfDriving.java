/*cost of driving
write a program that peompt the user to enter the distance to drive, the fuel efficiency of the car in miles per 
gallon,and the price per gallon abd displays the cost of thr trip
*/

import java.util.Scanner;
class CostOfDriving
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the driving distance: ");
		double distance = sc.nextDouble();
		System.out.print("Enter fuel efficiency of car in miles per gallon: ");
		double miles = sc.nextDouble();
		System.out.print("Enter price per gallon: ");
		double price = sc.nextDouble();

		System.out.print("The cost of trip is: $ "+(distance/miles)*price);


	}
}