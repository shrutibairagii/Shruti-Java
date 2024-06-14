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

		System.out.println("OBJECT GET DISTOYED");
	}
}
class FinalizeEx
{
	public static void main(String[] args) 
	{
		Employee obj=new Employee("Ramesh",50000);
		System.out.println(obj.empName);
		obj=null;
		System.gc();//GC call explicitly
		System.out.println(obj.empName);

	}
}