import java .util.*;
class UserArithmaticException extends RuntimeException
{
	UserArithmaticException(String desc)
	{
		super(desc);
	}
}
class CoustmizeArithmaticException
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter num 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter num 2 : ");
		int num2 = sc.nextInt();

		if (num2 == 0) 
		{
			try
			{
				throw new UserArithmaticException("Dividing number by zero");
			}		
			catch(UserArithmaticException i)
			{
				System.out.println(i.getMessage());
			}
		}	
		else
		{
			System.out.println(num1/num2);
		}
	}
}