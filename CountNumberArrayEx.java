import java.util.*;
class CountNumberArrayEx
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter array size: ");
		int size=sc.nextInt();

		System.out.println("Enter array element: ");
		int []arr=new int [size]; 
		for (int i=0;i<size ;i++ ) 
		{
			arr[i]=sc.nextInt();	
		}

		System.out.println("Enter numbers to get count: ");	
		int num=sc.nextInt();

		int count=0;

		for (int i=0;i<size ;i++ ) 
		{
			if (num==arr[i]) 
			{
				count++;		
			}	
		}
		System.out.println("Count is: "+count);

	}
}