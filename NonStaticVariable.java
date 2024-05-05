class NonStaticVariable
{
	String str1 =  "hi I am from demo7 class";
	public static void main(String[] args) 
	{
		System.out.println("Hello from main() ");
		NonStaticVariable1 obj = new NonStaticVariable1();
		obj.m1();

	}
}
class NonStaticVariable1
{
	static NonStaticVariable obj = new NonStaticVariable();
	void m1()
	{
		System.out.println("Hi from m1()");
		System.out.println(obj.str1);
		m2();
	}
	void m2()
	{
		System.out.println("Hi from m2()");
		System.out.println(obj.str1);
		m3();
	}
	static void m3()
	{
		System.out.println("Hi from m3() static");
		System.out.println(obj.str1);
	}
}