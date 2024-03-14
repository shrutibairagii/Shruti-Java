/*write a program to check if the given number is positive, negative or neutral(natural number)
 note- if the number is more than 0 it is positive
 	if the number is less than 0 it is negative
 	if the number is 0 then it is neutral
 	*/


 
import java.util.Scanner;
class PositiveNegativeNeutralNo
{
 	public static void main(String[] args) 
 	{
 		Scanner sc= new Scanner(System.in);
 		System.out.print("Enter the number: ");
 		int num=sc.nextInt();

 		if (num>0) 
 		{
 			System.out.print("The number " + num + " is POSITIVE ");		
 		}
 		else if (num<0) 
 		{
 			System.out.print("The number " + num + " is NEGATIVE");	
 		}
 		else if(num==0)
 		{
 			System.out.print("The nuber " + num + " is NEUTRAL");
 		}	
 		else
 		{
 			System.out.print("invalid");
 		}
 	}
}	 