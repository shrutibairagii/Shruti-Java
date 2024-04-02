class MethodExamplee
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		method2();
		System.out.println("Main ends");	
	}
	public static void method2()
	{
		System.out.println("method2 starts");
		method3();
		System.out.println("method2 ends");
	}
	public static void method3()
	{
		System.out.println("method3 starts");
		method4();
		System.out.println("method3 ends");
	}
	public static void method4()
	{
		System.out.println("method4 starts");
		System.out.println("method4 ends");
	}
}