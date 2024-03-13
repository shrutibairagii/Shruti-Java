/*
Write a program that prompts the user to enter the minutes(eg.1 billion),and displays the number of years
and days for the minutes. for simiplicity, assume a year has 365 days.

*/

import java.util.Scanner;
class NumberOfYears
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of minutes : ");
		double minutes = sc.nextDouble();
		double year = minutes/(60*24*365);
		System.out.print(minutes+" minutes is approximately "+year+"years");

	}
}