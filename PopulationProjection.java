/* write a program to disply the population for each of the next five years.
  Assume the current population 312,032,486 and one year has 365 days.
 
  one birth every 7 seconds
  one death every 13 seconds
  one new immigrant every 45 seconds
*/

class PopulationProjection
{
	public static void main(String [] args)
	{
		long currentPopulation = 312032486;
		long secondsInYear = 365*24*60*60 ;      //year*hr per day*min in hr*sec in hr
		long birthPerYear = secondsInYear/7;
		long deathPerYear = secondsInYear/13;
		long immigrantPerYear = secondsInYear/45;
		long newPopulation = currentPopulation+((birthPerYear-deathPerYear+immigrantPerYear)*5);
		System.out.println("New Population After Five Years - "+newPopulation);
	}
}