package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class CirclePolymorph extends Polymorph {
	private Random rand=new Random();
	private double angle;
	private double centerX;
	private double centerY;
	private double motion=(rand.nextDouble()-.5)/10;
	CirclePolymorph(double x, double y, double width, double height) {
		super(x, y, width, height);
		angle=0;
		centerX=x;
		centerY=y;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.MAGENTA);
		g.fillRect((int) x,(int) y,(int) width,(int) height);
	}
	@Override
	public void update(int mouseX, int mouseY) {
		x=centerX+60*Math.cos(angle);
		y=centerY+60*Math.sin(angle);
		angle+=motion;
	}
}
