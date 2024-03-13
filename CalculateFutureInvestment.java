/*calculate the future investment value
write a program that reads in investment amount, annual interest rate, and number of years, and displays the 
future investmnet values using the following formula:
fufture investment value- (investmenta+((investment/100))*interest)+year)
*/


import java.util.Scanner;

class CalculateFutureInvestment
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		double investment = sc.nextDouble();
		System.out.print("Enter annual interest rate in percrntage: ");
		double interest = sc.nextDouble();
		System.out.print("Enter number of year: ");
		double year = sc.nextDouble();
		double futureInvestment = (investment+((investment/100)*interest)+year);
		System.out.print("Future investment value is: "+futureInvestment);
	}
}