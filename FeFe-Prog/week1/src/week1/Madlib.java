package week1;

import java.util.Scanner;

public class Madlib {

	public static void main(String[] args) {
		// Program to play madlib game
		
		//declare variables
		String noun1 = null;
		String place = null;
		String liquid = null;
		String bodyPart = null;
		
		//create a Scanner Object
		Scanner in1 = new Scanner(System.in);
		
		System.out.println("Welcome to Madlib120. I will ask you a few questions and tell you a funny story.");
		
		//prompt and input from the user
		System.out.println("Who is your favortie character? ");
		noun1 = in1.nextLine();
		System.out.println("What is your favorite place? ");
		place = in1.nextLine();
		System.out.println("What do you like to drink? ");
		liquid = in1.nextLine();
		System.out.println("Name an animal body part. ");
		bodyPart = in1.nextLine();
		
		//Outputting story
		System.out.println("Jack and " + noun1);
		System.out.println("Went up to " + place);
		System.out.println("Fetch a pail of " + liquid);
		System.out.println("Jack fell and broke his " + bodyPart);
		System.out.println("And " + noun1 + " came tumbling after.");
		
	}

}
