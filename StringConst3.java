import java.util.*;
class StringConst3
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Hello");
		String str = new String(new StringBuffer("world"));
		System.out.println(str);
		String str1 = new String(sb);
		System.out.print(str1);	
	}
}