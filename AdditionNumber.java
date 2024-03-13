import java.util.Scanner;

class AdditionNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd Number : ");
		int num2 = sc.nextInt();
		int add = num1+num2;
		System.out.println("Addition is :"+add);
	}
}