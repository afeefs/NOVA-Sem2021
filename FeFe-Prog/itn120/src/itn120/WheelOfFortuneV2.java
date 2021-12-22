//Afeefah Manzoor
//Lab 2: Wheel of fortune
//1/28/2021

package itn120;

//import statements
import java.util.Random;
import javax.swing.JOptionPane;

public class WheelOfFortuneV2 {

	public static void main(String[] args) {
		//create objects
		Random rand = new Random();
		
		//create variable
		int wheelNumber = rand.nextInt(5)+1; //where on the wheel you land on
		String winnings = null; //what the winnings will be
		
		//introduce-get input
		JOptionPane.showMessageDialog(null,"Welcome to Wheel of Fortune!");
		String userInput = JOptionPane.showInputDialog("Are you Ready to begin? (Enter y/n)");
	
		
		//starts wheel of fortune if user enters 'y'
		while(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
			if(wheelNumber == 1) {
				winnings = "$700.00";
			}
			else if(wheelNumber == 2) {
				winnings = "$200.00";
			}
			else if(wheelNumber == 3) {
				JOptionPane.showMessageDialog(null,"Sorry, You went Bankrupt");
				userInput = JOptionPane.showInputDialog("Would you like to play again?");				
				wheelNumber = rand.nextInt(5)+1; //where on the wheel you land on
			}	
			else if(wheelNumber == 4) {
				winnings = "$1,000.00";
			}
			else {
				winnings = "$600.00";
			}
			if (wheelNumber != 3) {
				JOptionPane.showMessageDialog(null, "You win " + winnings + "!");
				userInput = JOptionPane.showInputDialog("Would you like to play again?");				
				wheelNumber = rand.nextInt(5)+1; //where on the wheel you land on
			}
		}
		JOptionPane.showMessageDialog(null,"Goodbye!");
	}
}
