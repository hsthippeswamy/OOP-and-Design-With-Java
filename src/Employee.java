
public class Employee {
	String name;
	int employeeId;
	double salary;
	String address;
	
	//default constructor
	Employee(){
		name="UNKNOWN";
		employeeId=0;
		salary=0.00;
		address="----L";		
	}
	//parameterized constructor
	Employee(String n,int i,double s,String a){
		name=n;
		employeeId=i;
		salary=s;
		address=a;
	}
	//copy constructor
	Employee(Employee e){
		name=e.name;
		employeeId=e.employeeId;
		salary=e.salary;
		address=e.address;
	}
	void display() {
		System.out.println(name+employeeId+salary+address);
	}
	
}
class Emp{
	public static void main(String[]dddljg) {
		Employee e1=new Employee(); {
			System.out.println(e1.name);
			System.out.println(e1.employeeId);
			System.out.println(e1.salary);
			System.out.println(e1.address);	
		
		Employee e2=new Employee("sanna:",25,23.876,"Ballari");
		display();

 	    }
	}

	private static void display() {
		// TODO Auto-generated method stub
		
	}
}
