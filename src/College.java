
public class College {
	

	    // Static variable
	    static String collegeName = "Government Degree College";

	    // Instance variables
	    int studentId;
	    String studentName;

	    void setData(int id, String name) {
	        studentId = id;
	        studentName = name;
	    }

	    void display() {
	        System.out.println("Student ID   : " + studentId);
	        System.out.println("Student Name : " + studentName);
	        System.out.println("College Name : " + collegeName);

	    }

	    public static void main(String[] args) {
	        College s1 = new College();
	        College s2 = new College();

	        s1.setData(101, "Ravi");
	        s2.setData(102, "Anita");

	        s1.display();
	        System.out.println("---------------------------");
	        s2.display();
	    }
	


}
