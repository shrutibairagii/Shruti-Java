/*
write a program that reada number in feet, converts it to meters and displays the result. one foot is 0.305 meter.
*/
import java.util.Scanner;
class FeetIntoMeter
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number in Feet :  ");
		double feet = sc.nextDouble();
		double meters = feet*0.305;
		System.out.print("Covert the feet "+feet+"into meters is : "+meters);
	}
}