
import javax.swing.JOptionPane;

public class ParallelArray2_2 {

	public static void main(String[] args) {
		String userIn = null;
		int index = 0;
		String[] acro = {"BTW", "NP", "GG", "LOL", "OMW"};
		String[] meaning = {"By The Way", "No Problem","Good Game","Laughing Out Loud","On My Way"};
		
		userIn = JOptionPane.showInputDialog("Enter Acronym. ");
		
		while((index < acro.length) &&(!userIn.equalsIgnoreCase(acro[index]))){
			index++;
		}
		
		if(index < acro.length)
			System.out.println("The meaning of " + acro[index] + " is " + meaning[index]);
		else
			System.out.println("We do not have that aronym in our system.");
			
	}

}
