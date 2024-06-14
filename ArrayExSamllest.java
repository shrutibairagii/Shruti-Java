import java.util.*;

class ArrayExSamllest
{
	public static void main(String[] args) 
	{
		int arr[]={2,3,5,7,9,1};
		int min=arr[0];
		for(int i=1; i<=arr.length-1; i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
	    }	
	    System.out.println(min);
	}
}