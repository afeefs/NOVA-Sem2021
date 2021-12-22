import java.util.Scanner;

public class ParallelArray2_1 {

	public static void main(String[] args) {
		// create and load search parallel arrays
		//create and set varaibles
		Scanner scan = new Scanner(System.in);
		int userIn = 0;
		int index = 0;
		int[] cNum = {5, 7, 15, 23, 25, 34};
		String[] cName = {"NBC", "CNN","History Channel","Now TV","Food Network","Animal Planet"};
	
		System.out.println("Channel guide:");
		for(int i = 0; i < cNum.length; i++) {
			System.out.println(cName[i] + " is on channel " + cNum[i]);
		}
		System.out.println("What channel do you want to watch?");
		userIn = scan.nextInt();
		
		index = java.util.Arrays.binarySearch(cNum, userIn);
		if(index >= 0) {
			System.out.println("Currently watching " + cName[index]);
		}
		else {
			System.out.println("You are not suscribed to that channel.");
		}
		
		
		
		
	}

}
