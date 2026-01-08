
public class Employee1 {
	String name;
	int regNumber;
	String cName;
	String branch;
	int cCode;
	
	Employee1(){
		name="H SANNATHIPPESWAMY";
		regNumber=19;
		cName="GPT KUDLIGI";
		branch="CS ENGG";
		cCode=174;
		
	}
	Employee1(String n,int r,String cN,String b,int cC){
		name=n;
		regNumber=r;
		cName=cN;
		branch=b;
		cCode=cC;
		
	}
	void display() {
		System.out.println(name+" "+regNumber+" "+cName+" "+branch+" "+cCode);
		
	}
	
}
class ConstructorDemo{
	public static void main(String[]x) {
		Employee1 e1=new Employee1();
		e1.display();
		Employee1 e2=new Employee1("YUVARAJA",11,"GPT BALLARI","MECH ENGG",104);
		e2.display();		
		
	}
}
