import java.util.Scanner;

class MinNo3Nested
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter 1st Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd Number : ");
		int num2 = sc.nextInt();
		System.out.print("Enter 3rd Number : ");
		int num3 = sc.nextInt();
		//System.out.print("The min number among 3 is : "(((num1<num2)?(num1):(num2))((num1<num3)?(num1):(num3))((num2<num3)?(num2):(num3))));
		System.out.println("The min number among 3 numbers is : "+((num1<num2)?((num1<num3)?(num1):(num3)):((num2<num3)?(num2):(num3))));
	}
}