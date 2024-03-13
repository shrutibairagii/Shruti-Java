 //write a java prigram to find the largest no among 2 numbers

import java.util.Scanner;

class GreaterNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int num1= sc.nextInt();
		System.out.print("Enter 2n Number: ");
		int num2= sc.nextInt();
		int max=(num1>num2)?num1:num2;
		System.out.print(num1+","+num2+"Greater number among 2 no is: "+max);	
	}
}