import java.util.Scanner;

class CalculateTips
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the subtotal: ");
		double subTotal = sc.nextDouble();
		System.out.print("Enter tip rate : ");
		double tipRate = sc.nextDouble();

		double tip = tipRate/10;
		double total = subTotal+tip;
		System.out.print("The tip is  "+tip +"and total is"+total);
	}
}
		
		