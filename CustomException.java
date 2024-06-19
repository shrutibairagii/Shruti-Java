import java.util.*;
class kartikGirlFriendException  extends Exception
{
	String message;
	kartikGirlFriendException(String message)
	{
		super(message);
	}
}
class CustomException
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter kartik gf name: ");
		String kartikGf=sc.nextLine();
		System.out.println("Enter kartik wife name: ");
		String kartikWife=sc.nextLine();
		// System.out.println(kartikGf);
		// System.out.println(kartikWife);

		if (kartikGf.isEmpty()) 
		{
			try 
			{
				throw new kartikGirlFriendException("Kartik does not have any girl friend");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				if (kartikWife.isEmpty()) 
				{
					System.out.println("Kartik does not have wife");	
				}
				else 
				{
					System.out.println("Wife name: "+kartikWife);
				}
			}
		}

	}
}