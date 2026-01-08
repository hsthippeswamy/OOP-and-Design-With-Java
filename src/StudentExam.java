
public class StudentExam {
	

	   public static void calculateResult() {
	        int math = 75;        // local variables
	        int science = 80;
	        int english = 70;
	        int kannada=87;
	        int social=77;
	        int hindi=56;

	        int total = math + science + english+kannada+hindi+social;
	        float percentage = total / 6.0f;

	        System.out.println("Total Marks: " + total);
	        System.out.println("Percentage: " + percentage);
	    }

	    public static void main(String[] args) {
	    	String name="H SANNATHIPPESWAMY";
	    	System.out.println(name);
	         
	        calculateResult();
	        
	    }
	}



