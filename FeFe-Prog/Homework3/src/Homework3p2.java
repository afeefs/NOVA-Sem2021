/*Afeefah Manzoor
 * ITP 120
 * 3/23/2021
 * Description: creating 3 parallel arrays of different days taco trucks are selling tcos
 * 
 */
import javax.swing.JOptionPane;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Homework3p2 {

	public static void main(String[] args) throws IOException{
		// creating and defining vars
		int[] fri = {350, 490, 534}; //tacos told on friday
		int[] sat = {434, 245,385}; //tacos sold on saturday
		int[] sun = {534, 385, 256}; //tacos sold on sunday 
		int truckNum = 0; //truckNumber
		int totSalePT = 0; // total sale per truck 
		int totSales = 0; //total sales combining all trucks
		Path fileName = Path.of("tacoSales.txt"); //creating file object
		String output = null;
		
		//get user input
		truckNum = truckNum();
		
		//calling total sales per truck method
		totSalePT = salesForTruck(fri, sat, sun, truckNum); 
		
		
		//calling the total sales of all trucks combined
		totSales = allSales(fri, sat, sun);
		
		output = ("The total sales of truck " + truckNum + " is: $" + totSalePT + "\nThe total for the whole weekend is: $" + totSales);
		
		JOptionPane.showMessageDialog(null, output); //displays message in a pop-up window
		
		Files.writeString(fileName, output); //writes message into file
		
	}
	
	//validating and getting truck number from user
	public static int truckNum() {
		int trNum = 0;
		do { //asking user what truck number they would like 
			trNum = Integer.parseInt(JOptionPane.showInputDialog("Which Truck number's sale would you like to see from the Weekend? \n Enter 1, 2, or 3"));
		}while(trNum > 3 || trNum < 1); //validation
		return trNum;
	}
	
	public static int salesForTruck(int[] day1, int[] day2, int[] day3, int truckNum){
		//outputs the total sales for a specific truck
		//define vars
		int total = 0;
		
		//adding up total for truck over all the days
		for(int i = 0; i < day1.length; i++){
			if((i+1) == truckNum){
				total = day1[i] + day2[i] + day3[i];
			}
		}
		
		return total;
	}
	
	public static int allSales(int day1[], int day2[], int day3[]){
		//returns all the sales of all the trucks
		int total = 0;
		
		for(int i = 0; i < day1.length; i++){
			total += day1[i] + day2[i] + day3[i];
		} 
		
		return total;
	}

}//end of class
