import java.util.Scanner;

public class NestedIf1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age;
		String gender;
		float income;
		
		System.out.println("Enter Your Age");
		age=s.nextInt();
		
		System.out.println("Enter Gender");
		gender=s.next();
		
		System.out.println("Enter Your Income In Rupees");
		income=s.nextFloat();
		double tax=0;
		if(age>=60) {
			if(gender=="male") {
				tax=income*0.1;
			}
			else {
				tax=income*0.08;
			}
		}
		else {
			if(gender=="male") {
				tax=income*0.12;
			}
			else {
				tax=income*0.10;
			}
			
		}
		System.out.println("Your Tax Amount Is="+tax);
	 

	}

}
