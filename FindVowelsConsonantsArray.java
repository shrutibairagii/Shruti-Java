//write a java program to find the count of vowels and consonants in thr given array
/*
steps-
1.create an array of char datatype (dynamically) create 2 temp variable(v count,c count)
2.compare each position in an array with vowels(a,e,i,o,u)
3.if it is vowel,increament the value of vowel
*/
import java.util.*;
class FindVowelsConsonantsArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size=sc.nextInt();

		System.out.println("Enter arrays element: ");
		char[]arr=new char [size];

		//insert

		for (int i=0;i<size ;i++ ) 
		{
			arr[i]=sc.next().charAt(0);
		}
		int vCount=0;
		int cCount=0;
		for(int i=0;i<size;i++)
		{
			if (arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U') 
			{
				vCount++;	
			}
			else 
			{
				cCount++;
			}
		}
		System.out.println("Vowel Count: "+vCount);
		System.out.println("Consonant Count: "+cCount);
	}
}