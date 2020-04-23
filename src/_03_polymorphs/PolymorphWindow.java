package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener, MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    private int mouseX=0;
    private int mouseY=0;
    private JFrame window;
    private Timer timer;
    Random rand=new Random();
    Polymorph bluePoly;
    Polymorph redPoly;
    Polymorph movePoly;
    int polyNum=280;
    ArrayList<Polymorph> polymorphs=new ArrayList<Polymorph>();
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.addMouseMotionListener(this);
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
   	 for (int i = 0; i < polyNum; i++) {
		if(i%7==0) {
			polymorphs.add(new BluePolymorph(rand.nextInt(WIDTH),rand.nextInt(HEIGHT),rand.nextInt(80)+20,rand.nextInt(80)+20));
		}else if(i%7==1) {
			polymorphs.add(new RedPolymorph(rand.nextInt(WIDTH),rand.nextInt(HEIGHT),rand.nextInt(80)+20,rand.nextInt(80)+20));
		}else if(i%7==2){
			polymorphs.add(new MovingPolymorph(rand.nextInt(WIDTH),rand.nextInt(HEIGHT),rand.nextInt(80)+20,rand.nextInt(80)+20));
		}else if(i%7==3){
			polymorphs.add(new CirclePolymorph(rand.nextInt(WIDTH),rand.nextInt(HEIGHT),rand.nextInt(80)+20,rand.nextInt(80)+20));
		}else if(i%7==4){
			polymorphs.add(new MousePolymorph(rand.nextInt(WIDTH),rand.nextInt(HEIGHT),rand.nextInt(80)+20,rand.nextInt(80)+20));
		}else if(i%7==5) {
			polymorphs.add(new ImagePolymorph(rand.nextInt(WIDTH),rand.nextInt(HEIGHT),rand.nextInt(80)+20,rand.nextInt(80)+20));
		}else {
			Polymorph click=new ClickPolymorph(rand.nextInt(WIDTH),rand.nextInt(HEIGHT),rand.nextInt(80)+20,rand.nextInt(80)+20);
			polymorphs.add(click);
			window.addMouseListener(click);
		}
	}
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for (Polymorph polymorph : polymorphs) {
		polymorph.draw(g);
	}
   	 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	for (Polymorph polymorph : polymorphs) {
		polymorph.update(mouseX,mouseY);
	}
    }

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		System.out.println("mouse");
		mouseX=arg0.getX();
		mouseY=arg0.getY();
	}
}
