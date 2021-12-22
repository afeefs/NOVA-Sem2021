package week13;

public class Empl {
	private double wage = 0.0;
	private String fName;
	private String lName;
	private String title;
	private int salery;
	private boolean ft;
			
	Empl(){}

	public void setFname(String newFname){
		this.fName = newFname;
	}
	public void setLname(String newLname) {
		this.lName = newLname;
	}
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	public void setWage(double newWage) {
		this.wage = newWage;
	}
	public void setSalery(int newSal){
		this.salery = newSal;
	}
	public void setFt(boolean newFt){
		this.ft = newFt;
	}
	
	public String getFname(){
		return this.fName;
	}
	public String getLname(){
		return this.lName;
	}
	public String getTitle(){
		return this.title;
	}
	private int getSal(){
		return this.salery;
	}
	public boolean getFt(){
		return this.ft;
	}
	public double getWage(){
		return this.wage;
	}
	
	public double calcWpay(double hours){
		double pay = 0;
		if(ft)
			pay = this.salery;
		else
			pay = this.wage * hours;
		return pay;
	}
	
	public void displayEmpl(){
		String output = this.fName + " " + this.lName + " \nTitle: " + this.title +"";
		System.out.println(output);
	}
	
}
