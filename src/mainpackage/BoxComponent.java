package mainpackage;



import java.awt.*;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;





public class BoxComponent extends JComponent {
	private Shape rectangle;
	
	public BoxComponent() {
		super();
		rectangle = new Rectangle2D.Double(100, 100, 50, 50);
		repaint();
		
		
		
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.GREEN);
		g2d.fill(rectangle);
		
	}
	
}

