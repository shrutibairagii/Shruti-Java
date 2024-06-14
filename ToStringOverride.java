import java.util.*;
class Student
{
	String name;
	String place;
	String branch;
	Student(String name,String place,String branch)
	{
		this.name=name;
		this.place=place;
		this.branch=branch;
	}
	@Override 
	public String toString()
	{
		return "Hi my name is "+this.name+" and I belongs to "+this.place+" and I have completed my BE in "+this.branch;
	}
}
class ToStringOverride
{
	public static void main(String[] args) 
	{
		Student obj = new Student("Ramesh","Pune","CS");
		System.out.println(obj);
		Student obj1=new Student("Suresh","Mumbai","Mech");
		System.out.println(obj1);
	}
}