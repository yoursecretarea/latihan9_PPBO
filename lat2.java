import javax.swing.*;

public class lat2{ 


	public static void main(String[] args) {
		JFrame f = new JFrame ("title");
			JPanel p = new JPanel();
			JButton b = new JButton("press me");
			
			f.setSize(400, 400);
			
			p.add(b);
			f.setContentPane(p);
			
			f.show();
	}
}			
	