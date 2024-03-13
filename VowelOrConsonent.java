//write a java program to check whether the character is vowel or consonents

import java.util.Scanner;
class VowelOrConsonent
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character : ");
		char ch = sc.next().charAt(0);
		System.out.println("The character " +ch+ " is a alphabet ");

		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("The alphabet " +ch+ "is a Vowel");
		}	
		else 
		{
			System.out.print("The alphabet" +ch+ "is a Consonents");
		}	
	}
}