/*Afeefah Manzoor
 * 4/15/2021
 * Descr: Airport IATA Code Lookup- User will enter 
 * 		the IATA code and the name of the airport will be returned
 * 		The program will also ask the user what region they are from.
 */

//imports
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

public class Homework4 {
	JFrame f;
	
	public static void main(String[] args) throws Exception{
		//vars
		int index = 0;//index for placing txt file conents into array
		String userCode = null; //string to hold user code
		String airportName = null; //string to hold the name according to the code the user entered
		int cont = 0;
		String[] airports = new String[30]; //new array string
		String[] iata = new String[30]; //new array string
		File f1 = new File("airports.txt"); //makes object out of airports. txt
		Scanner fIn1 = new Scanner(f1); //will scan the txt file
		
		//takes each line and places it in corresponding place in the array & 
		//	pulling data from txt file into arrays
		while(fIn1.hasNext()){
			airports[index] = fIn1.nextLine();
			index++;
		}
		fIn1.close();//closes file
		index = 0;//resets index
		//pulling data from txt file into arrays
		File f2 = new File("IATAcodes.txt"); //makes object out of IATAcodes txt
		Scanner fIn2 = new Scanner(f2); //will scan the txt file
		//takes each line and places it in corresponding place in the array
		while(fIn2.hasNext()){
			iata[index] = fIn2.nextLine();
			index++;
		}
		fIn2.close();//closes file
		
		//loop to see if user wants to look up another code
		do {
			//get the IATA code from user and validate
			do{
					userCode = JOptionPane.showInputDialog("Enter the 3 letter IATA Code");
			}while(userCode.length() != 3 || !userCode.matches("^[a-zA-Z]*$")); //makes sure the user enters only 3 letters
			airportName = airportLookUp(userCode, airports, iata); //calls the airport name lookup method and holds the returned name in a string
			JOptionPane.showMessageDialog(null, "The name of the airport of " + userCode.toUpperCase() + "\n is " +airportName); //ouputs the name to the user
			cont = JOptionPane.showConfirmDialog(null, "Would you like to look up another code?"); //asks user if they want to look up another code to loop or not
		}while(cont == 0);//if user clicks yes, it loops

		
		Homework4 hw = new Homework4();//creating object of class to call the comboBox method
		hw.ComboBox();
 		
	}
	
	//method that looks up the airport name by it's iata code
	public static String airportLookUp(String code, String[] airports, String[] iata){
		//method to look for airport name according to the code the user entered
		String airportName = null; //var to hold airport
		for(int i = 0; i < iata.length; i++){ //loops through the IATA code array
			if(code.equalsIgnoreCase(iata[i])){ //compares the codes ignoring the case
				airportName = airports[i]; //places airport name in the string variable
				break;//breaks out of loop
			}
			else
				airportName = "Not Found";
		}
		return airportName;
	}
	
	//method to make  combo box
	public void ComboBox(){
		f = new JFrame("Select Region"); //creates the frame for the combo box
		final JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400,100);JButton b = new JButton("Submit");
		b.setBounds(70, 150, 75, 20);
		String region[]={"Select Region","North East","Mid Atlantic","South East","South","Central", "North West", "South West"};
		final JComboBox cb = new JComboBox(region);
		cb.setBounds(70,90,150,20);
		f.add(cb); 
		f.add(label);
		f.add(b);
		f.setLayout(null);
		f.setSize(350,350);
		f.setVisible(true);
		b.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				String data = "Region Selected: " 
			+ cb.getItemAt(cb.getSelectedIndex()); 
				label.setText(data);}});
		
	}

}
