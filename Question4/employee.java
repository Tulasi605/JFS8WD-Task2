package Task2.Question4;

public class employee extends person{
	
	private int EmployeeID;
	private double salary;
	
	public employee(String name, int age, int EmployeeID, double salary) {
		super(name, age);
		this.EmployeeID=EmployeeID;
		this.salary=salary;
	}
	
	public void displayemployee(){
		System.out.println("name="+ name);
		System.out.println("age="+ age);
		System.out.println("EmployeeID="+ EmployeeID);
		System.out.println("salary="+ salary);
	}
	public static void main(String args[]) {
		employee emp = new employee("guvi",20,1345,20000);
		emp.displayemployee();
	}

}
