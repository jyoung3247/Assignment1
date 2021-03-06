package mainpackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CreateAndShowGui extends JFrame {
	private BoxComponent thebox;
	private JPanel mainpanel;

	
	private class MoveKeys implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			int ID = e.getKeyCode();
			int frameheight = mainpanel.getHeight();
			int framewidth = mainpanel.getWidth();
			
			if(ID == KeyEvent.VK_UP) {
				thebox.MoveBoxUp();
			}
			if(ID == KeyEvent.VK_DOWN){
				thebox.MoveBoxDown(frameheight);
			}
			if(ID == KeyEvent.VK_LEFT) {
				thebox.MoveBoxLeft();
			}
			if (ID == KeyEvent.VK_RIGHT){
				thebox.MoveBoxRight(framewidth);
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	public CreateAndShowGui(String title) {
		Container contpane = getContentPane();
		mainpanel = new JPanel();
		mainpanel.setBackground(Color.BLACK);
		mainpanel.setLayout(new BorderLayout());
		thebox = new BoxComponent();
		mainpanel.add(thebox, BorderLayout.CENTER);
		thebox.setFocusable(true);
		thebox.addKeyListener(new MoveKeys());
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
