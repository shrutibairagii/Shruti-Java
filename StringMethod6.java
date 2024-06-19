/*string valu from user
enter thew character to get the count

op- the count of the character

ex-qspiderssqsp

enter rhe character to get the count:
s
op-4
*/
import java.util.*;
class StringMethod6
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a string: ");
		String name=sc.nextLine();

		System.out.println("Enter the character to get the count: ");
		char ch =sc.next().charAt(0);
		int count=0;

		for (int i =0;i<name.length() ; i++)
		{
			char ch2=name.charAt(i);
			if (ch==ch2) 
			{
				count++;		
			}	
		}
		System.out.println("Count of Character is: "+count);

	}
}