import java.util.*;
class StringConst4
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder("Hello");
		String str = new String(new StringBuilder("world"));
		//System.out.println(str);
		String str1 = new String(sb);
		System.out.println(str1);
		System.out.println(str);	
	}
}