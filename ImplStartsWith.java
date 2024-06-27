import java.util.Scanner;
class ImplStartsWith
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		str=sc.nextLine();

		System.out.print("Enter String to check: ");
		String str1=sc.next();
		System.out.print("Enter a index :");
		int searchIndx=sc.nextInt();
		boolean op =userStartsWith(str1,searchIndx);
		System.out.println(str+" : "+op);
	}
	public static boolean userStartsWith(String str1)
	{
		boolean flag=true;
		for (int i=0;i<str1.length() ;i++ ) 
		{
			char ch=str1.charAt(i);
			if (ch!=str.charAt(i)) 
			{
				flag =false;
				break;		
			}	
		}
		return flag;
	}
	public static boolean userStartsWith(String str1,int startIndex)
	{
		if (startIndex<0 || startIndex>str.length()-1) 
		{
			throw new StringIndexOutOfBoundsException("WRONG INDEX: "+startIndex);
		}
		boolean flag=true;
		for (int i=startIndex;i<str1.length() ;i++ ) 
		{
			char ch =str1.charAt(i);
			if (ch!=str.charAt(i)) 
			{
				flag=false;
				break;	
			}	
		}
		return flag;
	}
}