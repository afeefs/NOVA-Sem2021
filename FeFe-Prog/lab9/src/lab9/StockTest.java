package lab9;

public class StockTest {

	public static void main(String[] args) {
		Stock s1 = new Stock();
		Stock s2 = new Stock("GOOGL", 2200, 2264.72, true);
		
		//set the stock object for s1
		s1.setSymbol("AMZN");
		s1.setCurrentPrice(3323.44);
		s1.setPurchasePrice(4091);
		s1.setDividend(true);
		
		//invoke calProfit, calc div, and display the stock for google stock
		s2.calcProfit();
		s2.calcDividend();
		s2.displayStock();
	}

}
