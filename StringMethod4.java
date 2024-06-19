//wajp to convert first letter into captial and the rest into lower case
import java.util.*;
class StringMethod4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name=sc.nextLine();
		String firstLetter=name.substring(0,1).toUpperCase();
		// //System.out.println(name2);
		// String con=name.concat().name2;
		// System.out.println(name+name2);
		String remainingLetters=name.substring(1,name.length()).toLowerCase();
		String merge=firstLetter.concat(remainingLetters);
		System.out.println(merge);
	}
}