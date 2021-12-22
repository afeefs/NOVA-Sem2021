package homework2;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class BasicDraw {
  public static void main(String[] args) {
    new BasicDraw();
  }

  BasicDraw() {
    JFrame frame = new JFrame();

    frame.add(new MyComponent());

    frame.setSize(300, 300);
    frame.setVisible(true);
  }

}

class MyComponent extends JComponent {
  public void paint(Graphics g) {

    ImageIcon icon = new ImageIcon("uva1.jpg");
    int x = 0;
    int y = 100;
    icon.paintIcon(this, g, x, y);
  }

}
