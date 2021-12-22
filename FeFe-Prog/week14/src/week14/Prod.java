package week14;
//design for a product objects
public class Prod {
	//global variables
	private String id = null;
	private String name = null;
	private double price = 0.0;
	private int numInStock = 0;
	
	//default constructor
	Prod(){}
	
	Prod(String newID, String newName, double newPrice, int newNumInStock){
		this.id = newID;
		this.name = newName;
		this.price = newPrice;
		this.numInStock = newNumInStock;
	}
	
	//set methods
	public void setID(String newID){
		this.id = newID;
	}
	public void setName(String newName){
		this.name = newName;
	}
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}
	public void setNumInStock(int newNumIS){
		this.numInStock = newNumIS;
	}
	
	//get methods
	public String getID(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public double getPrice(){
		return this.price;
	}
	public int getNumInStock(){
		return this.numInStock;
	}
	
	//calculating empl discount
	public double calcEdiscount(){
		double disc = 0;
		disc = this.price * .15;
		return disc;
	}
	
	public void displayProd(){
		System.out.println("Item ID: " + this.id);
		System.out.println("Item Name: "+this.name);
		System.out.println("Item Price: $" +this.price);
		System.out.println("How many in stock: "+this.numInStock);
		System.out.println("Employee Discount: $"+this.calcEdiscount());
		System.out.println("-------------------------------------------");
	}
	
}
