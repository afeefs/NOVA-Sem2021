package homework2;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageEx {
	 public static void main(String args[]) {
	  JFrame frame = new JFrame();
	  //ImageIcon icon = new ImageIcon("horse1.jpg");
	  //JLabel label = new JLabel(icon);
	  //frame.add(label);
	  //frame.setDefaultCloseOperation
	   //      (JFrame.EXIT_ON_CLOSE);
	  //frame.pack();
	 // frame.setVisible(true);
	  ImageIcon image = new ImageIcon(download.jfif);
	  JLabel label2 = new JLabel(image);
	  frame.add(label2);
	  frame.setDefaultCloseOperation
	         (JFrame.EXIT_ON_CLOSE);
	  frame.pack();
	  frame.setVisible(true);
	 
	}

}
