package week5;
/*
Afeefah Manzoor
Lab 4
Description: User chooses tickets 
and how many and program will out the tickets with the price
**/
import java.util.Scanner; //import Scanner

public class Lab4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //creating scanner object
		//defining and creating variables
		char userEvent = ' ';
		int ticketNumber = 0;
		int ticketPrice = 0;
		String name = null;
		String eventName = null;
		int totalTicketPrice = 0;
		char anotherUser = ' ';
		
		//loop for another user
		do {
			//asking user for name
			System.out.println("Welcome to Ticket Booth. Enter your name.");
			name = scan.nextLine();
		
			//loop to validate and get the Event from user
			do {
				System.out.println("Event Available: \n A: DC Auto Show= $49 \n B. NSO at the Kennedy Center- $90 \n C. Capital's Hockey Game- $150 \n Enter A, B or C.");
				userEvent = scan.next().charAt(0); //get input from user and places into variable
				userEvent = Character.toLowerCase(userEvent); //makes char into lowercase
			}while((userEvent != 'a') && (userEvent != 'b') && (userEvent != 'c'));
		
			//setting the Event name and price per each ticket 
			switch(userEvent){
			case 'a':
				eventName = "DC Auto Show";
				ticketPrice = 49;
				break;
			case 'b':
				eventName = "NSO at the Kennedy Center";
				ticketPrice = 90;
				break;
			case 'c':
				eventName = "Capital's Hockey Game";
				ticketPrice = 150;
				break;
			}
		
			System.out.println("You have selected " + eventName +" each ticket costs $" + ticketPrice);
			//asking user for how many tickets and placing into variable
			System.out.println("How many Tickets would you like?");
			ticketNumber = scan.nextInt();
		
			//outputting price and tickets
			for(int i = 0; i < ticketNumber; i++){
				System.out.println(eventName + " ticket for " + name);
				totalTicketPrice += ticketPrice;
			}
			System.out.println("Your total is $" + totalTicketPrice);
			
			//asking if there is another user 
			do {
				System.out.println("Is there another customer? \n Enter y or n.");
				anotherUser = scan.next().charAt(0); //get input from user and places into variable
				anotherUser = Character.toLowerCase(anotherUser); //makes char into lowercase
			}while((anotherUser != 'y') && (anotherUser != 'n'));
		}while(anotherUser == 'y');
	}

}
