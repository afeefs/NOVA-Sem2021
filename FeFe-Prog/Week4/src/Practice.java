import javax.swing.JOptionPane;

public class Practice {

	public static void main(String[] args) {
		// itp120 practice
		
		int answer1 = 0;
		String answer2 = null;
		int saleAmt = 0;
		String answer = null;
		int points = 0;
		
		answer1 = JOptionPane.showConfirmDialog(null, "Confirm that you are of 18 years of age.");
		System.out.println(answer1);
		
		answer2 = JOptionPane.showInputDialog("Enter the Sale Price.");
		saleAmt = Integer.parseInt(answer2);
		
		System.out.println(saleAmt);
		
		
		answer = JOptionPane.showInputDialog("What is the capital of California?");
		//string comparison
		if(answer.equalsIgnoreCase("Sacramento")) {
			System.out.println("Correct");
			points ++;
		}
		else {
			System.out.println("Wrong Answer");
		}
		
		
		
	}

}
