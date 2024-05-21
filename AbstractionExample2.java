abstract class Parent
{
	abstract void m1();
	abstract void m2();
	public  void m3()
	{
		System.out.println("Parent");
	}

}
abstract class Child1 extends Parent
{
	void m2()
	{
		System.out.println("M2 implementation from child1");
	}
	abstract void m4();
}
class SubChild extends Child1
{
	void m1()
	{
		System.out.println("m1 implementation from subchild ");
	}
	void m4()
	{
		System.out.println("m4 implementation from subchild");
	}
}
class Child2 extends Parent
{
	void m1()
	{
		System.out.println("m1 implementation from child2");
	}
	void m2()
	{
		System.out.println("m2 implementation from child2");
	}
	 void m5()
	{
		System.out.println("m5() implementation from child2");
	}
}
class AbstractionExample2
{
	public static void main(String[] args) 
	{
		SubChild obj = new SubChild();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		Child2 obj1 = new Child2();
		obj1.m1();
		obj1.m2();
		obj1.m3();
		obj1.m5();
	}
}