//find sum of all elements at even indices 
import java.util.*;
class SumEvenInxEleArray
{
	public static void main(String[] args) 
	{
		
		int []arr={1,2,3,4,5,6};
		int sumEven=0;
		for (int i=0;i<arr.length;i++ ) 
		{
			if (i%2==0) 
			{
				sumEven+=arr[i];			
			} 
		}	
		System.out.println(sumEven);
	}
}