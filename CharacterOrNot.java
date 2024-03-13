// write a java program whether the character is alphabet or not

import java.util.Scanner;
class CharacterOrNot
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character : ");
		char ch= sc.next().charAt(0);
		System.out.print((ch>65&&ch<90)||(ch>97&&ch<122)?"A Character is a Alphabet":"A character is not Alphabet");
		 //(ch>'A&&ch<'Z')||(ch>'a&&ch<'z')

	}
}