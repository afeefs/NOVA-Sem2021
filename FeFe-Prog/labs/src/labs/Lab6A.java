package labs;
/*Afeefah Manzoor
 * 3/23/2021
 * Description: holds and returns license plate numbers
 */

//import statements
import javax.swing.JOptionPane;

public class Lab6A {

	public static void main(String[] args) {
		// defining variables 
		String [] plateNum = {"J934FG","D243FEW","234GDE","23FR24","KFS543"};
		String userInput = null;
		int index = 0; 
		
		//prints whole array
		for(int i = 0; i < plateNum.length; i++){
			  System.out.println("the plate number is " + plateNum[i]); 
	     }
		
		userInput = JOptionPane.showInputDialog("What License Plate Number are you looking for?");
		index = Lab6Ap2.find1(userInput, plateNum); //calling the find1 method in the other class
		
	   
		// code in phase 2 to tell the user we found the plate number
		if(index >= 0) { 
		 	System.out.println("The plate number was found.");	
	    }
	    else {
	    	System.out.println("Sorry, the plate was not found.");
	    }
	}
}
