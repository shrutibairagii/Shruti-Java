class SwitchExample4
{
	public static void main(String[] args) 
	{
		byte a=1;
		switch(a+0)
		{
			case 1 : System.out.println("Hi from case1");break;
			case 2 : System.out.println("Hi from case2");break;
			case 3 : System.out.println("Hi from case3");break;
			case 4 : System.out.println("Hi from case4");break;
			case 128 : System.out.println("Hi from case5");break;
			default : System.out.println("Hi from default block");break;
		}
		
	}
}