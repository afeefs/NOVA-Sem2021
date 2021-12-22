import java.util.Scanner;

public class MilesArray {

	public static void main(String[] args) {
		//calculate the average miles driven for 1 day
		int numCars = 0;
		Scanner scan = new Scanner(System.in);
		int total= 0;
		
		System.out.println("How many vehicles were driven?");
		numCars = scan.nextInt();
		
		//create array object
		int[] miles = new int[numCars];
		
		for(int i= 0; i < miles.length; i++){
			System.out.println("How many miles were driven on car " + (i+1));
			miles[i] = scan.nextInt();
			total += miles[i];
		}
		System.out.println("The total miles driven totay is: " + total);
		total /= miles.length;
		
		System.out.println("The average miles driven is: " + total);
		
	}

}
