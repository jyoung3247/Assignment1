package mainpackage;



import java.awt.*;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;





public class BoxComponent extends JComponent {
	private Shape rectangle;
	
	public BoxComponent() {
		super();
		rectangle = new Rectangle2D.Double(100, 100, 50, 50);
		
		
		
	}
	public void paintComponent(Graphics g) {

		
	}
	
}

