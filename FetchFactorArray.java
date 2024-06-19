//wajp to fetch all the factors in an array
import java.util.*;
class FetchFactorArray
{
	static int[] factoreArray;
	static int factorCount=0;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num= sc.nextInt();
		for (int i=1;i<=num ;i++ ) 
		{
			if (num%i==0) 
			{
				factorCount++;	
			}	
		}
		factoreArray=new int[factorCount];
		int itt1=0;
		for (int j=1;j<=num ; j++) 
		{
			if (num%j==0) 
			{
				factoreArray[itt1++]=j;		
			}	
		}
		System.out.println(Arrays.toString(factoreArray));
	}
}