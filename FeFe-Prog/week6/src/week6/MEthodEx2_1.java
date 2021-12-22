package week6;

import java.util.Scanner;

public class MEthodEx2_1 {

	public static void main(String[] args) {
		// method pracctice - diplayMenu()
		int choice = 0;
		//invoke method
		choice = displayMenu();
		System.out.println(choice);

	}//end of main
	
	//where you code method
	public static int displayMenu() {
		int choice1 = 0;
		Scanner s1 =new Scanner(System.in);
		System.out.println("Welcome to World of LAnguages. Choose a language to practice \n"
				+ "1- Spanish \n"
				+ "2- French \n"
				+ "3 -German \n"
				+ "4 - Latin \n" );
		choice1= s1.nextInt();
		return choice1;
	}
	
}
