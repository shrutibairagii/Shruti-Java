import java.util.Scanner;
class Election
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		if(age>=18){
			System.out.print("Doyou have a Voter ID (yes/no): ");
			String voterId = sc.next().toLowerCase();
			if(voterId.equals("yes"))
			{
				System.out.println("******WelCome******");
				System.out.println("1. BJP");
				System.out.println("2. Congress");
				System.out.println("3. AAP");
				System.out.println("4. MNS");
				System.out.println("5. ShivSena");
				System.out.println("6. NCP");
				System.out.println("7. NOTA");

				System.out.print("Enter the option to vote for your fav party: ");
				String vote = sc.next().toUpperCase();
				if (vote.equals("BJP")) 
				{
					System.out.println("You have Voted for BJP");	
				}
				else if (vote.equals("CONGRESS")) 
				{
					System.out.println("You have Voted for CONGRESS");	
				}
				else if (vote.equals("AAP")) 
				{
					System.out.println("You have Voted for AAP");	
				}
				else if (vote.equals("MNS")) 
				{
					System.out.println("You have Voted for MNS");	
				}
				else if (vote.equals("SHIVSENA")) 
				{
					System.out.println("You have Voted for SHIVSENA");	
				}
				else if (vote.equals("NCP")) 
				{
					System.out.println("You have Voted for NCP");	
				}
				else if (vote.equals("NOTA")) 
				{
					System.out.println("You have Voted for NOTA");	
				}
				else 
				{
					System.out.println("Invalid Input");
				}

			}
			else
			{
				System.out.println("Jaldi yaha se hato");
			}

		}
		else	
		{
			System.out.println("You are not mature to vote try after "+(18-age)+ "years.");
		}	
	}
}