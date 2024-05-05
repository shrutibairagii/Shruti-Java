import java.util.Scanner;

class PrimeNumberRecursion
{
	static int num=7;
	static int i=2;
	static boolean flag=true;

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		num=sc.nextInt();
		prime();
		System.out.println(flag?"Prime":"Not Prime");	
	}
	public static void prime()
	{
		
		if (i==num)
		{ 
		return;
		}

		if (num%i==0) 
		{
			flag=false;
			return;		
		}
		i++;	
		prime();

	}

}