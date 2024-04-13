import java.util.Scanner;

class EmployeeManagementSystemm
{
	static String ename;
	static int eid;
	static String erole;
	static double esal;

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("*****WELCOME*****");
		System.out.println();
		features:
		for (; ; ) 
		{
			System.out.println("*****FEATURES*****");
			System.out.println("1. Add New Employee");
			System.out.println("2. View Employee");	
			System.out.println("3. Edit Employee");
			System.out.println("4. Exit");
			System.out.println();
			System.out.print("Enter an Option: ");
			int opt=sc.nextInt();
			switch(opt)
			{
				case 1:{
					addNewEmployee();
					break;
				}
				case 2:{
					viewEmployee(1);
					break;
				}
			    case 3:{
			    	System.out.println("**********Edit Employee Data********");
			    	for (; ; ) 
			    	{
			    		System.out.println("1.Edit Name");
			    		System.out.println("2.Edit Role");
			    		System.out.println("3.Edit Salary");
			    		System.out.print("Enter a Option: ");
			    		int option=sc.nextInt();
			    		switch(option)
			    		{
			    			case 1:{
			    				editEmployeeName();
			    				break;
			    			}
			    			case 2:{
			    				editEmployeeRole();
			    				break;
							}
							case 3:{
								editEmployeeSalary();
								break;
							}
						}	
			    	}
			    	
			    	
			    }
			    case 4:{
			    	System.exit(0);
			    	break;
			    }
			    default :{
			    	System.out.println("Incorrect Option");
			    }
			}    
		}
			
	}
	public static void addNewEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("***Enter New Employee Data***");
		System.out.print("Employee Name: ");
		ename =sc.nextLine();
		System.out.print("Employee Id: ");
		eid= sc.nextInt();
		Scanner s = new Scanner(System.in);
		System.out.print("Employee Role: ");
		erole = s.nextLine();
		System.out.print("Employee Salary: ");
		esal = s.nextDouble();
	}
	public static void viewEmployee(int eid1)
	{
		if(eid==eid1)
		{
			System.out.println("Employee Data");
			System.out.println("Name: "+ ename);
			System.out.println("Emp Id : "+ eid);
			System.out.println("Role : "+ erole);
			System.out.println("Salary : "+ esal);
			System.out.println();
		}
		else 
		{
			System.out.println("Wrong EID");
		}	
	}
	public static void editEmployeeName()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter New name: ");
		ename = sc.nextLine();
		System.out.print("Name is Updated");
		viewEmployee(1);
	}
	public static void editEmployeeRole()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter New Role: ");
		erole = sc.nextLine();
		System.out.print("Role is Update");
		viewEmployee(1);
	}
	public static void editEmployeeSalary()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter new Salary:  ");
		esal = sc.nextDouble();
		System.out.print("Salary is update");
		viewEmployee(1);

	}
}