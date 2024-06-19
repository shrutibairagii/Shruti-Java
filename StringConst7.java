class StringConst7
{
	public static void main(String[] args) 
	{
			char [] ch={'R','A','M','E','S','H'};
			byte []b = {66,67,68,69,70};

			String str=new String(b,1,4);
			System.out.println(str);

			String str2=new String(b);
			System.out.println(str2);

			String str3=new String(ch,0,3);
			System.out.println(str3);

			String str4=new String(ch);
			System.out.println(str4);	
	}
}