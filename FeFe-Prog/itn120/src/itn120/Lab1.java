//Lab 1
//Afeefah Manzoor
//Date:1/12/2021

package itn120;
//importing from library
import javax.swing.JOptionPane;
import java.util.Random;

public class Lab1 {

	public static void main(String[] args) {
		//welcome statement
		JOptionPane.showMessageDialog(null, "This is Afeefah's Lab 1");
		
		//setting variables
		String fName = JOptionPane.showInputDialog("Enter a first name.");
		String lName = JOptionPane.showInputDialog("Enter a last name.");
		String adj = JOptionPane.showInputDialog("Enter an adjective.");
		String place = JOptionPane.showInputDialog("Enter a place.");
		//setting num to random number
		int num = (int)(Math.random() * 101);
		
		//making name to uppercase
		fName = fName.toUpperCase();
		lName = lName.toUpperCase();
		
		//output
		JOptionPane.showMessageDialog(null, fName + " " + lName + " say, There are " + num + " " + adj + " people in the backyard.");
	}

}
