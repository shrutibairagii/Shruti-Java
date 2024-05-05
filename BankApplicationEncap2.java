import java.util.Scanner;

class Account
{
	private String accountHolderName;
	private String address;
	private String aadharNumber;
	private String panNumber;
	private int pin;
	private double balance;
	private String phoneNumber;

	public Account(String accountHolderName,String address,String aadharNumber,String panNumber,int pin,double balance, String phoneNumber)
	{
		this.accountHolderName=accountHolderName;
		this.address=address;
		this.aadharNumber=aadharNumber;
		this.panNumber=panNumber;
		this.pin=pin;
		this.balance=balance;
		this.phoneNumber=phoneNumber;
	}	
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAadharNumber()
	{
		return aadharNumber;
	}
	public String getPAnNumber()
	{
		return panNumber;
	}
	public int getPin()
	{
		return pin;
	}
	public void setPin(int pin)
	{
		this.pin=pin;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}
	public void deposit(double amount)
	{
		balance+=amount;
		System.out.println("Deposit Successful.Your New Balance: "+balance);
	}
	public boolean withdraw(double amount)
	{
		if (balance>=amount) 
		{
			balance-=amount;
			System.out.println("Withdrawal Successful.Your New Balance: "+balance);
			return true;	
		}
		else
		{
			System.out.println("Insufficient Balance");
			return false;
		}
	}
}
class Bank
{
	private Account account;
	private Scanner sc;
	public Bank()
	{
		sc=new Scanner(System.in);
	}
	public void createAccount()
	{
		System.out.println();
		System.out.print("Enter account holder name: ");
		String name=sc.nextLine();
		System.out.print("Enter address: ");
		String address=sc.nextLine();
		System.out.print("Enter aadhar number: ");
		String aadhar=sc.nextLine();
		System.out.print("Enter Pan Number: ");
		String pan=sc.nextLine();
		System.out.print("Set PIN: ");
		int pin = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter phone number: ");
		String phone=sc.nextLine();
		System.out.print("Enter initial deposit balance: ");
		double balance=sc.nextDouble();
		sc.nextLine();

		account=new Account(name,address,aadhar,pan,pin,balance,phone);
		System.out.println("Accoun created Successful");
	}
	public void existingUser()
	{
		if (account==null) 
		{
			System.out.println("No account found.Please create account first");
			return;	
		}
		System.out.print("Enter Pin: ");
		int pin=sc.nextInt();
		sc.nextLine();
		if (pin!=account.getPin()) 
		{
			System.out.print("Incorrect pin");
			return;	
		}
		while(true)
		{
			System.out.println();
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Update Account");
			System.out.println("5.Display Accoun Details");
			System.out.println("6.Exit");
			System.out.println();
			System.out.print("Selcet an option: ");
			int opt=sc.nextInt();
			sc.nextLine();

			switch(opt)
			{
				case 1:
					System.out.println();
					System.out.print("Your balance: "+account.getBalance());
					break;
				case 2:
					System.out.print("Enter amount to deposit: ");
					double depositAmount=sc.nextDouble();
					account.deposit(depositAmount);
					break;
				case 3:
					System.out.print("Enter amount to withdraw: ");
					double withdrawAmount=sc.nextDouble();
					if (account.withdraw(withdrawAmount)) 
					{
						System.out.println("Withdrawal Successful");	
					}
					break;
				case 4:
					updateAccount();
					break;
				case 5:
					displayAccount();
					break;
				case 6:
					System.out.println("Existing user option");
					return;
				default:
					System.out.println("Invalid option");
			}
		}
	}
	private void updateAccount()
	{
		while(true)
		{
			System.out.println();
			System.out.println("1.Update account holder name");
			System.out.println("2.Update address");
			System.out.println("3.Update pin");
			System.out.println("4.Update Phone number");
			System.out.println("5.Display account details");
			System.out.println("6.Exit");
			System.out.print("Select an option: ");
			int opt=sc.nextInt();
			sc.nextLine();

			switch (opt) 
			{
				case 1: 
					System.out.print("Enter new account holder name: ");
					String newName=sc.nextLine();
					account.setAccountHolderName(newName);
					break;
				case 2:
					System.out.print("Enter new address: ");
					String newAddress=sc.nextLine();
					account.setAddress(newAddress);
					break;
				case 3:
					System.out.print("Enter new pin: ");
					int newPin=sc.nextInt();
					account.setPin(newPin);
					break;
				case 4:
					System.out.print("Enter new phone number: ");
					String newPhone=sc.nextLine();
					account.setPhoneNumber(newPhone);
					break;
				case 5:
					System.out.println("Account Details");
					displayAccount();
					break;
				case 6:
					System.exit(0);
				default:
				System.out.println("Inavlid option");	
			}
		}
	}
	public void displayAccount()
	{
		System.out.println();
		System.out.println("******ACCOUNT DETAILS******");
		System.out.println();
		System.out.println("Account holder name: "+account.getAccountHolderName());
		System.out.println("Address: "+account.getAddress());
		System.out.println("Aadhar Number: "+account.getAadharNumber());
		System.out.println("Pan number: "+account.getPAnNumber());
		System.out.println("Phone number: "+account.getPhoneNumber());
		System.out.println("Balance: "+account.getBalance());
	}
}
public class BankApplicationEncap2
{
	public static void main(String[] args) 
	{
		Bank bank=new Bank();
		Scanner sc = new Scanner(System.in);

		while(true)
		{
			System.out.println();
			System.out.println("1.Create account");
			System.out.println("2.Existing account");
			System.out.println("3.Exit");
			System.out.print("Select an option: ");
			int opt=sc.nextInt();
			sc.nextLine();

			switch(opt)
			{
				case 1:
					bank.createAccount();
					break;
				case 2:
					bank.existingUser();
					break;
				case 3:
					System.out.println("Application closed");
					System.exit(0);
				default:
					System.out.println("Invalid option");
			}
		}	
	}
}