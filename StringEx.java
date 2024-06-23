class StringEx
{
	public static void main(String[] args) 
	{
		String name1=new String("java");
		String name2=new String("java");
		System.out.println(name1==name2);// check refrence or address in non primitive datatype


		StringBuffer sb1=new StringBuffer("python");
		StringBuffer sb2=new StringBuffer("python");
		System.out.println(sb1==sb2);	// check refrence or address in non primitive datatype

		int a=4;
		int b=4;//check data in primitive datatype
		System.out.println(a==b);
	}
}