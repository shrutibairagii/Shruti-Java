import java.util.Scanner;

class BankApplication
{
	static String name;
	static String address;
	static long phoneNo;
	static long aadharNo;
	static int upiPin;
	static double bal;

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		for (; ; ) 
		{
			System.out.println();
			System.out.println("*****WELCOME*****");
			System.out.println();
			System.out.print("1. Create Account");
			System.out.print("2. Existing Account");
			System.out.println();
			System.out.print("Enter an Option: ");
			int option= sc.nextInt();
			System.out.println();
			switch(option)
			{
				case 1:{
					System.out.print("******Create the account modules******");
					System.out.println();
					sc.nextLine();
					System.out.print("Enter your name: ");
					name = sc.nextLine();
					System.out.print("Enter your address: ");
					address =sc.nextLine();
					System.out.print("Phone number: ");
					phoneNo=sc.nextLong();
					System.out.print("Enter deposit amount: ");
					bal=sc.nextDouble();
					System.out.print("Enter upi pin: ");
					upiPin = sc.nextInt();
					System.out.print("Account has been created succesfully");
					break;

				}
				case 2:{
					for (; ; ) {
						System.out.println();
						System.out.println("*****Features******");
						System.out.println();
						System.out.println("1.Check Balance");
						System.out.println("2.Deposit");
						System.out.println("3.Withdraw");
						System.out.println("4.Information");
						System.out.println("5.Logout");
						System.out.print("Enter the option: ");
						int opt =sc.nextInt();
						switch(opt)
						{
							case 1:{
								System.out.println("*****Check Balance******");
								System.out.print("Enter your upi pin: ");
								int userPin= sc.nextInt();
								if (userPin==upiPin) 
								{
									System.out.print("Your acount balance is"+bal+"rs");	
								}
								else 
								{
									System.out.print("incorrect upi pin");
								}
							}
							break;
							case 2:{
								System.out.println();
								System.out.println("*****Deposit Amount*****");
								System.out.println();
								System.out.print("Enter the amount: ");
								double depAmount=sc.nextDouble();
								bal+=depAmount;
								System.out.print("Amount deposited succesfully");
								System.out.print("Current balance is"+ bal);
								break;
							}
							case 3:{
								System.out.println();
								System.out.println("*****Withdraw Amount******");
								System.out.print("Enter the upi pin: ");
								int password = sc.nextInt();
								if (password==upiPin)
								{
									System.out.print("Enter the amount: ");
									double withdraw=sc.nextDouble();
									if (withdraw<=bal) 
									{
										System.out.print("Amount withdraw successfully");
										bal=bal-withdraw;
										System.out.print("Current balance is: "+bal);		
									}	
									else 
									{
										System.out.print("Insufficient Fund");
									}	
								}
								else 
								{
									System.out.print("Incorrect pin");	
								}
								break;
							}
							case 4:{
								System.out.println();
								System.out.println("*****Account Information*****");
								System.out.println();
								System.out.println("Account holder name: "+name);
								System.out.println("Address: "+address);
								System.out.println("Phone number: "+phoneNo);
								System.out.println("Aadhar number: "+aadharNo);
								break;
							} 
							case 5:{
								System.exit(0);
							}
							default:System.out.print("Invalid option");
								break;

							}

						
					}
				}
				default: System.out.print("Invalid option");
					break;
			}		
		}	
	}

}