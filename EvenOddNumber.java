//wite s program to check if the user entered number is even or odd?
//note - if the number is divisible by 2,it is  even number
//if the number is not divisible by 2 , it is odd number

import java.util.Scanner;
class EvenOddNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n= sc.nextInt();
		if (n % 2==0) 
		{
			System.out.print("The number is EVEN ");		
		}	
		else
		{
			System.out.print("The number is ODD ");
		}
	}
} 