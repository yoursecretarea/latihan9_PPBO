package aplikasiswing;

import javax.swing.*;
import java.awt.event.*;

public abstract class Swing implements ActionListener{
	
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("I am a JFrame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(20, 30, 300, 100);
		frame.getContentPane().setLayout(null);
		
		JButton butt = new JButton("Click Me");
		frame.getContentPane().add(butt);
		butt.setBounds(20, 20, 200, 20);
		
		Swing app = new Swing() {};
		
		app.label =  new JLabel ("0 clicks");
		app.label.setBounds(20, 40, 200, 20);
		frame.getContentPane().add(app.label);
		
		butt.addActionListener(app);
		frame.setVisible(true);		
	}
	public void actionPerformed(ActionEvent e){
		clickCount++;
		label.setText("Clicks= "+clickCount);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
	int clickCount=0;
	JLabel label;
}