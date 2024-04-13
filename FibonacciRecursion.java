class FibonacciRecursion
{
	static int num1=0;
	static int num2=1;
	static int op=0;
	public static void main(String[] args) 
	{
		fibonacci();	
	}
	public static void fibonacci()
	{
		// for (int i=1;i<=10 ;i++ ) 
		// {
		// 	int op=num1+num2;
		// 	System.out.print(op+" ");
		// 	num1=num2;
		// 	num2=op;	
		// }

		int op=num1+num2;
		num1=num2;
		num2=op;
		System.out.print(op+" ");
		
		if (op>=90) 
		{
			return;	
		}
				
		fibonacci();

	}
}