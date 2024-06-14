//Write a java program to get a sum and product from the given array

import java.util.*;
class SumAndProductArray
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Array Size: ");
		int size=sc.nextInt();
		System.out.print("Enter array elemnets: ");
		int[]arr=new int[size];

		int sum=0;
		int prod=1;

		// inserting array wlwment dynamically
		for (int i=0;i<size ;i++ ) 
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			prod=prod*arr[i];		
		}	
		System.out.println("Sum: "+sum);
		System.out.println("Product: "+prod);
	}
}