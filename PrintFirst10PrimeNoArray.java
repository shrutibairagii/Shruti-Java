//wajp to store first 10 prime no in a new array
import java.util.*;
class PrintFirst10PrimeNoArray
{
	public static void main(String[] args) 
	{
		// int[]arr={2,8,5,4,7,9,13,14,15,16,17};
		int count=1;
		for (int i=0;i<arr.length ;i++ ) //i=0;0<11
		{
			int count=0;
			for(int j=1;j<=arr[i];j++) //j=1
			{
				if (arr[i]%j==0) //2%1==0
					{
						count++; //1
					}	
			}
			if (count==2) 
			{
				System.out.println(arr[i]+" ");	//1
			}
		}	
	}
}