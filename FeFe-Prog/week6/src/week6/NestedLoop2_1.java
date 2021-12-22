package week6;

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOption.Pane;
import javax.swing.JOptionPane;

public class NestedLoop2_1 {

	public static void main(String[] args) {
		// secret number guessing game
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int secretNum = 0;
		int guess = 0;
		int count = 0;
		int cont = 0;
		
		do {
			count = 0;
			System.out.println("Welcome to SecretNumber Guessing Game!");
			secretNum =  rand.nextInt(100) + 1;
			do {
				System.out.println("Guess the secret Number. 1 - 100");
				guess = scan.nextInt();
			
				if(guess > secretNum){
					System.out.println("Too HIGH- guess again");
				}
				else if(guess < secretNum){
					System.out.println("Too LOW- guess again");
				}
				else {
					System.out.println("Correct!");
				}
				count++; 	
			}while(guess != secretNum);
			System.out.println("The number is " + secretNum + " and it took " + count + " tries.");
			cont = JOptionPane.showConfirmDialog(null, "Do you want to play again?");
		}while(cont == 0);
	}
}
