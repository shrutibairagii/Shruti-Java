// class MultipleClassesExample
// {
// 	public static void main(String[] args) 
// 	{
// 			MultipleClassesExample1.m1();
// 			MultipleClassesExample2.m2();
// 	}
// }
// class MultipleClassesExample1
// {
// 	public static void m1()
// 	{
// 		System.out.println("Hi from MultipleClassesExample1 m1()");
// 	}
// }
// class MultipleClassesExample2
// {
// 	public static void m2()
// 	{
// 		System.out.println("Hi from MultipleClassesExample2 main()");
// 	}
// }

//----------------------------------------------------------------------------------------------------
class demo
{
	public static void main(String[] args) 
	{
		System.out.println("hi from demo");
		demo2();
		demo2.demo3();
	}
	public static void demo2()
	{
		System.out.println("Hi from demo2");
	}
}
class demo2
{
	public static void demo3()
	{
		System.out.println("hi from demo3");
	}
}