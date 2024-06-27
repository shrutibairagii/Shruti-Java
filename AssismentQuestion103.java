import java.util.*;
class AssismentQuestion103
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an array size: ");
		int size=sc.nextInt();
		System.out.print("Enter array elements: ");
		int []arr=new int[size];
		// for (int i=0;i<size ;i++ ) 
		// {
		// 	arr[i]=sc.nextInt();	
		// }
		//System.out.println(Arrays.toString(arr));
		// int indx=0;
		int count=0;
		for (int i=0;i<arr.length;i++ ) 
		{
			arr[i]=sc.nextInt();
			count=count+arr[i];					
		}	
		System.out.println(count);

	}
}