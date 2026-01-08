
public class Students{
	int rollNum;
	String name;
	String course;
	
	void setData(int r,String n,String c) {
		rollNum=r;
		name=n;
		course=c;
	}
}
class Main4{
	public static void main(String[]args) {
		Students s1=new Students();
		Students s2=new Students();
		
		s1.setData(2,"HS THIPPESH","XS");
		s2.setData(3,"TUva","raja");
		
		System.out.println(s1.rollNum);
		System.out.println(s1.name);
		System.out.println(s1.course);
		
		System.out.println(s2.rollNum);
		System.out.println(s2.name);
		System.out.println(s2.course);
		
		
		
	}
}
	
	
	   

	   

	        
	    


