package week5;

import javax.swing.JOptionPane;

public class While1 {
	public static void main(String[] args) {
		//while loop example
		//MFA 
		String mfaCode = "HMDY";
		String inCode = null;
		
		inCode = JOptionPane.showInputDialog("Enter the text code: ");
		
		while(!inCode.equalsIgnoreCase(mfaCode)) {
			inCode = JOptionPane.showInputDialog("ERROR- Re-Enter Text code: ");
		}
		System.out.println("Your account has been verified");
		
	}
	
}
