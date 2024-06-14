class Human
{
	String name;
	String place;
	String gender;
	String profession;
	Human(String name,String place,String gender,String profession)
	{
		this.name=name;
		this.place=place;
		this.gender=gender;
		this.profession=profession;
	}
	public String toString()
	{
		return this.name+", "+this.place+" "+this.gender+" "+this.profession;
	}
}
class HashCodeMethodEx
{
	public static void main(String[] args) 
	{
		Human obj1 = new Human("Shruti","Pune","Female","Engineer");
		System.out.println(obj1);
	}
}