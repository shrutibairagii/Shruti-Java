//WAJP to merge two arrays in one single array

import java.util.*;
class MergeTwoArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter 1st array size: ");
		int size1 = sc.nextInt();

		System.out.print("Enter 2nd array size: ");
		int size2=sc.nextInt();

		System.out.println("this is first array: ");
		int [] arr1=new int [size1];
		for (int i=0;i<size1 ;i++ ) 
		{
			arr1[i]=sc.nextInt();	
		}
		System.out.println("this is second array: ");
		int[]arr2=new int[size2];
		for (int i=0;i<size2 ;i++ ) 
		{
			arr2[i]=sc.nextInt();	
		}
		int mergeArraySize=size1+size2;
		int [] mergeArray = new int [mergeArraySize];

		for (int i=0;i<arr1.length ;i++ ) 
		{
				mergeArray[i]=arr1[i];	
		}	
		for (int i=0;i<size2 ; i++) 
		{
			mergeArray[arr1.length+i]=arr2[i];	
		}
		System.out.println("First Array: "+Arrays.toString(arr1));
		System.out.println("Seconf Array: "+Arrays.toString(arr2));
		System.out.println(Arrays.toString(mergeArray));
	}
}