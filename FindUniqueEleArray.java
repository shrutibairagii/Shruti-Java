//find distinct character from a string
import java.util.*;
class FindUniqueEleArray
{
	public static void main(String[] args) 
	{
		String str = "abacdgguhhi";
		System.out.println(str);
		int[]arr=new int[str.length()];
		for (int i=0;i<str.length() ;i++ ) 
		{
			arr[i]=str.charAt(i);	
		}
		Arrays.stream(arr).distinct().forEach(ele->System.out.print((char)ele));
	}
}