/* write program that reads a celsius degree in a double value from the console, the converts it to fahrenheit
and displays the result
the formula conversion is as follows
fahrenheit = (9/5)*celsius+32
9.0/5=1.8
9/5=1

*/
class CelsiusToFahrenheit
{
	public static void main(String[] args)
	{
		double celsius = 43;
		double fahrenheit = (1.8)*celsius+32;
		System.out.println("Conversion of Celsius to Fahrenheit - "+fahrenheit);
	}
}