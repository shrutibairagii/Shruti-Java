/*input-playhomessss

enter the character to remove occurences
s

output= playhome
*/
import java.util.*;
class StringMethod7RemoveOccurence
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string: ");
		String name=sc.nextLine();
		System.out.print("Enter the character to remove the occurance: ");
		String ch=sc.next();
		String replaced=name.replace(ch," ");
		System.out.println(replaced);


	}
}