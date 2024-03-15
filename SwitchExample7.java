class SwitchExample7
{
	public static void main(String[] args) 
	{
		byte a=1;
		switch(a+1)
		{
			case 1 : System.out.println("Hi from case1");break;
			case 'b' : System.out.println("Hi from case2");break;
			case 'c' : System.out.println("Hi from case3");break;
			default : System.out.println("Hi from default block");break;
		}	
	}
}