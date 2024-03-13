//conditional operator

//write a ajav program to find user enter no is even or odd

import java.util.Scanner;
class ConditionalOp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.print((num%2==0)?num+ "Number is EVEN":num +"Number is ODD");
	}
}