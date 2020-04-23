package _03_polymorphs;

import java.awt.Color;

import java.awt.Graphics;

public class BluePolymorph extends Polymorph{

	BluePolymorph(double x, double y, double width, double height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect((int) x,(int) y,(int) width,(int) height);
	}
	
}
