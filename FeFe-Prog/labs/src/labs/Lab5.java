package labs;
/*Afeefah Manzoor
 * ITP120 Lab 5
 * 3/4/2021
 * Description: The user will be asked to place a bet between $10-$100 
 */
import javax.swing.JOptionPane;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Lab5 {

	public static void main(String[] args) throws IOException {
		//intializing variables
		int betAmount = 0;
		String output = null;
		
		//creating file path
		Path fileName = Path.of("bets.txt");
		
		//making lab5p2 an object
		Lab5P2 lab5 = new Lab5P2();
		
		//welcome user
		JOptionPane.showMessageDialog(null, "Welcome to betting agency.");
		
		//asking user for bet
		betAmount = Integer.parseInt(JOptionPane.showInputDialog("How much will you like yo bet? /n Enter 1-100."));
		if(betAmount < 1 || betAmount > 100) {
			betAmount = lab5.bet(betAmount);
		}
		
		output = "Thank you for your bet of $" + betAmount;
		Files.writeString(fileName, output);
		JOptionPane.showMessageDialog(null, output);
	}
	

}
