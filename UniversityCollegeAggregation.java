class University
{
	String name;
	String universityCode;
	int noOfColleges;
	String type;
	int establishedYear;
	int course;
	College college; 

	University(String name,String universityCode, int noOfColleges, String type, int establishedYear,int course)
	{
		this.name=name;
		this.universityCode=universityCode;
		this.noOfColleges=noOfColleges;
		this.type=type;
		this.establishedYear=establishedYear;
		this.course=course;
	}	
	public void displayUniversity()
	{
		System.out.println();
		System.out.println("*****UNIVERSITY DETAILS*****");
		System.out.println("Name of University: "+this.name);
		System.out.println("University Code: "+this.universityCode);
		System.out.println("Number of Colleges: "+this.noOfColleges);
		System.out.println("Type: "+this.type);
		System.out.println("Established Year: "+this.establishedYear);
		System.out.println("Number of course: "+this.course);
	}
	public void CreateInstanceOfCollege(String name,String collegeCode,String address,int noOfDepartment,int staffCount,char grade)
	{
		college = new College(name, collegeCode,address,noOfDepartment,staffCount,grade);
	}
}
class College
{
	String name;
	String collegeCode;
	String address;
	int noOfDepartment;
	int staffCount;
	char grade;
	Department department;

	College(String name,String collegeCode,String address,int noOfDepartment,int staffCount,char grade)
	{
		this.name=name;
		this.collegeCode=collegeCode;
		this.address=address;
		this.noOfDepartment=noOfDepartment;
		this.staffCount=staffCount;
		this.grade=grade;
	}
	public void displayCollege()
	{
		System.out.println();
		System.out.println("*****COLLEGE DETAILS*****");
		System.out.println("Name of College: "+this.name);
		System.out.println("College Code: "+this.collegeCode);
		System.out.println("Address: "+this.address);
		System.out.println("No of Department: "+this.noOfDepartment);
		System.out.println("Staff Count: "+this.staffCount);
		System.out.println("College Grade: "+this.grade);
	}
	public void CreateInstanceOfDepartment(String name,String hodName,int classroom,int noOfStaff,int noOfSubject)
	{
		department = new Department(name,hodName,classroom,noOfStaff,noOfSubject);
	}
}
class Department
{
	String name;
	String hodName;
	int classroom;
	int noOfStaff;
	int noOfSubject;
	Teacher teacher;

	Department(String name,String hodName,int classroom,int noOfStaff,int noOfSubject)
	{
		this.name=name;
		this.hodName=hodName;
		this.classroom=classroom;
		this.noOfStaff=noOfStaff;
		this.noOfSubject=noOfSubject;
	}
	void displayDepartment()
	{
		System.out.println();
		System.out.println("*****DEPARTMENT DETAILS*****");
		System.out.println("Name Of Department: "+this.name);
		System.out.println("HOD Name: "+this.hodName);
		System.out.println("No of Classroom: "+this.classroom);
		System.out.println("No of Staff: "+this.noOfStaff);
		System.out.println("No of Subject: "+this.noOfSubject);

	}
	public void CreateInstanceOfTeacher(String name,String subject,long phoneNumber,String qualification,double experiance)
	{
		teacher = new Teacher(name, subject,phoneNumber,qualification,experiance);
	}
}
class Teacher
{
	String name;
	String subject;
	long phoneNumber;
	String qualification;
	double experiance;

	Teacher(String name,String subject,long phoneNumber,String qualification,double experiance)
	{
		this.name=name;
		this.subject=subject;
		this.phoneNumber=phoneNumber;
		this.qualification=qualification;
		this.experiance=experiance;
	}
	void displayTeacher()
	{
		System.out.println();
		System.out.println("*****TEACHER DETAILS*****");
		System.out.println("Name of Teacher: "+this.name);
		System.out.println("Subject: "+this.subject);
		System.out.println("Phone Number: "+this.phoneNumber);
		System.out.println("Qualification: "+this.qualification);
		System.out.println("Experiance: "+this.experiance);
	}
}
class UniversityCollegeAggregation
{
	public static void main(String[] args) 
	{
		University obj = new University("SPPU","UNI123",1100,"Government",1950,300);
		obj.displayUniversity();
		obj.CreateInstanceOfCollege("MODERN","M123","Shivaji Nagar, Pune",10,110,'A');
		obj.college.displayCollege();
		obj.college.CreateInstanceOfDepartment("CS","XYZ",8,8,48);
		obj.college.department.displayDepartment();
		obj.college.department.CreateInstanceOfTeacher("Ramesh","JAVA",1234567898,"MTECH",5.5);
		obj.college.department.teacher.displayTeacher();

		
	}
}