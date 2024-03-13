/*write a java program to check the character is alphabet or not and if it is a alphabet the alphabet is upper case or lower case
*/
import java.util.Scanner;
class AlphabetUpperLower
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr a character: ");
		char ch=sc.next().charAt(0);
		System.out.println((ch>65&&ch<90)||(ch>97&&ch<122)?"A character is a Alphabet":"A character is not a Alphabet");

		if(ch>'A'&&ch<'Z')
		{
			System.out.println("The alphabet "+ch+" is in the Upper Case ");
		}
		else 
		{
			System.out.print("The alphabet "+ch+" is in the Lower Case ");
		}


	}
}