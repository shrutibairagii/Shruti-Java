//wajp to find the sum of all the indices/index
import java.util.*;
class SumAllIndexArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter array: ");
		int num=sc.nextInt();
		int []arr=new int[num];
		int sum=0;
		for (int i=0;i<arr.length ;i++ ) 
		{
			sum+=arr[i];


		}
		System.out.println(sum);

	}
}