package week5;

import javax.swing.JOptionPane;

public class AndOrNotEx1 {

	public static void main(String[] args) {
		//praccticing counpound conditions
		double gpa = 3.6;
		int credits = 30;
		int degree = 0;
		
		degree = JOptionPane.showConfirmDialog(null, "Are you a enrolled in a degree program at NVCC?");
		
		if((gpa >= 3.5 ) && (credits >= 15) && (degree == 0)) {
			System.out.println("Dean's Lists");
		}
		else {
			System.out.println("Better Luck Next Semester");
		}
		
		
		//OR logic ||
		
		boolean v = false; //visa card
		boolean mc = true; //mastercard
		boolean a = false; //american express
		
		if (v || mc || a) {
			System.out.println("THank you");
		}
		else {
			System.out.println("We do not accept that payment.");
		}
		
		

	}

}
