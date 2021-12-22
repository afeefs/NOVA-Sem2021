//Homework #1
//Afeefah Manzoor
//Date:
//This program is to calculate the total price of a trip, the hotel
//	the price of air fare, any discount will be added on as well 


//import dialog box
import javax.swing.JOptionPane;

public class HW1p1 {

	public static void main(String[] args) {
		//declare variables
		String destination = null; //where is the user going
		double airfare = 0.0; //how much are the plane fare
		double hotel = 0.0; //cost of hotel per night
		int nights = 0; //nights in hotel
		double other = 0.0; //other expenses
		boolean clubMember = false; //are they a travel club member
		final double CLUB_DISC = 0.1; //club member discount 
		double discAirfare = 0.0; //airfare after discount
		double discHotel = 0.0; //hotel after discount
		double totalCost = 0.0; //total cost without any discount
		
		// welcoming users
		JOptionPane.showMessageDialog(null, "Welcome to Trip Cost Calculator");
		
		//set/get user input
		destination = JOptionPane.showInputDialog("Where is your trip destination?");
		//validate and sets input as double or int
		airfare = Double.parseDouble(JOptionPane.showInputDialog("How much is the airfare?"));
		hotel = Double.parseDouble(JOptionPane.showInputDialog("How much is the hotel per night?"));
		nights = Integer.parseInt(JOptionPane.showInputDialog("How many nights are you staying?"));
		other = Double.parseDouble(JOptionPane.showInputDialog("How much are the other exspenses?"));
		
		String tempClubMember = JOptionPane.showInputDialog("Are you a Tavel Club Member? (Yes ore No)");
		tempClubMember = tempClubMember.toLowerCase();//makes the input to all lowercase
		//changes clubMember to true
		if (tempClubMember.compareTo("yes") == 0) {
			clubMember = true;
		}
		
		
		//sets discount price if club member
		if(clubMember) {
			discAirfare = (airfare - (airfare * CLUB_DISC)); 
			discHotel = (hotel - (hotel * CLUB_DISC));
		}
		
		//calculates total cost of trip
		if (clubMember) { //if member uses discount price
			totalCost = discAirfare + (discHotel * nights) + other;
		}
		else { //if not member price
			totalCost = airfare + (hotel * nights) + other;
		}
		
		
		//outputs into consul
		System.out.println("Desitnation: " + destination);
		System.out.printf("Airfare: $ %,.2f \n", airfare);
		System.out.printf("Hotel: $ %,.2f \n", hotel);
		System.out.println("Number of nights in hotel: " + nights);
		System.out.printf("Other expenses: $ %,.2f \n", other);
		System.out.println("Travel Club Member: " + tempClubMember);
		System.out.println("Club Discount: 10%");
		System.out.println();
		System.out.printf("Cost of Airfare BEFORE discount: $ %,.2f \n", airfare);
		System.out.printf("Cost of Airfare AFTER discount: $ %,.2f \n", discAirfare);
		System.out.printf("Cost of Hotel BEFORE discount: $ %,.2f \n",  hotel*nights);
		System.out.printf("Cost of Hotel AFTER discount: $ %,.2f \n", discHotel*nights);
		System.out.printf("Total trip cost: $ %,.2f \n", totalCost);
		
	}

}
