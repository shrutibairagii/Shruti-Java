
import java.util.Scanner;

class Persentage
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Persentage : ");
		double persentage= sc.nextDouble();

		if (persentage<=35) 
		{
			System.out.println("Student is fail");		
		}	
		else if (persentage<60) 
		{
			System.out.println("Student get Second Class with B Grade");	
		}
		else if (persentage<75) 
		{
			System.out.println("Student get First Class with A Grade");	
		}
		else if (persentage<90) 
		{
			System.out.println("Student get Distinction with A+ Grade");	
		}
		else if (persentage<=100) 
		{
			System.out.println("Student get First Class with Distinction with O Grade");	
		}
		else
		{
			System.out.println("Ivalid");
		}
		System.out.println(persentage+"%");
	}
}