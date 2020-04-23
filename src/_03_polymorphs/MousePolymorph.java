package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MousePolymorph extends Polymorph{

	MousePolymorph(double x, double y, double width, double height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect((int) x,(int) y,(int) width,(int) height);
	}
	@Override
	public void update(int mouseX, int mouseY) {
		x=mouseX;
		y=mouseY;
	}
}
