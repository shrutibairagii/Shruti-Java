import java.util.Scanner;
class Seasons
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Month: ");
		String month = sc.next().toUpperCase();
		switch(month)	
		{
			case "OCT":
			case "NOV":
			case "DEC":
			case "JAN":System.out.println(month+" it's Winter");break;
			case "FEB": 
			case "MAR":
			case "APR":
			case "MAY":System.out.println(month+" it's Summer");break;
			case "JUN":
			case "JUL":
			case "AUG":
			case "SEP":System.out.println(month+" it's Rainy");break;
			default:System.out.println("Invalid Input");	

		}	
	}
}