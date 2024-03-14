import java.util.Scanner;
class VowelConsonent
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Character:  ");
		char ch = sc.next().charAt(0);

		if (ch == 'a'||ch=='A') 
		{
			System.out.print("The character is a Vowel");
		}	
		else if (ch=='e'||ch=='E') 
		{
			System.out.print("The character is a Vowel");	
		}
		else if (ch=='i'||ch=='I') 
		{
			System.out.print("The character is a Vowel");
		}
		else if (ch=='o'||ch=='O') 
		{
			System.out.print("The character is a Vowel");	
		}
		else if (ch=='u'||ch=='U') 
		{
			System.out.print("The character is a Vowel");	
		}
		else 
		{
			System.out.print("The character is a Consonent");
		}
	}
}