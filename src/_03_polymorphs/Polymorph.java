package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    protected double x;
    protected double y;
    protected double width;
    protected double height;
    
    Polymorph(double x, double y, double width, double height){
   	 this.x = x;
   	 this.y = y;
   	 this.width=width;
   	 this.height=height;
    }
    public double getX() {
    	return x;
    }
    public double getY() {
    	return y;
    }
    public double getWidth() {
    	return width;
    }
    public double getHeight() {
    	return height;
    }
    public void setX(double x) {
    	this.x=x;
    }
    public void setY(double y) {
    	this.y=y;
    }
    public void setWidth(double width) {
    	this.width=width;
    }
    public void setHeight(double height) {
    	this.height=height;
    }
    public void update(int mouseX, int mouseY){
   	 
    }
    
    public abstract void draw(Graphics g);
}
