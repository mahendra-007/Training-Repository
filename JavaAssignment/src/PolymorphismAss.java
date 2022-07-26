class Employee{
	int employee_id;
	String employeename;
	double salary;
	public Employee(int employee_id, String employeename, double salary) {
		super();
		this.employee_id = employee_id;
		this.employeename = employeename;
		this.salary = salary;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
class Manager extends Employee{

	public static final double incentive=300;
	public Manager(int employee_id, String employeename, double salary) {
		super(employee_id, employeename, salary);
		// TODO Auto-generated constructor stub
	}

	public double getSalary() {
		return salary*incentive;
	}
	
}

class Labour extends Employee{
	public static final double ot=9;
	public Labour(int employee_id, String employeename, double salary) {
		super(employee_id, employeename, salary);
		
	}
public double getSalary() {
	return salary*ot;
}

	
}
public class PolymorphismAss {

	public static void main(String[] args) {
		Manager m1=new Manager(1,"mahendra",40000);
		Labour l1=new Labour(2,"Raghu",30000);
		System.out.println("Employee id is"+ m1.getEmployee_id()+" "+"Employee name is "+ m1.getEmployeename()+" "+" Employee salary is"+ m1.getSalary());
		
		System.out.println("Employee id is"+ l1.getEmployee_id()+" "+"Employee name is"+ l1.getEmployeename()+" "+"Employee salary is"+ l1.getSalary());
		

	}

}