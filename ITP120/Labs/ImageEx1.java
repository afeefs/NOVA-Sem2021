import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageEx1 {
 public static void main(String args[]) {
  JFrame frame = new JFrame();
  ImageIcon icon = new ImageIcon("horse1.jpg");
  JLabel label = new JLabel(icon);
  frame.add(label);
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.pack();
  frame.setVisible(true);
 }
}

//NOTE:  The image MUST be place in the ROOT folder.  The root in this example is Week2pm