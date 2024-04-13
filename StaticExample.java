class StaticExample
{
	public static void main(String[] args) 
	{
		m1();
		StaticExample.m1();
		m2("m2()");
		StaticExample.m2("m2()");	
	}
	public static void m1()
	{
		System.out.println("Hello from m1()");
	}
	public static void m2(String name)
	{
		System.out.println("Hello from"+name);
	}
}