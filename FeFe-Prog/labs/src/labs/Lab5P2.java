package labs;

import javax.swing.JOptionPane;

public class Lab5P2 {
	public int bet(int bet){
		do {
			bet = Integer.parseInt(JOptionPane.showInputDialog("Error: BET BETWEEN 1 AND 100 /N How much will you like yo bet?"));
		}while(bet < 1 || bet > 100);
		return bet;
	}
}
