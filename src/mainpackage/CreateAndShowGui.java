package mainpackage;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CreateAndShowGui extends JFrame {
	private BoxComponent thebox;
	
	public CreateAndShowGui(String title) {
		Container contpane = getContentPane();
		JPanel mainpanel = new JPanel();
		thebox = new BoxComponent();
		mainpanel.add(thebox);
		contpane.add(mainpanel);
		
		this.setTitle(title);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		CreateAndShowGui window = new CreateAndShowGui("Moving the box");

	}

}
