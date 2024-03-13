//write a program whether the character is digit or not

import java.util.Scanner;
class DigitOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		int digit = sc.nextInt(); 
		System.out.print((digit>=0||digit<=9)&&(digit>9||digit<65535)?"A character is a digit":"A character is not a digit");

	}
}