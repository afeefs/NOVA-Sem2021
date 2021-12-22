import java.io.File;
import java.util.Scanner; 
import javax.swing.JOptionPane; 
	
public class DannyHW4 {
	
		public static void main(String[] args) throws Exception {
			// 
			int index = 0; 
			String userIn = null; 
			//create a file object 
			File file1 = new File("airports.txt");
			File file2 = new File("IATAcodes.txt");

			//create a file scanner 
			Scanner fIn1 = new Scanner(file1);
			Scanner fIn2 = new Scanner(file2);
			
			// create an array to hold data 
			String [] destinations = new String [31];
			String [] codes = new String [31];
			while (fIn1.hasNext())
			{
			    destinations[index] = fIn1.nextLine();
			    index++;
			}
			fIn1.close();
			index =0; 
			while (fIn2.hasNext())
			{
			    codes[index] = fIn2.nextLine();
			    index++;
			}
			fIn2.close();
			userIn = JOptionPane.showInputDialog("Enter an IATA airport code");
			findAirport(userIn, destinations, codes);
			
		}
		public static String findAirport (String userIn1, String []locations, String [] iata) {
			
			String airportName = null;
			for (int i = 0; i < iata.length; i++) {
				if (iata[i].equalsIgnoreCase(userIn1)) {
					airportName = locations[i];
					JOptionPane.showMessageDialog(null, airportName);
				}
			}
			
			return airportName;
		}

	}

