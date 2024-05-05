import java.util.Scanner;

class BankApplicationEncap
{
	private String acHolderName;
	private String address;
	private long aadharNumber;
	private String panNumaber;
	private int upiPin;
	private double balance;
	private long phoneNumber;

	public BankApplicationEncap(String acHolderName,String address,long aadharNumber,String panNumaber,int upiPin,double bal,long phoneNumber)
	{
		this.acHolderName=acHolderName;
		this.address=address;
		this.aadharNumber=aadharNumber;
		this.panNumaber=panNumaber;
		this.upiPin=upiPin;
		this.balance=balance;
		this.phoneNumber=phoneNumber;
	}	
	public void deposite(double amount , int enteredPin)
	{
		if (upiPin==enteredPin) 
		{
			balance=balance+amount;
			System.out.println(amount+"deposite successfully");	
		}
		else
		{
			System.out.println("Incorrect UPI PIN.Deposite failed");
		}

	}
	public void withdraw(double amount , int enteredPin)
	{
		if (upiPin==enteredPin) 
		{
			if (balance>=amount) 
			{
				balance= balance-amount;
				System.out.println(amount+"withdraw is successfully....");		
			}	
			else
			{
				System.out.println("Insufficient balance....");
			}	

		}else{
			System.out.println("Incorrect upi pin.withdraw failed");
		}
	}
	public void checkBalance()
	{
		System.out.println("Current balance: "+balance);
	}
	public void updateac(String address,long phoneNumber,int enteredPin)
	{
		if (upiPin==enteredPin) 
		{
			this.address=address;
			this.phoneNumber=phoneNumber;
			System.out.println("ac details update successfully");	
		}
		else 
		{
			System.out.println("Incorrect upi pin.Update failed");
		}	
	}
	public void displayDetails()
	{
		System.out.println("ac Holder Name: "+acHolderName);
		System.out.println("Address: "+address);
		System.out.println("Addhar Number: "+aadharNumber );
		System.out.println("PAN Number: "+panNumaber);
		System.out.println("Phone Number: "+phoneNumber);
		System.out.println("Current Blanace: "+balance);
	}
	public static  Bankac newac()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Createing a new ac...");
		System.out.print("Enter ac holder name: ");
		String acHolderName=scanner.nextLine();
		System.out.print("Enter Address: ");
		String address = scanner.nextLine();
		System.out.print("Enter adhar number: ");
		long aadharNumber=scanner.nextLong();
		System.out.print("Enter Pan Number: ");
		String panNumaber=scanner.next();
		System.out.print("Enter upi pin: ");
		int upiPin=scanner.nextInt();
		System.out.print("Enter initial balance: ");
		double balance=scanner.nextDouble();
		System.out.print("Enter phone number: ");
		long phoneNumber=scanner.nextLong();

		return new newac(acHolderName,address,aadharNumber,panNumaber,upiPin,balance,phoneNumber);
	}

}
public class BankDriver
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		newac ac=null;
		for (; ; ) 
		{
			System.out.println("Select an option");
			System.out.println("1. Create New Account");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Check Balance");
			System.out.println("5.Update ac");
			System.out.println("6.Existing User Recored");
			System.out.println("7.Exit");
			System.out.print("Enter an option: ");
			int choice =sc.nextInt();

			switch(choice)
			{
				case 1:
					ac=Bankac.newac();
					break;
				case 2:
					if (ac!=null) 
					{
						System.out.print("Enter amount to deposite: ");
						double depositeamount=sc.nextDouble();
						System.out.print("Enter upi pin: ");
						int depositePin= sc.nextInt();
						ac.deposite(depositeamount,depositePin);	
					}
					else
					{
						System.out.println("Create an account first");
					} 
					break;
				case 3:
					if (ac!=null) 
					{	
						System.out.print("Enter amount to withdraw: ");
						double withdrawAmount=sc.nextDouble();
						System.out.print("Enter upipin: ");
						int withdrawPin=sc.nextInt();
						ac.withdraw(withdrawAmount,withdrawPin);
						
					}
					else
					{
						System.out.println("Create an account first");
					} 
					break;
				case 4:
					if (ac!=null) 
					{
						ac.checkBalance();

					}
					else
					{
						System.out.println("Create an account first");
					}
				case 5:
					if (ac!=null) 
					{
						sc.nextLine();
						System.out.print("Enter new address: ");
						String newAddress= sc.nextLine();
						System.out.print("Enter new phone number: ");
						long newPhonenumber=sc.nextLong();
						System.out.print("Enter upi pin: ");
						int updatePin= sc.nextInt();
						ac.upiPinac(newAddress,newPhonenumber,updatePin);

					}
					else
					{
						System.out.println("Create an accpunt first");
					}
					break;
				case 6:
					if (ac!=null) 
					{
						ac.displayDetails();	
					}
					else
					{
						System.out.println("Create an account first");
					}
					break;
				case 7:
					System.out.println("Exiting....");
					System.exit(0);
				default:
					System.out.println("Invalid choice.Please enter a number between 1 and 7 ");
			}		
		}	
	}
}