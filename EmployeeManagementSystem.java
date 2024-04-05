import java.util.Scanner;

class EmployeeManagementSystem
{
	static String ename;
	static int eid;
	static String erole;
	static double esal;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("******WELCOME******");
		System.out.println();
		features:
		for (; ; ) 
		{
			System.out.println("******FEATURES********");
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
			    	System.out.println("Edit Employee Data");
			    	for (; ; ) 
			    	{
			    		System.out.println("1.Edit Name");
			    		System.out.println("2.Edit Role");
			    		System.out.println("3.Edit Salary");
			    		System.out.println("4.Exit");
			    		System.out.print("Enter a Option: ");
			    		int opt1= sc.nextInt();
			    		switch(opt1)
			    		{
			    			case 1:{
			    				updateName();
			    				break;
			    			}
			    			case 2:{
			    				updateRole();
			    				break;
			    			}
			    			case 3:{
			    				updateSalary();
			    				break;
			    			}
			    			case 4:{
			    				return;
			    			}
			    		}	
			    	}
			    	
			    } 
			    case 4:{
			    	System.exit(0);
			    	break;
			    }
			    default:{
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

	public static void updateName()
	{ 
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Updated Name: ");
		String updateName = sc.nextLine();
		if(ename==updateName)
		{
			System.out.println("Name is Updated");
		}
	}
	public static void updateRole()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter updated Role: ");
		String updateRole= sc.nextLine();
		{
			System.out.println("Role is updated");
		}
	}
	public static void updateSalary()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Updated Salary: ");
		double updateSalary =sc.nextDouble();
		{
			System.out.println("Salary is updated");
		}
	}

}