import java.util.*;
class AmdocsAssisment
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter a String: ");
		String str=sc.next();
		int len=str.length();
		String firsthalf=((new StringBuffer(str.substring(0,(len/2)))).reverse()).toString();
		String secondhalf=((new StringBuffer(str.substring((len/2),len))).reverse()).toString();
		System.out.println(firsthalf+" : "+secondhalf);

		String op="";
		for (int i=0;i<secondhalf.length() ;i++ ) 
		{
			if (i<firsthalf.length()) 
			{
				op=op+firsthalf.charAt(i);		
			}
			op=op+secondhalf.charAt(i);	
		}
		System.out.println(op);
	}
}