class ForLoopLowerCase
{
	public static void main(String[] args) 
	{
		for (char ch='a';ch<='z' ;ch++ ) 
		{
			System.out.print(ch+" ");
		}
		System.out.println("************************");
		for (char ch='z';ch>='a' ;ch-- ) 
		{
			System.out.print(ch+" ");
		}	
	}
}