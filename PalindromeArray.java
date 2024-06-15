/*wajp to print palindrome
steps
1. create an array of char datatype
2.reverse the array and store it in reversed array
3.compare both arrays using array equals()
*/
import java.util.*;
class PalindromeArray
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter array size: ");//4
		int size=sc.nextInt();

		System.out.println("Enter arrays element: ");//1 2 2 1
		char[]arr=new char [size];

		//insert

		for (int i=0;i<size;i++ ) 
		{
			arr[i]=sc.next().charAt(0);	
		}
		char[]reversedArray=new char[size];

		int temp=0;
		for (int i=arr.length-1;i>=0 ;i-- ) 
		{
			reversedArray[temp]=arr[i];
			temp++;				
		}
		if (Arrays.equals(arr,reversedArray)) 
		{
			System.out.println("It is palindrome");
		}
		else 
		{
			System.out.println("Not palindrome");
		}
	}
}