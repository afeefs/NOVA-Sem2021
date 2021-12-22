import java.util.Scanner;
import java.lang.Math;

public class BMIv1 {
	
	public static void main(String[] args) {
		//BMI Calculator
		
		//declare variables
		int weight = 0;//in pounds
		int height = 0; //in inches
		double bmi = 0.0; //bmi
		
		//create scanner object
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to BMI Calculator!");
		
		//get user input
		System.out.println("Enter your weight in pounds. ");
		weight = scan.nextInt();
		
		System.out.println("Enter your height in inches. ");
		height = scan.nextInt();

		//calculate BMI
		bmi = (703 * weight) / Math.pow(height, 2); 
		
		//output the bmi
		System.out.println("Your BMI is " + bmi);
		
	}
	
}
