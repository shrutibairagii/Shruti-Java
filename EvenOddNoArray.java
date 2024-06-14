//write a java prog to store even and odd elements in two different arrays

import java.util.*;
class EvenOddNoArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size:  ");
		int size=sc.nextInt();

		System.out.print("Enter array elements: ");
		int []arr =new int [size];

		for (int i=0;i<size ;i++ ) 
		{
			arr[i]=sc.nextInt();
		}

		int evenCount=0;
		int oddCount=0;
		for (int i=0;i<size ;i++ ) 
		{
			if (arr[i]%2==0) 
			{
				evenCount++;	
			}
			else
			{
				oddCount++;
			}
		}
		int evenArr[]=new int[evenCount];
		int oddArr[]=new int [oddCount];

		int increment1 =0;
		int increment2=0;


		for (int j=0;j<size ;j++ ) 
		{
			if (arr[j]%2==0) 
			{
				evenArr[increment1++]=arr[j];			
			}		
			else 
			{
				oddArr[increment2++]=arr[j];
			}
		}	
		System.out.println("Even Array: "+Arrays.toString(evenArr));
		System.out.print("Odd Array: "+Arrays.toString(oddArr));
	}
}
