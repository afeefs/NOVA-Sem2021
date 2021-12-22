package week5;
import java.util.Random;

public class DoWhile1 {
	public static void main(String[] args) {
		// do-while loop: Post-test
		
		Random rand = new Random();
		int dice1 = 0;
		int dice2 = 0;
		int count = 0;
		
		do {
			dice1 = rand.nextInt(6)+1;
			dice2 = rand.nextInt(6)+1;
			System.out.print(dice1 + " ");
			System.out.println(dice2);
			count++;
		}while(dice1 != dice2);
		
		System.out.println("It took you " + count + " rolls to get doubles.");
		
	}

}
