//wajp to find the factors of a number and store all the factors in an array
//find sum of all elements at even indices 
//wajp to find the sum of all the indices/index
//wajp to store first 10 prime no in a new array
//wajp to store the fibonacii series of any terms in array
//wajp to fetch all the factors in an array
import java.util.*;
class FactorArray
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
		int[]arr=factoreArray;
		System.out.println(Arrays.toString(arr));
	}
}