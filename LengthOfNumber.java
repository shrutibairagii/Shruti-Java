import java.util.*;

class LengthOfNumber
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int	length=0;

		for (int i=num;i>0 ;i/=10 ) 
		{
			length++;	
		}
		System.out.println("The length is: "+length);
	}
}