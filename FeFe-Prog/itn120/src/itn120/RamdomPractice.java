package itn120;

import java.util.Random;

public class RamdomPractice {

	public static void main(String[] args) {
		// practice randome numbers, printf, and 

		//create new random object
		Random rand = new Random();
		
		//declare variables
		int dice = 0;
		int pay = 100;
		double amount = 545.38064;
		
		//type casting into to double
		//amount = pay; 
		
		//type cast double to int
		pay = (int)amount; 
		
		//generate random number
		dice = rand.nextInt(6) + 1; //6 possibilities starting with 1
		
		
		System.out.println(dice);
		
		//printf to format
		amount = 12490733.25234;
		System.out.printf("%,.2f \n", amount);
		
	}

}
