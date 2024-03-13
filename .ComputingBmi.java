import java.util.Scanner;

class ComputingBmi
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a weight in pounds: ");
		double weight = sc.nextDouble();
		System.out.print("Enter a height in inches: ");
		double height = sc.nextDouble();

		double weightInKilograms = weight*0.45359237;
		double hrightInKilograms = hright*0.0254;
		System.out.print(weightInKilograms/(hrightInKilograms*hrightInKilograms));
	}
}