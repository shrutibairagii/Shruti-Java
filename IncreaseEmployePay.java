/* write a program that increases the pay of employee by 3% if his monthly target score is greater than 90
othewise increase pay by 1%

*/

import java.util.Scanner;
class IncreaseEmployePay
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter th Salary: ");
		int salary = sc.nextInt();
		System.out.print("Enter Score: ");
		int score = sc.nextInt();

		
		if (score>90) 
		{
			System.out.print("Increases the pay by 3%: "+salary*0.03); 	
		} 
		else
		{
			System.out.print("Increases the pay by 1%: "+salary*0.01);
		} 

			
		
	}
}