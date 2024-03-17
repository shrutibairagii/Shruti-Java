/* write a program to check if the person is eligible for driving licence
note- must have compeleted 18+ and should have passed the rto test with more than 60 marks
if re-appeared for the test again
*/

import java.util.Scanner;
class DrivingLicence
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		byte age = sc.nextByte();

		if (age>18) 
		{
			System.out.println("You are eligible for Driving Licence test ");
			System.out.print("Enter the test marks out of 100 is: ");
			byte marks = sc.nextByte();

			if (marks>60) 
			{
				System.out.println("Congratulations............");
				System.out.println("You are eligible for Driving Licence");
			}
			else 
			{
				System.out.println("Oppsss.....");
				System.out.println("Re-appeared for test because your marks are not satisfy to get a driving licence");
			}

		}
		else 
		{
			System.out.println("Sorry.........");
			System.out.print("You are not eligible for Driving Licence test because your age is incompelete try after "+(18-age)+" years.");
		}	
	}
}

