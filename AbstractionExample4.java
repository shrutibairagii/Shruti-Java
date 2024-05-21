abstract class RBI
{
	RBI()
	{
		super();
	}
	abstract void rateOfInterest();
	abstract void withdrawLimit();
	abstract void depositLimit();
}
abstract class SBI extends RBI
{
	String userName;
	String accountType;
	SBI(String userName, String accountType)
	{
		super();
		this.userName=userName;
		this.accountType=accountType;
	}
	void displayDetails()
	{
		System.out.println("******SBI DETAILS******");
		System.out.println("Account holder name: "+this.userName);
		System.out.println("Account type: "+this.accountType);
	}
}
class Saving extends SBI
{
	Saving(String userName,String accountType)
	{
		super(userName,accountType);
		this.userName=userName;
		this.accountType=accountType;
	}

	void rateOfInterest()
	{
		System.out.println("Rate of Interest: "+8.5+"%");
	}
	void withdrawLimit()
	{
		System.out.println("Withdraw limit: "+50000);
	}
	void depositLimit()
	{
		System.out.println("Deposite Limit: "+80000);
	}
}
class Current extends SBI
{
	Current(String userName,String accountType)
	{
		super(userName,accountType);
		this.userName=userName;
		this.accountType=accountType;
	}
	
	void rateOfInterest()
	{
		System.out.println("Rate of Interest: "+7.5+"%");
	}
	void withdrawLimit()
	{
		System.out.println("Withdraw limit: "+500000);
	}
	void depositLimit()
	{
		System.out.println("Deposite Limit: "+800000);
	}
}
class AbstractionExample4
{

	public static void main(String[] args) 
	{
		Saving obj=new Saving("Suresh","Saving");
		obj.displayDetails();
		obj.rateOfInterest();
		obj.withdrawLimit();
		obj.depositLimit();

		Current obj1=new Current("Ramesh","Current");
		obj1.displayDetails();
		obj1.rateOfInterest();
		obj1.withdrawLimit();
		obj1.depositLimit();

	}
}