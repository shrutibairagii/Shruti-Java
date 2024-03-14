/*write a program to check if thr user ia able to join army or not/
note- age should be more than 18+ and height should be at least 162 cm and weight must be more than 56kg
*/

import java.util.Scanner;
class EligibleForArmyJoin
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		byte age = sc.nextByte();

		if (age>18) 
		{
			System.out.print("Enter your Height:  ");
			double height = sc.nextDouble();

			if (height >=162) 
			{
				System.out.print("Enter your Weight: ");
				double weight = sc.nextDouble();

				if (weight>56) 
				{
					System.out.print("CONGRATULATIONS.......");
					System.out.print("YOUR ARE ELIGIBLE TO JOIN ARMYYY...");		
				}
				else
				{
					System.out.print("Sorry.....");
					System.out.print("Your weight is not satisfy to join ARMY");
				}	
			}
			else 
			{
				System.out.print("Sorry......");
				System.out.print("Your height is not satisfy to join ARMY");
			}

		}
		else
		{
			System.out.println("Sorry.....");
			System.out.println("Your age is not satisfy to join ARMY");
		}
	}
}