
import java.util.Scanner;
public class ConsumingCharacters {

	public static void main(String[] args) {
		// consuming characters

		int age = 0;
		String name = null;

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your age. ");
		age = in.nextInt();
		
		//consume the return character
		in.nextLine();
		
		System.out.println("Enter your name ");
		name = in.nextLine();
		
		
	}

}
