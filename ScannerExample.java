import java.util.Scanner;   //import scanner class

class ScannerExample
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);       //creating an obj of sacnner class
		System.out.print("Enter your name : ");
		String name = sc.next().toLowerCase();     //util the method of scanner class
		char ch = name.charAt(0);                  //extracting the charater which is at 0th index 
		System.out.println("Hi my name is "+name + "and my first character is "+ch);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Character"+ch+"is a vowel");
		}
		else
		{
			System.out.println("Character"+ch+"is a consonent");
		}
	}
}