class Account
{
	String accountHolderName;
	int accountNumber;
	double transactionLimit;
	double currentBalance;
	String interestRate;
	double minimumBalance;

	Account(String accountHolderName,int accountNumber,double transactionLimit,double currentBalance,String interestRate,double minimumBalance)
	{
		super();
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		this.transactionLimit=transactionLimit;
		this.currentBalance=currentBalance;
		this.interestRate=interestRate;
		this.minimumBalance=minimumBalance;
	}
	public void displayAccount()
	{
		System.out.println("****ACCOUNT DETAILS*****");
		System.out.println("Account holder name: "+this.accountHolderName);
		System.out.println("Account number: "+this.accountNumber);
		System.out.println("Tramsaction limit: "+this.transactionLimit);
		System.out.println("Current Balance: "+this.currentBalance);
		System.out.println("Interest Rate: "+this.interestRate);
		System.out.println("Minimum balance: "+this.minimumBalance);
	}


}
class SavingAccount extends Account
{
	 String purpose;
	 String suitability;

	 SavingAccount(String purpose,String suitability,String accountHolderName,int accountNumber,double transactionLimit,double currentBalance,String interestRate,double minimumBalance)
	 {
	 	super(accountHolderName,accountNumber,transactionLimit,currentBalance,interestRate,minimumBalance);
	 	this.purpose=purpose;
	 	this.suitability=suitability;
	 } 
	 public void displaySavingAccount()
	 {
	 	System.out.println("*****SAVING ACCOUNT*****");
	 	System.out.println("Account purpose: "+this.purpose);
	 	System.out.println("Account Suaitability: "+this.suitability);
	 	// SavingAccount obj = new SavingAccount("Saving Money","Student","Shruti",123456789,50000,80000,"20%",500);

	 }
}
class CurrentAccount extends Account
{
	String purpose;
	String suitability;

	CurrentAccount(String purpose,String suitability,String accountHolderName,int accountNumber,double transactionLimit,double currentBalance,String interestRate,double minimumBalance)
	{
		super(accountHolderName,accountNumber,transactionLimit,currentBalance,interestRate,minimumBalance);
		this.purpose=purpose;
		this.suitability=suitability;
	}
	public void displayCurrentAccount()
	{
		System.out.println("****CURRENT ACCOUNT******");
		System.out.println("Account purpose: "+this.purpose);
		System.out.println("Account Suaitability: "+this.suitability);
	}
}
class SalaryAccount extends Account
{
	String purpose;
	String suitability;

	SalaryAccount(String purpose,String suitability,String accountHolderName,int accountNumber,double transactionLimit,double currentBalance,String interestRate,double minimumBalance)
	{
		super(accountHolderName,accountNumber,transactionLimit,currentBalance,interestRate,minimumBalance);
		this.purpose=purpose;
		this.suitability=suitability;
	}
	public void displaySalaryAccoynt()
	{
		System.out.println("*****SALARY ACCOUNT*****");
		System.out.println("Account purpose: "+this.purpose);
		System.out.println("Account Suaitability: "+this.suitability);
	}
}



class AccountMultliLevelInhe
{
	public static void main(String[] args) 
	{
		SavingAccount obj = new SavingAccount("Saving Money","Student","Shruti",123456789,50000,80000,"20%",500);
		// obj.displayAccount();
		obj.displaySavingAccount();
		CurrentAccount obj1 =new CurrentAccount("Business purpose,Company","Business transaction,Large corporation","Shrutii",123123123,0,5000000,"30%",1000);
		obj1.displayCurrentAccount();
		SalaryAccount obj2=new SalaryAccount("Created by Employers","Employee Salary","Shruti",12341234,0,60000000,"30%",0);
		obj2.displaySalaryAccoynt();


	}
}