import java.util.*;
class Employee
{
	private int emp_id;
	private String emp_name;
	private String joining_Date;
	private String emp_department;
	private double salary;
	
	Employee(int emp_id, String emp_name, String joining_Date, String emp_department,double salary)
	{
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.joining_Date = joining_Date;
		this.emp_department = emp_department;
		this.salary = salary
	}
	
	public void setId(int emp_id)
	{
		this.emp_id=emp_id;
	}
	public int getID()
	{
		return emp_id;
	}
	
	public void setName(String emp_name)
	{
		this.emp_name=emp_name;
	}
	public String getName()
	{
		return emp_name;
	}
	
	public void setJoiningDate(String joining_Date)
	{
		this.joining_Date=joining_Date;
	}
	public String getJoiningDate()
	{
		return joining_Date;
	}
	
	public void setDepartment(String emp_department)
	{
		this.emp_department=emp_department;
	}
	public String getDepartment()
	{
		return emp_department;
	}
	
	public String toString()
	{
		return "{Employee= ID:" +emp_id+ ", NAME:" +emp_name+ ", Joining Date:" +joining_Date+ "}";
	}
}

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Employee> employees = new ArrayList<>();
		Employee e1 = new Employee(101,"Jayesh","02-06-2026");
		employees.add(e1);
		System.out.println(e1);
		
		Employee e2 = new Employee(102,"Dikshita","02-06-2026");
		employees.add(e2);
		System.out.println(e2);
		
		
	}
}