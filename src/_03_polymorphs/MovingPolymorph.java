package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingPolymorph extends Polymorph{
	Random rand=new Random();
	private double moveX;
	private double moveY;
	MovingPolymorph(double x, double y, double width, double height) {
		super(x, y, width, height);
		moveX=rand.nextDouble()*2-1;
		moveY=rand.nextDouble()*2-1;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect((int) x, (int) y, (int) width, (int) height);
	}
	@Override
	public void update(int mouseX, int mouseY) {
		x+=moveX;
		y+=moveY;
		moveX-=(x-PolymorphWindow.WIDTH/4)/100;
		moveY-=(y-PolymorphWindow.HEIGHT/2)/100;
	}
}
