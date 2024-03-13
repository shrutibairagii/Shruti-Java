/* Average speed in miles
Assume a runner run 14 kilometer in 45 minutes and 30 secomds. Write a program that displayes the average speed in miles per hour

1 mile = 1.6 kilometers

*/


class AverageSpeedInMiles
{
	public static void main(String [] args)
	{
		double kilometers = 14;
		double miles = kilometers/1.6;
		double time = 45.5/60;
		double avgSpeed = miles / time;

		System.out.println("Average Speed in Miles Per Hour - "+avgSpeed);

	}
}	