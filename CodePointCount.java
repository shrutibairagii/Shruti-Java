class CodePointCount
{
	static String str=new String ("ABCDEFGH");
	public static void main(String[] args)
	{
		int indx=userCodePointCount(-7,3);
		System.out.println(str+" : "+indx);
	}
	public static int userCodePointCount(int startIndx, int endIndex)
	{
		if (startIndx>endIndex) 
		{
			throw new StringIndexOutOfBoundsException("Wrong Index: "+" ["+startIndx+","+endIndex+"]");	
		}
		return endIndex- startIndx;
	}
}