package itn120;

import javax.swing.JOptionPane;

public class DialogEx1 {

	public static void main(String[] args) {
		// practicing dialog boxes
		
		//create constant
		final String COURSE = "ITP120";
		//create variable
		String fName = null;
		
		//dialog box for input
		fName = JOptionPane.showInputDialog("Enter first name.");
	
		fName = fName.toUpperCase(); //changes the first name to all uppercase
	
		//message dialog box for output
		JOptionPane.showMessageDialog(null, fName + " - Welcome to week 2");
	
		
		
	}

}
