/*write a java program that calculates the energy needed to heat water from an initial temp to a final temp.
your program should prompt the user to enter the amount of water in kilograms and the initial and final temp 
of the water.
the formula to compute the energy is: Q= M*(finaltemp-initialtemp)*4184
M- weight of water

*/

import java.util.Scanner;

class CalculatingEnergy
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount of water in liters: ");
		double water = sc.nextDouble();
		System.out.print("Enter the initial temperature: ");
		double initialTemp = sc.nextDouble();
		System.out.print("Enter the final temperature: ");
		double finalTemp = sc.nextDouble();

		System.out.print("The energr needed is: "+water*(finalTemp-initialTemp)*4184);
	}
}