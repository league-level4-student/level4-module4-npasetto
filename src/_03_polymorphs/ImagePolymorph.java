package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class ImagePolymorph extends Polymorph{
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	ImagePolymorph(double x, double y, double width, double height) {
		super(x, y, width, height);
		if(needImage) {
			loadImage("rocket.png");
		}
	}

	@Override
	public void draw(Graphics g) {
		if(gotImage) {
			g.drawImage(image,(int) x,(int) y,(int) width,(int) height,null);
		}
		// TODO Auto-generated method stub
		
	}
	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}
}
