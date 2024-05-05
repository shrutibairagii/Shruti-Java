import java.util.Scanner;

class FactorsRecursive
{
	static int num;
	static int i=1;
	static int fact=0;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		factors();	
	}
	// public static void factors()
	// {
	// 	if (num%i==0) 
	// 	{
	// 		System.out.print(i+" ");	
	// 	}
	// 	i++;

	//  	if (num<=fact) 
	//  	{
	//  		return;
	//  	}
	// 	factors();

	//  }
	
}