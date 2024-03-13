//write a java program to find sum of digit length can be 123

import java.util.Scanner;
class SumDigits123
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num= sc.nextInt();
		int dup= num;
		int sum = 0;
		sum = sum+num%10;
		num = num/10;
		sum = sum+num%10;
		num = num/10;
		sum = sum+num%10;
		num = num/10;
		System.out.print("The addition of number is: "+sum); 

	}
}