class SwitchExample3
{
	public static void main(String[] args) 
	{
		byte a =1;
		switch(a)
		{
			case 1 : System.out.println("Hi from case1");
			case 2 : System.out.println("Hi from case2");
			case 3 : System.out.println("Hi from case3");
			case 4 : System.out.println("Hi from case4");
			case 128 : System.out.println("Hi from case5");
			default : System.out.println("Hi from default block");
		}	
	}
}