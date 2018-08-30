package mainpackage;



import java.awt.*;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;





public class BoxComponent extends JComponent {
	private Shape rectangle;
	private int x = 100;
	private int y = 100;
	private int step = 2;
	private int diameter = 25;
	
	
	public BoxComponent() {
		super();
		rectangle = new Rectangle2D.Double(x, y, diameter, diameter);
		repaint();
	}
	
	//Methods to move the box
	public void MoveBoxUp() {
		this.y = y - step;
		rectangle = new Rectangle2D.Double(x, y, diameter, diameter);
		repaint();
	}
	public void MoveBoxDown() {
		this.y = y + step;
		rectangle = new Rectangle2D.Double(x, y, diameter, diameter);
		repaint();
	}
	public void MoveBoxLeft() {
		this.x = x - step;
		rectangle = new Rectangle2D.Double(x, y, diameter, diameter);
		repaint();
	}
	public void MoveBoxRight() {
		this.x = x + step;
		rectangle = new Rectangle2D.Double(x, y, diameter, diameter);
		repaint();
	}
	
	//Get current location of box
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

