
public class Restaurant {
	

	    void generateBill() {
	        int dosa = 50;      // local variables
	        int idli = 30;
	        int coffee = 20;

	        int totalBill = dosa + idli + coffee;

	        System.out.println("Dosa Price: " + dosa);
	        System.out.println("Idli Price: " + idli);
	        System.out.println("Coffee Price: " + coffee);
	        System.out.println("Total Bill Amount: " + totalBill);
	    }

	    public static void main(String[] args) {
	        Restaurant hotel = new Restaurant();
	        hotel.generateBill();
	    }
	}



