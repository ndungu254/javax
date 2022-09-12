import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Rental{ 

  private static final int WIDTH = 1000;
  private static final int HEIGHT = 10000;

//////////////////////////////////////////////////////////MAIN//////////////////////////////////////////
  public static void main(String[] args) {

    JFrame frame = new RentalView();
    ImageIcon img = new ImageIcon("../images/logo.GIF");
    frame.setIconImage(img.getImage());
    frame.setTitle("Rancy's Car Rental v.01");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(WIDTH, HEIGHT);
    frame.setVisible(true);
    frame.setResizable(false);
   }
}