//write a java program to find character is alphabet and find  in lower case or upper case using nested condition


import java.util.Scanner;

class AlphabetUpperLowerNested
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);
		System.out.print(((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))?((ch>='A'&&ch<='Z')?"The character is an alphabet in Upper Case":"The character is an alphabet in lower case"):"The character is not alphabet");	
	}
}