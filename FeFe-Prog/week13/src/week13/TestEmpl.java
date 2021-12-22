package week13;

public class TestEmpl {
	//default constructor
	public static void main(String[] args) {
		double pay = 0.0;
		
		Empl em1 = new Empl();
		Empl em2 = new Empl();
		
		em1.setFname("Donald");
		em1.setLname("Duck");
		em1.setTitle("Cartoon");
		em1.setFt(true);
		em1.setSalery(153000);
		
		em1.displayEmpl();
		
		pay = em2.calcWpay(40);
		System.out.println("Weekly pay $" + pay);
		
		em2.setFname("Minnie");
		em2.setLname("Mouse");
		em2.setTitle("Cartoon");
		em2.setFt(false);
		em2.setWage(500);
		
		em2.displayEmpl();
		pay = em2.calcWpay(30);
		System.out.println("Weekly pay $" + pay);
	}
	
}
