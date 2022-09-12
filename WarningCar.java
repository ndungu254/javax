import javax.swing.*;
import java.awt.*;

public class WarningCar extends JFrame{

	private JPanel warningP;
	private JLabel textL, iconL;
	
	public WarningCar(){
		
		Container pane = getContentPane();
		warningP = new JPanel(null);
		warningP.setBackground(Color.WHITE);
		
		ImageIcon warningImage = new ImageIcon("../images/warning_icon.GIF");
		iconL = new JLabel(warningImage);
		iconL.setBounds(20, 35, 50, 50);
		warningP.add(iconL);
		
		textL = new JLabel("");
		textL.setText("Click a Car");
		textL.setFont(new Font("Serif", Font.BOLD, 15));
		textL.setForeground(Color.RED);
		textL.setBounds(80, 48, 200, 20);
		warningP.add(textL);
		pane.add(warningP);
	}
}