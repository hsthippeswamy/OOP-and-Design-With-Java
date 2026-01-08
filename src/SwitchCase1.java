import java.util.Scanner;

public class SwitchCase1 {
	public static void main(String[]args) {
		int choice;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Department Code");
		choice=s.nextInt();
		
		switch(choice){
		case 11:
			System.out.println("You Have Opted CS Dept");
			break;
		case 12:
			System.out.println("You Have Opted Mech Dept");
			break;
		case 13:
			System.out.println("You Have Opted Civil Dept");
			break;
		case 14:
			System.out.println("You Have Opted EC Dept");
			break;
			
		default:
			System.out.println("You Have Entered Invali Code");
		
		
		
			
		}
	}

}
