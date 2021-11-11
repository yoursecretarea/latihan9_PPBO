package aplikasiswing;

import javax.swing.*;
import java.awt.event.*;

public abstract class aplikasiswing implements Actionlistener{
	
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("I am a Jframe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(20, 30, 300, 100);
		
		JButton butt = new JButton("Click Me");
		frame.getContentPane().add(butt);
		
		prak3 app = new prak3 () {};
		
		app.label =  new JLabel ("Nama saya merupakan");
		app.label.setBounds(20, 40, 200, 20);
		frame.getContentPane().add(app.label);
		
		butt.addActionListener(app);
		frame.setVisible(true);		
	}
	public void actionPerformed(ActionEvent e){
		label.setText("Cindy Cantik Sekali");
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
	JLabel label;
}