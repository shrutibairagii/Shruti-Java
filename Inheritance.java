class Parent
{
	String str="Hi from parent class";
	void m1()
	{
		System.out.println("Hello from parent m1()");
	}
	static void m3()
	{
		System.out.println("Hello from m3() static parent");
	}	
}
class Child extends Parent
{
	String str="Hi from child class";
	void m2()
	{
		System.out.println("Hello from child class m2()");
		m1();
		m3();
		System.out.println(str);
		System.out.println(super.str);
	}
	static void m4()
	{
		System.out.println("Hello from m4() static child");
	}
}
class Inheritance
{
	public static void main(String[] args) 
	{
		Child obj=new Child();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		System.out.println(obj.str);
		
	}
}