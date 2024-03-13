/*
computing BMI
body mass index(BIM)is a measure of health on weight. it can be calculate by taking your weight in kilogram and
dividing by the square of your height in meters. write a program that prompts the user to enter a weight in pounds
and weight in pounds and height in inches and display the BMI.

note that one pound is 0.45359237 kilograms,and one inch is 0.0254meters
*/


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
		double hrightInKilograms = height*0.0254;
		System.out.print("The BMI(Body Mass Index) is"+weightInKilograms/(hrightInKilograms*hrightInKilograms));
	}
}