package week5;
import java.util.Scanner;

public class For1_2 {

	public static void main(String[] args) {
		// loop to distribute $20 bills
		int wAmt = 0;
		int numTimes = 0;
		final int MAX = 500;
		final int MIN = 20;
		
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("Enter withdraw amount. \n The Maximum withdrawal is $500 and Minimum  is $20. \n Must be multiple of 20. \n Enter 0 to Exit");
			wAmt = in.nextInt();
		}while((wAmt < MIN) && (wAmt != 0) || (wAmt > MAX));
		
		numTimes = wAmt / 20;
		
		for(int i =0; i < numTimes; i++){
			System.out.println("$20");
		}
		
		
	}

}
