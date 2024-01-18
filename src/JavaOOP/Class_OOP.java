package JavaOOP;
class Employee
{
	public int empNum;
	public String empName;
	public double empSalary;
	
	public Employee(int id,String name , double salary)
	{
		this.empNum = id;
		this.empName = name;
		this.empSalary = salary;
		
	}
	
	public void setEmpDetails()
	{
		
	}
	public void dispEmpDetails()
	{
		
	}
}

public class Class_OOP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Employee e1 = new Employee(1001,"Farooq",32000.0);
		System.out.println(e1.empNum);
		System.out.println(e1.empName);
		System.out.println(e1.empSalary);
	}
}
