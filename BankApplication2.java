import java.util.*;
class BankInfo
{
	private String accountHolderName, address , panNumber;
	private long addharNumber;
	private int upiPin;
	private double balance;
	private long phoneNumber;

	BankInfo(String accountHolderName, String address, String panNumber, long addharNumber, int upiPin, double balance, long phoneNumber )
	{
		this.accountHolderName=accountHolderName;
		this.address=address;
		this.panNumber=panNumber;
		this.addharNumber=addharNumber;
		this.upiPin=upiPin;
		this.balance=balance;
		this.phoneNumber=phoneNumber;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public void setAccountHolderName(String updateAccountHolderName)
	{
		accountHolderName=updateAccountHolderName;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String updateAddress)
	{
		address=updateAddress;
	}
	public String getPanNumber()
	{
		return panNumber;
	} 
	public long getAddharNumber()
	{
		return addharNumber;
	}
	public int getUpiPin()
	{
		return upiPin;
	}
	public void setUpiPin(int updateUpiPin)
	{
		upiPin=updateUpiPin;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double updateBalance)
	{
		balance=updateBalance;
	}
	public long getPhoneNumber()
	{
		return phoneNumber;
	}
	public void setPhoneNumber(long updatePhoneNumber)
	{
		phoneNumber=updatePhoneNumber;
	}
}

class BankApplication2
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		//BankInfo obj =new BankInfo();
		for (; ; ) 
		{
			System.out.println();
			System.out.println("******WELCOME******");
			System.out.println();
			System.out.println("1.Create Account");
			System.out.println("2.Existing User");
			System.out.print("Enter an Option: ");
			int opt=sc.nextInt();
				switch(opt)
				{
					case 1:{
						CreateAccount.accountHolderName();
						CreateAccount.address();
						CreateAccount.panNumber();
						CreateAccount.addharNumber();
						CreateAccount.upiPin();
						CreateAccount.balance();
						CreateAccount.phoneNumber();
						System.out.println("Thank you for your details");
						break;
					}
					case 2:{
						ExistingUser.checkBalance();

					}
					
					
				}	
			}
			
		
		
	
	}
}
class CreateAccount
{
	public static void accountHolderName()
	{
		Scanner sc= new Scanner(System.in);
		BankInfo obj =new BankInfo("Shruti","pune","q23",123,1228,1222,12122);
		System.out.println("***CREATE NEW ACCOUNT***");
		System.out.print("Enter Account Holder Name: ");
		String name = sc.next();
		obj.setAccountHolderName(name);
		// System.out.println(obj.getAccountHolderName());

	}
	public static void address()
	{
		Scanner sc = new Scanner(System.in);
		BankInfo obj =new BankInfo("Shruti","pune","q23",123,1228,1222,12122);
		System.out.print("Enter Address: ");
		String add=sc.next();
		obj.setAddress(add);
	}
	public static void panNumber()
	{
		Scanner sc=new Scanner (System.in);
		BankInfo obj=new BankInfo("Shruti","pune","q23",123,1228,1222,12122);
		System.out.print("Enter Pan Number: ");
		String pan=sc.next();
		// obj.setPanNumber(pan);
	}
	public static void addharNumber( )
	{
		Scanner sc = new Scanner(System.in);
		BankInfo obj=new BankInfo("Shruti","pune","q23",123,1228,1222,12122);
		System.out.print("Enter Adhar Number: ");
		long addhar = sc.nextLong();
		
	}
	public static void upiPin()
	{
		Scanner sc = new Scanner(System.in);
		BankInfo obj=new BankInfo("Shruti","pune","q23",123,1228,1222,12122);
		System.out.print("Enter Upi Pin: ");
		int pin= sc.nextInt();
		obj.setUpiPin(pin);
		
	}
	public static void balance(String accountHolderName, String address, String panNumber, long addharNumber, int upiPin, double balance, long phoneNumber )
	{
		Scanner sc = new Scanner(System.in);
		BankInfo obj=new BankInfo(String , String,String,long, int, double,long);
		System.out.print("Enter Balance: ");
		double bal=sc.nextDouble();
		obj.setBalance(bal);
		
	}
	public static void phoneNumber()
	{
		Scanner sc = new Scanner(System.in);
		BankInfo obj=new BankInfo("Shruti","pune","q23",123,1228,1222,12122);
		System.out.print("Enter Phone Number: ");
		long phone =sc.nextLong();
		obj.setPhoneNumber(phone);
	}

}
class ExistingUser
{
	public  void checkBalance()
	{
		System.out.println();
		System.out.println("****Existing User****");
		BankInfo obj= new BankInfo("Shruti","pune","q23",123,1228,1222,12122);
		System.out.println("Deposite Balance is: "+obj.getBalance());

	}
}