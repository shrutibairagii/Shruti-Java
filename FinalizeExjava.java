class Employee
{
	String empName;
	double salary;
	Employee(String empName,double salary)
	{
		this.empName=empName;
		this.salary=salary;
	}
	@Override
	protected void finalize()
	{
		System.out.println("Object get distroyed");
	}
}
class FinalizeEx
{
	public static void main(String[] args) 
	{
		Employee obj=new Employee("Ramesh",50000);
		System.out.println(obj);
		obj.finalize();
			
	}
}