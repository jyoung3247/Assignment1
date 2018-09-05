package mainpackage;



import java.awt.*;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;





public class BoxComponent extends JComponent {
	private Shape rectangle;
	private int x = 100;
	private int y = 100;
	private int step = 8;
	private int diameter = 25;
	
	
	public BoxComponent() {
		super();
		rectangle = new Rectangle2D.Double(x, y, diameter, diameter);
		repaint();
	}
	
	//Methods to move the box
	public void MoveBoxUp() {
		if(y - step < 0) {
			this.y = 0;
		}
		else {
			this.y = y - step;
		}
		rectangle = new Rectangle2D.Double(x, y, diameter, diameter);
		repaint();
	}
	public void MoveBoxDown(int frameheight) {
		if((y+diameter) + step > frameheight) {
			this.y= frameheight - diameter;
		}
		else{
			this.y = y + step;
		}
		rectangle = new Rectangle2D.Double(x, y, diameter, diameter);
		repaint();
		
	}
	public void MoveBoxLeft() {
		if(x - step < 0) {
			this.x = 0;
		}
		else{
			this.x = x - step;
		}
		rectangle = new Rectangle2D.Double(x, y, diameter, diameter);
		repaint();
	}
	public void MoveBoxRight(int framewidth) {
		if((x + diameter) + step > framewidth) {
			this.x = framewidth - diameter;
		}
		else{
			this.x = x + step;
		}
		rectangle = new Rectangle2D.Double(x, y, diameter, diameter);
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.GREEN);
		g2d.fill(rectangle);
		
	}
	
}

