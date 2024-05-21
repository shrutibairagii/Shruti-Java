class ProgramingLanguage
{
	String type;
	String level;
	int inventedYear;
	String founderName;
	double latestVersion;
	String extension;

	ProgramingLanguage(String type, String level,int inventedYear, String founderName, double latestVersion,String extension)
	{
		super();
		this.type=type;
		this.level=level;
		this.inventedYear=inventedYear;
		this.founderName=founderName;
		this.latestVersion=latestVersion;
		this.extension=extension;
	}
	public void displayPrograminLanguage()
	{
		System.out.println("*****Programing Language******");
		System.out.println("Type: "+type);
		System.out.println("Level: "+level);
		System.out.println("Invented Year: "+inventedYear);
		System.out.println("Founder Name: "+founderName);
		System.out.println("Latest Version: "+latestVersion);
		System.out.println("Extension: "+extension);		
	}
}
class Java extends ProgramingLanguage
{
	// String[]features;
	boolean platformIndependent;

	Java( boolean platformIndependent,String type, String level,int inventedYear, String founderName, double latestVersion,String extension)
	{
		super(type,level,inventedYear,founderName,latestVersion,extension);
		// this.features=features;
		this.platformIndependent=platformIndependent;
	}
	public void displayJava()
	{
		System.out.println("*****JAVA*****");
		System.out.println("Is it platform independent: "+this.platformIndependent);
		// System.out.println("Features of Java: "+ Arrays.toString(this.features));
	}
}
class SingleLevelInheEx1
{
	public static void main(String[] args) 
	{
	// String[]features={"1.MultiThreaded","2.Secure and Robust","3.Portable","4.Dynamic"};
	Java obj =new Java(true,"Object Oriented","High Level",1991,"James Gosling",1.22,".java");
	obj.displayPrograminLanguage();
	obj.displayJava();
	}
}
