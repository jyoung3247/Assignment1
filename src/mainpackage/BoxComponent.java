package mainpackage;



import java.awt.*;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;





public class BoxComponent extends JComponent {
	private Shape rectangle;
	private int x = 100;
	private int y = 100;
	
	public BoxComponent(int x, int y, int width, int height) {
		super();
		rectangle = new Rectangle2D.Double(x, y, width, height);
		repaint();
	}
	
	public void moveBox(int x, int y, int width, int height) {
		rectangle = new Rectangle2D.Double(x, y, width, height);
		this.x = x;
		this.y = y;
		repaint();
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.GREEN);
		g2d.fill(rectangle);
		
	}
	
}

