import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// practicing switch case 
		 Scanner in = new Scanner(System.in);
		char game = 'a';
		
		System.out.println("Select a game \n" //\n = new line
				+ "a - Poker \n"
				+ "b - Black Jack \n"
				+ "c - Roulette \n"
				+ "d - Craps");
		//scanner a char datatype 
		game = in.next().charAt(0);
		System.out.println(game);
		
		
		
		switch(game) { //evalaute 1 single variable
			case 'a': System.out.println("Poker has a minimum bet of $20.00");
				break;
			case 'b':
				break;
			case 'c':
				break;
			case 'd':
				break;
			default :
		}
		
	}

}
