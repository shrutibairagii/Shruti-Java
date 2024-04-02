class EvenOddMethod
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=20 ;i++ ) 
		{
			evenodd(i);		
		}	
	}
	public static void evenodd(int num)
	{
		if (num%2==0) 
		{
			System.out.println(num+" even");	
		}
		else
		{
			System.out.println(num+" odd");
		}	
	}
}