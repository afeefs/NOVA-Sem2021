/* or
 * Afeefah Manzoor
 * Lab 3: Specials
 * 2/4/2021
 * Description
 *: Displaying the daily special
 * */
//imports
import javax.swing.JOptionPane;

public class Lab3 {

	public static void main(String[] args) {
		// declaring variables
		String dayOfWeek = null; 
		double price = 0; //price of special
		boolean freeDessert = false; //does the user get free dessert
		
		//get day of week from user and convert to uppercase
		dayOfWeek = JOptionPane.showInputDialog(null, "What day of the week is it?");
		dayOfWeek = dayOfWeek.toUpperCase();
		
		//finding the day of the week and outputting specials
		switch(dayOfWeek) {
			case"MONDAY":{
				System.out.println("Monday's Special: All you can eat wings $15.99");
				price = 15.99;
				break;
			}
			case "TUESDAY": {
				System.out.println("Tuesday's Special: $12.00 Specality Wings.");
				price = 12.00;
				break;
			}
			case "WEDNESDAY":{
				System.out.println("Wednesday's Special: $10.99 BLT.");
				price = 10.99;
				break;
			}
			case "THURSDAY":{
				System.out.println("Thursday's Special: $13.50 Shrimp Scampi.");
				price = 13.50;
				break;
			}
			case "FRIDAY":{
				System.out.println("Friday's Special: $4 craft beer");
				price = 4.00;
				break;
			}
			case "SATURDAY":{
				System.out.println("Saturday's Special: $12.00 Brioche French Toast.");
				price = 12.00;
				break;
			}
			case "SUNDAY":{
				System.out.println("Sunday's Special: $13 brunch platter.");
				price = 13.00;
				break;
			}	
		}
		if (dayOfWeek.equals("MONDAY") || dayOfWeek.equals("TUESDAY") || dayOfWeek.equals("WEDNESDAY") || dayOfWeek.equals("THURSDAY")) {
			if(price > 12) {
				System.out.println("You get a free dessert!");
				freeDessert = true;
			}
			else {
				System.out.println("Sorry, you aren't eligible for a free dessert.");
			}
		}
		else {
			System.out.println("Sorry, you aren't eligible for free dessert.");
		}
		
	}

}
