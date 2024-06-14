class Parent
{
	String str = "Hello Parent";
	Parent()
	{
		super();
		System.out.println("Hello from parent constructor");
	}
	void m1()
	{
		System.out.println("M1() Parent");
	}
	void m2()
	{
		System.out.println("M2() Parent");
	}
}
class Child extends Parent
{
	String str = "Hello Child";
	Child()
	{
		super();
		System.out.println("Hello from child constructor");
	}
	void m3()
	{
		System.out.println(str);
		System.out.println(super.str);
		System.out.println("M3()");
		super.m1();
		super.m2();
	}
}
class SuperKeywordEx
{
	public static void main(String[] args) 
	{
		Child obj=new Child();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}