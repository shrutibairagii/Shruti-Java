/*
write a program to check if the boy is eligible for marrying his girlfriend

note - the boy must be 21+ anfd he must have property of more than 1crore(10000000)or surname is AMBANI
	   if he fail in any od the condition, he is not eligible to marry that girl
	   */



import java.util.Scanner;

class Marrige
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("The boy age of boy: ");  //must be 21+
		byte age = sc.nextByte();
		System.out.print("Property of boy: "); //more than 1crore
		double property = sc.nextDouble();
		//sc.nextLine(); //1 option use nextLine()
		//Scanner sc1 = newScanner(System.in);//2 optin is create ojb of Scanner
		//sc.reset();//3 option reset the scanner object 
	
		System.out.print("Enter a surname: ");
		String surname = sc.next().toUpperCase();

		if((age>=21&&property>=10000000)||(surname.equals("AMBANI")))
		{
			System.out.println("Boy is eligible to marry ");
		}
		else 
		{
			System.out.println("Boy is not eligible to marry ");
		}	
	}
}