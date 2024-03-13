/*
write a program to check if the user enetered persentage is elogible for appearing the interview or not?
note- if the persentage is above 60 the student is eligible for interview
	 if the persentage is below 60 the student is not eligible for interview

*/

import java.util.Scanner;
class EligibleForInterview
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the persentage: ");
		double persentage = sc.nextDouble();

		if (persentage>60) 
		{
			System.out.println("The student is eligible for interview");		
		}	
		else
		{
			System.out.print("The student is not eligible for interview");
		}
	}
}
