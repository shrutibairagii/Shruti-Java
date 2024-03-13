//write a java program to find the largest no among 3

import java.util.Scanner;
class LargestIn3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr a 1st number: ");
		int num1 = sc.nextInt();
		System.out.print("Enetr a 2nd number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter a 3rd number: ");
		int num3 = sc.nextInt();

		int max = ((num1>num2)?num1:num2);
		int maxx = ((max>num3)?max:num3);
		System.out.print("The largest no is: "+maxx);	
	}
}