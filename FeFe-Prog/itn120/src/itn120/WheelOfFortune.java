//Afeefah Manzoor
//Lab 2: Wheel of fortune
//1/28/2021

package itn120;

//import statments
import java.util.Random;
import java.util.Scanner;

public class WheelOfFortune {

	public static void main(String[] args) {
		//create objects
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		//create variable
		int wheelNumber = rand.nextInt(5)+1; //where on the wheel you land on
		String winnings = null; //what the winnings will be
		String userInput = null;
		
		//introduce-get input
		System.out.println("Welcome to Wheel of Fortune!");
		System.out.println("Are you Ready to begin? (Enter y/n)");
		userInput = scan.nextLine();
		
		//starts wheel of fortune if user enters 'y'
		while(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
			if(wheelNumber == 1) {
				winnings = "$700.00";
			}
			else if(wheelNumber == 2) {
				winnings = "$200.00";
			}
			else if(wheelNumber == 3) {
				winnings = "BANKRUPT";
			}	
			else if(wheelNumber == 4) {
				winnings = "$1,000.00";
			}
			else {
				winnings = "$600.00";
			}
			System.out.println("You win " + winnings + "!");
			System.out.println("Do you want to play again? (Enter y/n)");
			userInput = scan.nextLine();
			wheelNumber = rand.nextInt(5)+1; //where on the wheel you add on
		}
		System.out.println("Goodbye!");
	}

}
