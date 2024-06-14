class Student 
{
	String sname;
	String place;
	String branch;
	int yop;

	Student(String sname,String place,String branch , int yop)
	{
		this.sname=sname;
		this.place=place;
		this.branch=branch;
		this.yop=yop;
	}
	public boolean equals(Object obj)
	{
		Student obj2 = (Student)obj;
		if((this.sname==obj2.sname)&&(this.place==obj2.place)&&(this.branch==obj2.branch)&&(this.yop==obj2.yop))
			return true;
		else 
			return false;
	}
}
class EqualsMethodEx
{
	public static void main(String[] args) 
	{
		// Student obj1 = new Student("Ramesh","Pune","CS",2023);
		// Student obj2 = new Student("Ramesh","pune","CS",2023);
		Student obj1 = new Student("Ramesh","Pune","CS",2023);
		Student obj2 = new Student("Ramesh","Pune","CS",2023);
		System.out.println(obj1.equals(obj2));	
	}
} 