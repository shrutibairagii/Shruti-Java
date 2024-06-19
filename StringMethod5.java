//wajp to get the ascii value all the character from the string dynamically
import java.util.*;
class StringMethod5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a String: ");
		String name=sc.nextLine();
		
		for (int i=0;i<name.length() ;i++ ) 
		{
			char name2=name.charAt(i);
			int ascii=name2;//widening
			int ascii1=name.codePointAt(i);
			System.out.println("ASCII Value of String is:"+ascii1+" ");	
		}
	}
}