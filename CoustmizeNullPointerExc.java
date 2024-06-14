class UserNullPointer extends RuntimeException
{
	UserNullPointer(desc)
	{
		super(desc);
	}
}
class Student
{
	String name;
	String nplace;
	Student(String name, String nplace)
	{
		this.name=name;
		this.nplace=nplace;
	}
}
class CoustmizeNullPointerExc
{
	public static void main(String[] args) 
	{
		Student obj = new Student("Ramesh","Pune");
		System.out.println(obj.name);
		Studnet obj1=null;

		if (obj1 == null) 
		{
			try
			{
				throw new UserNullPointer("Object is null");
			}	
			catch(UserNullPointer np)
			{
				np.printSatckTrace();
			}
		}
		else 
		{
			System.out.println(obj1.name);
		}	
	}
}