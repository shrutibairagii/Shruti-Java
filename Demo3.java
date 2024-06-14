class Parent
{
	final void m1()
	{
		System.out.println("Hii");
	}
}
class Child extends Parent
{
	public void m2()
	{
		System.out.println("Hello");
	} 
}
class Demo3
{
	public static void main(String[] args) 
	{
		Parent ch=new Child();
		ch.m1();
		Child ch1=(Child)ch;

		ch1.m1();

	}
}