import java.util.*;
class AssismentQuestion
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int [] arr={0,1,2,3,0,1,2,3,0,1,2,3};
		int startDay=3;
		int endDay=5;
		int count=0;
		for (int i=0;i<arr.length;i++ ) 
		{
			if (arr<=3||arr>=5) 
			{
				count++;	
			}	
		}
		System.out.println(count);

	}
}