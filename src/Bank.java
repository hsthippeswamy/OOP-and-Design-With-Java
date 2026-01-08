
public class Bank {
	

	    // Static variable
	    static double rateOfInterest = 7.5;

	    // Instance variables
	    int accountNo;
	    String accountHolder;
	    double balance;

	    void setAccount(int accNo, String name, double bal) {
	        accountNo = accNo;
	        accountHolder = name;
	        balance = bal;
	    }

	    void calculateInterest() {
	        double interest = (balance * rateOfInterest) / 100;
	        System.out.println("Interest Amount : " + interest);
	    }

	    void display() {
	        System.out.println("Account No      : " + accountNo);
	        System.out.println("Account Holder  : " + accountHolder);
	        System.out.println("Balance         : " + balance);
	    }

	    public static void main(String[] args) {
	        Bank b1 = new Bank();
	        

	        b1.setAccount(1001, "Suresh", 25670);
	       

	        b1.display();
	        b1.calculateInterest();

	     

	       
	    }
	


}
