package week14;

import javax.swing.JOptionPane;

public class TestPlayer {

	public static void main(String[] args) {
		//vars
		String playerName = null;
		String playerPower = null;
		// create an array to hold player objects
		Player[] playerArr = new Player[3];
		
		//loop to create and load player objects
		for(int i = 0; i < playerArr.length; i++){
			playerArr[i] = new Player("Dragon"+ (i+1),50, "PC", "Fire"); //sets each player
			playerName = JOptionPane.showInputDialog("What is your name?");
			playerPower = JOptionPane.showInputDialog("What is your power?");
			playerArr[i].setName(playerName);
			playerArr[i].setPower(playerPower);
			playerArr[i].displayPlayer();//displays each player
		}
		
	}

}
