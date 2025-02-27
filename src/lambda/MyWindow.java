package lambda;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow {
	public static void main (String[] args) {
		
		JFrame frame = new JFrame("My Window");
		
		JButton button =new JButton("Click Me !!");
		
		frame.add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}

}
