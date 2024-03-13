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