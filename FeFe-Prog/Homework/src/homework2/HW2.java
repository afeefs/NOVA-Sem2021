package homework2;
/*Afeefah Manzoor
 * Date: 2/25/2021
 * Description: Homework 2- Where in the World am I? Game. 
 * 				Asks the user 3 questions and tells the user where they are
 */
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics; 
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;

public class HW2{

	public static void main(String[] args){
		//variables
		int dc = 0; //is the user in DC
		int college = 0; //is the user in college?
		int house = 0; //is the user in a house?
		int cont = 0; //if user wants to play again;  0= yes
		int counter = 0; //counts how many times the game is played
		
		//welcome message
		JOptionPane.showMessageDialog(null, "Welcome to Where in the World am I? Game \n Let's Play");
		do {
			//getting inputs from user
			dc = JOptionPane.showConfirmDialog(null, "Are you in DC?");
			college = JOptionPane.showConfirmDialog(null,"Are you at college?");
			house = JOptionPane.showConfirmDialog(null, "Are you in a house?");
		
			//decides where the user is
			if(dc == 0 && house == 0){ //checks to see if user is at the white house
				drawImage("whitehouse.jpg"); //draws specifically the white house image
				JOptionPane.showMessageDialog(null, "Oh, I see, you are in the White House");
			}
			else if(dc != 0 || college == 0 ) { //checks if user is in uva
				drawImage("uva.jpg"); ///draws uva image
				JOptionPane.showMessageDialog(null, "Oh, I see, you are at UVA");
			}
			else if(dc == 0 && house != 0) { //checks if user is at the lincoln
				drawImage("lincoln.jpg"); //draws lincoln memorial
				JOptionPane.showMessageDialog(null, "Oh, I see, you are at the Lincoln Memorial");
			}
		
			//counter
			counter ++;
			
			//ask the user if they want to play again
			cont = JOptionPane.showConfirmDialog(null, "DO you want to play again?");
		}while(cont == 0);
		
		///outputs how many times the user played
		JOptionPane.showMessageDialog(null, "You have played " + counter + " times");
	}	
	
	
	//method to output the image
	
	public static void drawImage(String img){
		/* UVA Image = uva.jpg
		 * White House = whitehouse.jpg
		 * Lincoln mem. = lincoln.jpg 
		 */
		
		
		JFrame frame = new JFrame("main"); //creates a frame for the image
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the image when the user clicks the 'X'
		JPanel panel = (JPanel)frame.getContentPane(); //figures out the window/panel the image will be on
		JLabel label = new JLabel (); //creates a label for the image
		label.setIcon(new ImageIcon(img)); ///sets the image ad the label
		panel.add(label); //adds image to the panel/window
		frame.setLocation(0, 0); //sets the location to the top left corner of the window
		frame.pack();
		frame.setVisible(true);//makes the image visible
	
		
	}
}
