package labs;

/*Afeefah MAnzoor
 * ITP120
 * Phase 1: Create arrays to hold the numbers 0-10 in Spanish and German
	In the main(), load the arrays with the following values, from .txt files
	Then output the entire contents of the arrays
 * Phase 2: Write a method to output the words the user wants to learn
	Pass the arrays to a method
	In the method
	Ask the user what language and what number they want to learn
	Output the word in the requested language
	Repeat the process, if the user wants to learn another word
 * 
 */

//import statements
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab7B {

	public static void main(String[] args) throws Exception{
		//define vars
		int index = 0;
		int cont = 0;
		
		// read data from txt file and load it into array
		//create Spanish file object 
		File spanish = new File("SpanishNum.txt");
		//create German file object 
		File german = new File("GermanNum.txt");
		//create French file object
		File french = new File("FrenchNum.txt");
		
		//create input scanner
		Scanner fInput1 =  new Scanner(spanish);
		Scanner fInput2 =  new Scanner(german);
		Scanner fInput3 =  new Scanner(french);
		
		//array to hold numbers
		String[] spanNum = new String[11];
		String[] germNum = new String[11];
		String[] frenchNum = new String[11];
		
		while(fInput1.hasNext()) {
			//scan file for input
			spanNum[index] = fInput1.nextLine();
			index++; 
		}
		fInput1.close(); //close spanish file
		index = 0;//reset index
			
		while(fInput2.hasNext()) {
			//scan file for input
			germNum[index] = fInput2.nextLine();
			index++; 
		}	
		fInput2.close(); //close german file
		index = 0; //reset index
		
		while(fInput3.hasNext()) {
			//scan file for input
			frenchNum[index] = fInput3.nextLine();
			index++; 
		}
		fInput3.close(); //close french file
		
		//output entire contents of arrays
		for(int i = 0; i < germNum.length; i++) {
			System.out.println(i + " Spanish: " + spanNum[i] + "\nGerman: " + germNum[i]+ "\nFrench: " + frenchNum[i]);
		}
		
		do { //loop to see if user wants to learn more than 1 number
			learn(germNum, spanNum, frenchNum);
			cont = JOptionPane.showConfirmDialog(null, "Do you want to learn another number?");
		}while( cont == 0);
		
	}
	
	public static void learn(String[] german, String[] spanish, String[] french) {
		//gets number and language the users want to learn and outputs it
		String num = null;
		int lnum = 0;
		int lang = 0;
		do { //valitade
			lnum = Integer.parseInt(JOptionPane.showInputDialog("What number would you like to learn? 0-10"));
		}while(lnum < 0 || lnum > 10);
		do { //validation
			lang = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 if you want to learn this in Spanish \nEnter 2 if you want to learn this in German \nEnter 3 if you want to learn it in French")); 		}while(lang < 1 || lang > 3);
		
		if(lang == 1){
			num = spanish[lnum];
			JOptionPane.showMessageDialog(null, "The number in Spanish is " + num);
		}
		else if (lang == 2) {
			num = german[lnum];
			JOptionPane.showMessageDialog(null, "The number in German is " + num);
		}
		else {
			num = french[lnum];
			JOptionPane.showMessageDialog(null, "The number in French is " + num);
		}
		
		
	}

}
