package week6;

import java.util.Scanner;
public class arrayPractice {
	public static void main(String[] args) {
		// TO teach the spanish months
		int index = 0;
		int arraySize = 12;
		
		Scanner scan = new Scanner(System.in);
		//String[] sMonth = new String[arraySize];
		String[] sMonth = {"Enero", "Febreo", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto","Septembre","Octubre","Noviembre", "Diciembre"};
		
		do {
		System.out.println("What month do you want to translate? Enter the month number 1-12");
		index = scan.nextInt();
		}while(index > 12 || index < 1);
		
		
		System.out.println("That translate to " + sMonth[index-1]);
	
		//invoke display array method
		MyMethods2.displayArray(sMonth);
	}

}
