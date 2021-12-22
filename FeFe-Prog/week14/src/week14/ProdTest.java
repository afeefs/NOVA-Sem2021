package week14;

public class ProdTest {

	public static void main(String[] args) {
		//creat and user prod object
		Prod p1 = new Prod();
		Prod p2 = new Prod();
		Prod p3 = new Prod("F388", "Tide Detergent", 15.49, 80);
		
		p1.setID("e500");
		p1.setName("Women's Timex Classic Watch");
		p1.setPrice(38.50);
		p1.setNumInStock(28);
		
		p2.setID("43gs3");
		p2.setName("Jeans");
		p2.setPrice(26.99);
		p2.setNumInStock(93);
		
		p1.displayProd();
		p2.displayProd();
		p3.displayProd();
	}

}
