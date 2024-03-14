//write a java program to check if the uasr is able to donate bllod or not
//note- user must be 20+ and must not consume cigarette or alcohol in 24 hours before donationg blood and weight 
//must be more than 50 kg


import java.util.Scanner;
class BloodDonation
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		if (age>20) 
		{
			System.out.print("You have consume cigarette or alcohol in 24 hours before(yes/no): ");
			String consume = sc.next().toLowerCase();
			if(consume.equals("no"))
			{
				System.out.print("Enter your weight:  "+"kg");
				double weight= sc.nextDouble();
				if (weight>=50) 
				{
					System.out.println("CONGRATSSSSSSS");
					System.out.println("YOU ARE ELIGIBLE TO BLOOD DONATION");	
				}
				else 
				{
					System.out.println("You are not eligible to donate blood");
				}

			}
			else 
			{
				System.out.println("You are not eligible to donate blood");
			} 	
		} 
		else 
		{
			System.out.println("You are not eligible to donate blood come after "+(21-age)+ " years.");
		}	
	}
}