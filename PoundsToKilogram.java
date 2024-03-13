/*
Write a program that converts pounds into kilograms.The program promptd the user to enter a numberin pounds,
converts it ti kilograms, and displays the result. one pound is 0.454 kilograms.

*/
import java.util.Scanner;
class PoundsToKilogram
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number in pound : ");
		double pound= sc.nextDouble();
		double kilograms= pound*0.454;
		System.out.print("Convertion of"+pound+"pounds is"+kilograms+"kg");
	}
}