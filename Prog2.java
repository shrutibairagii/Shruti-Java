import java.util.Scanner;
class Prog2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hour: ");
		int num=sc.nextInt();
		if ((num>=5)&&(num<=11)) 
		{
			System.out.println("Good Morning");	
		}
		else if ((num>=12)&&(num<=16)) 
		{
			System.out.println("Good Afternoon");	
		}
		else if ((num>=17)&&(num<=20)) 
		{
			System.out.println("Good Evening");	
		}
		else if ((num>=21)&&(num<=24)||(num>=0)&&(num<=4)) 
		{
			System.out.println("Good Night");
		}
		else
		{
			System.out.println("Invali Time");
		}

	}
}