
//writw a java program to find the smalest number among the 2 number
import java.util.Scanner;

class SmallerValue
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter 1st Number : ");
	    int num1 = sc.nextInt();
	    System.out.print("Enter 2nd Number : ");
	    int num2 = sc.nextInt();
	    int min = (num1<num2)?num2:num1;
	    System.out.print(num1 + ","+num2 +"smallest no among 2 numbers is : "+min);
	}
}