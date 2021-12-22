package week5;

import java.util.Scanner;

public class ForLoops1 {

	public static void main(String[] args) {
		// for loops- counting loop
		int numTimes = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many coupons do you want?");
		numTimes = scan.nextInt();
		
		for(int i = 0; i < numTimes; i++){
			System.out.println("25% on Thursdays at Tim's Taco");
		}
	}

}
