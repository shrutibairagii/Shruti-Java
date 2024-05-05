class Movie
{
	String type;
	String relesedDate;
	String hero;
	String heroin;
	String director;

	Movie(String type, String relesedDate, String hero, String heroin, String director)
	{
		super();
		this.type=type;
		this.relesedDate=relesedDate;
		this.hero=hero;
		this.heroin=heroin;
		this.director=director;
	}
	public void displayMovie()
	{
		System.out.println("*****MOVIE DETAILS*****");
		System.out.println("Type of Movie: "+type);
		System.out.println("Relesed Date of Movie: "+relesedDate);
		System.out.println("Hero: "+hero);
		System.out.println("Heroin: "+heroin);
		System.out.println("Movie Director: "+director);
	}

}
class MsDhoniTheUntoldStroy extends Movie
{
	String name;
	boolean superHit;
	MsDhoniTheUntoldStroy(String name,boolean superHit, String type, String relesedDate, String hero, String heroin, String director )
	{
		super(type,relesedDate,hero,heroin,director);
		this.name=name;
		this.superHit=superHit;
	}
	public void displayMsDhoniTheUntoldStory()
	{
		System.out.println("*****MS Dhoni: The Untold Story*****");
		System.out.println("Movie Name: "+name);
		System.out.println("Super Hit or Not: "+superHit);
	}
}
class SingleLevelInheEx2
{
	public static void main(String[] args) 
	{
		MsDhoniTheUntoldStory obj=new MsDhoniTheUntoldStory("MS Dhoni: The Untold Story",true,"Biographical,Sport Drama","September 30 2016","Sushant Singh ","Disha Patani","Neeraj Pandey");
		obj.displayMovie();
		obj.displayMsDhoniTheUntoldStory();
	}
}