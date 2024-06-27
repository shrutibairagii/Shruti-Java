import java.util.Scanner;
class ImplToUpperCase
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String: ");
		str=sc.nextLine();
		String op =userToUpperCase();
		System.out.println(str+" : "+op);	
	}
	public static String userToUpperCase()
	{
		String nstr="";
		for (int i=0;i<str.length() ;i++ ) 
		{
			char ch =str.charAt(i);
			if (ch>='a'&&ch<='z') 
			{
				nstr=nstr+(char)(ch-32);		
			}	
			else
			{
				nstr=nstr+ch;
			}
		}
	}
}