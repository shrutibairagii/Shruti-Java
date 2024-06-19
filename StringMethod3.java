//Program batch
class StringMethod3
{
	public static void main(String[] args) 
	{
		String name1="kartik";
		String name2="kanchana";
		String name3 ="komala";
		String name4="";

		String convertedCaps=name1.toUpperCase();
		System.out.println(convertedCaps); // KARTIK

		int length =name3.length();
		System.out.println(length);//6

		char singleCharacter=name1.charAt(2);
		System.out.println(singleCharacter);//r

		String mergedNames= name1.concat(name2);
		System.out.println(mergedNames);//kartikkanchan

		String multipleChars= name2.substring(6,8); //op- na syantax-substring(startIndex,lastLength)
		System.out.println(multipleChars);

		String singleCharacter2=name3.substring(0,1);//op-k syantax-substring(startIndex,lastLength)
		System.out.println(singleCharacter2);

		String multipleChars2= name2.substring(5,8); //op-ana syantax-substring(startIndex,lastLength)
		System.out.println(multipleChars2);

		boolean emptyOrNot= name4.isEmpty();
		System.out.println(emptyOrNot);//true

	}
}