package lab9;

public class Stock{
	//global vars- properties
	private String symbol = null;
	private double purchasePrice = 0.0;
	private double currentPrice = 0.0;
	private boolean dividend = false;
		
	Stock(){}//default constructor
	Stock(String newSymb, double newPurPrice, double newCurrPrice, boolean newDiv){
		this.symbol = newSymb;
		this.purchasePrice = newPurPrice;
		this.currentPrice = newCurrPrice;
		this.dividend = newDiv;
	}
		
	//set methods below
	public void setSymbol(String newSymbol){
		this.symbol = newSymbol;
	}
	public void setPurchasePrice(double newPurPrice){
		this.purchasePrice = newPurPrice;
	}
	public void setCurrentPrice(double newCurrPrice){
		this.currentPrice = newCurrPrice;
	}
	public void setDividend(boolean newDiv){
		this.dividend = newDiv;
	}
	
	//get methods below
	public String getSymbol(){
		return this.symbol;
	}
	public double getPurchasePrice(){
		return this.purchasePrice;
	}
	public double getCurrentPrice(){
		return this.currentPrice;
	}
	public boolean getDividend(){
		return this.dividend;
	}
	
	public double calcProfit(){
		double profit = 0.0;
		profit = this.currentPrice - this.purchasePrice;
		System.out.println("Profit: $" + profit);
		return profit;
	}
	
	public double calcDividend(){
		double divPayOut = 0.0;
		if(this.dividend){
			divPayOut = this.currentPrice * .04;
		}
		System.out.println("Dividends Earned: $" + divPayOut);
		return divPayOut;
	}
		
	public void displayStock(){
		System.out.println("------------------------------------------");
		System.out.println("Stock Symbol: " + this.symbol);
		System.out.println("Purchase Price: $" + this.purchasePrice);
		System.out.println("Current Price: $" + this.currentPrice);
		this.calcDividend();
		this.calcProfit();
		System.out.println("------------------------------------------");
	}
}

