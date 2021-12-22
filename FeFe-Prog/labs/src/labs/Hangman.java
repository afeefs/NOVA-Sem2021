package labs;
/*Afeefah Manzoor
 * 4/13/2021
 * ITP120: A Hangman game where the user can have up to 5 wrong guesses to guess the word
 */


//import statemnts
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Hangman {

	public static void main(String[] args) {
		//vars
		String word = "april"; //the world you are using
		String userIn = null; //the input we will receive
		int incorrectCnt = 0; //counter for incorrect guesses
		int correctCnt = 0; //counter for correct guesses
		String[] userWord = new String[word.length()]; //array to guess word
		int index = 0; //to find index of the letter
		
		//welcome user to game
		JOptionPane.showMessageDialog(null,"Welcome to Hangman. Let's Start Guessing");
		Arrays.fill(userWord, "-"); //filled userWord array w/ -
		System.out.println(Arrays.toString(userWord)); //outputs array filled with dashes
		//gets letter from user, and checks to see if it is in the word and will cont to loop until the user guesses the word or guesses wrong 5 times
		do {
			userIn = JOptionPane.showInputDialog("This word had " + word.length() + " letters. What is your Guess?"); //gets user's letter guess
			//find character
			index = word.indexOf(userIn); //looks for the index in the word
			System.out.println(index); //outputs the index
			
			//checks to see if the letter in the word
			if(index >= 0){
				userWord[index] = userIn; //puts letter in correct spot in the array word
				System.out.println(Arrays.deepToString(userWord)); //outputs the array with the letter filled in
				correctCnt++; //increases correct counter
			}
			else {
				incorrectCnt++; //increases incorrect counter
				System.out.println("Sorry, that letter is not in this word."); //tells the user that the letter is not in the word
			}
		}while(incorrectCnt != 5 && correctCnt != word.length());
		
		//checks the to see if the user won or lost
		if(correctCnt == word.length()){ //if the correct counter == the word length, the user wins
			JOptionPane.showMessageDialog(null, "Congrats! you won the game! \nThe word is " + word);
		}
		else {//if the user guessed wrong 5 times, the user lost
			JOptionPane.showMessageDialog(null, "Sorry, You lost. \nThe word was " + word);
		}
	}

}
