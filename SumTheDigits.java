/*
Write a program that reads an integer between 0 to 1000 and adds all the digits in the integer.
eg if an integer is 932 the sum of all digitd is 14.

*/

import java.util.Scanner;
class SumTheDigits
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr a number between 0 to 1000 :  ");
		int num= sc.nextInt();
		int dup = num;
		int sum = 0;
		sum = sum+num%10;
		num = num/10;
		sum = sum+num%10;
		num = num/10;
		sum = sum+num%10;
		num = num/10;
		sum = sum +num%10;
		System.out.print("Sum of digit is"+sum+"abd the number is "+dup);
	}
}