
package week6;

public class MyMethods2 {
	//UNICODE holds values for all characters, including emojis. 
	//Here is some simple code that will display a panda emoji.
	//You can change the UNICODE to display an emoji you want in your program.
	//See line 12

	  public static void diplayEmoji() {
	    String bear = "🐻";

	    // If the previous line doesn't show up in your editor,
	    // you can comment it out and use this declaration instead: 
	    // String bear = "\ud83d\udc3b";

	    int bearCodepoint = bear.codePointAt(bear.offsetByCodePoints(0, 0));
	    int mysteryAnimalCodepoint = bearCodepoint + 1;

	    char mysteryAnimal[] = {Character.highSurrogate(mysteryAnimalCodepoint),
	                            Character.lowSurrogate(mysteryAnimalCodepoint)};
	    System.out.println("The NOVA Zoo's latest attraction: "
	                      + String.valueOf(mysteryAnimal));
	 }
	  
	  //output the entire array using a for loop to print out the array
	  public static void displayArray(String[] array1){
		  for(int i = 0; i < array1.length; i++){
			  System.out.println(array1[i]);
		  }
	  }  
}

