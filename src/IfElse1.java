import java.util.Scanner;

public class IfElse1 {
	public static void main(String[]args) {
		int dayNumber;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Day Number");
		dayNumber=s.nextInt();
		
		if(dayNumber==1) {
			System.out.println("It Is Monday");
			System.out.println("Today Dress Code Is Blue");
		}
		else if(dayNumber==2) {
			System.out.println("It Is Tuesday");
			System.out.println("Today Dress Code Is White");
		}
		else if(dayNumber==3) {
			System.out.println("It Is Wednesday");
			System.out.println("Today Dress Code Is Grey");
		}
		else if(dayNumber==4) {
			System.out.println("It Is Thursday");
			System.out.println("Today Dress Code Is Yellow");
		}
		else if(dayNumber==5) {
			System.out.println("It Is Friday");
			System.out.println("Today Dress Code Is White Checks");
		}
		else if(dayNumber==6) {
			System.out.println("It Is Saturday");
			System.out.println("Today Dress code Is Maroon");
		}
		else {
			System.out.println("It Is holiday");
			System.out.println("Today Dress Code Is Black");
		}
			
		
	}

}
