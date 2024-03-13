class IfElseStatementExample4
{
	public static void main(String[] args) 
	{
		System.out.println("Execution Starts");

		int a = 100;
		if (false) 
			a=10;
			System.out.println("Hi from if block");		
		else
			System.out.println("Hello from else block");
			
		System.out.println("Execution Ends");
	}
}