package week14;

public class Player {
	//properties
	private String name = null;
	private int points = 0;
	private String controlType = null;
	private String power = null;
	
	//default constructor
	Player(){}
	//constructor with parameters
	Player(String newName, int newPoints, String newControlType, String newPower){
		this.name = newName;
		this.points = newPoints;
		this.controlType = newControlType;
		this.power = newPower;
	}
	
	//set methods below
	public void setName(String newName){
		this.name = newName;
	}
	public void setPoints(int newPoints){
		this.points = newPoints;
	}
	public void setControlType(String newControlType){
		this.controlType = newControlType;
	}
	public void setPower(String newPower){
		this.power = newPower;
	}
	
	//get methods below
	public String getName() {
		return name;
	}
	public int getPoints() {
		return points;
	}
	public String getControlType() {
		return controlType;
	}
	public String getPower() {
		return power;
	}
	
	//displays player info
	public void displayPlayer(){
		System.out.println("Player Name: " + this.name);
		System.out.println("Points: " + this.points);
		System.out.println("Controler Type: " +this.controlType);
		System.out.println("Power: " + this.power);
	}
	
	//update points
	public void updatePoints(int addPoints){
		this.points += addPoints;
	}
	
	//activating power
	public void activatePower(){
		if(this.points > 100){
			System.out.println("Your special power has now been activated.");
		}
	}
	
}
