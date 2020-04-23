package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class ClickPolymorph extends Polymorph implements MouseListener{

	ClickPolymorph(double x, double y, double width, double height) {
		super(x, y, width, height);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect((int) x,(int) y,(int) width,(int) height);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicked");
		if(e.getX()>=x && e.getX()<=x+width && e.getY()<=y+height && e.getY()>=y) {
			JOptionPane.showMessageDialog(null, "Clicked!");
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
