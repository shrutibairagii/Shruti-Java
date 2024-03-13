/*calculate interest
if you know the balace and the annual persentage interest rate , you can compute
the interest on the next monthly payment using the following formula

interest= balance*(annualinterestrate/1200)

write a program that reads the balance and the annual percentage interest rate and displays
the interest for the next month.*/


import java.util.Scanner;

class CalculatingInterest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Balance : ");
		int balance = sc.nextInt();
		System.out.print("Enter Interest Rate: ");
		double interest = sc.nextDouble();
		//double interestRate = interest/10;
		System.out.print("The interest is: "+balance*(interest/1200));	
	}
}