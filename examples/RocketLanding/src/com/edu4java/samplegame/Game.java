package com.edu4java.samplegame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import org.yakindu.scr.TimerService;
import org.yakindu.scr.rocketlanding2.IRocketLanding2Statemachine.SCIGameListener;
import org.yakindu.scr.rocketlanding2.RocketLanding2Statemachine;

@SuppressWarnings("serial")

public class Game extends JPanel implements ActionListener, KeyListener {
	
	private Base base;
	private Rectangle ground;
	private Wall wall1;
	private Wall wall2;
	private Rocket rocket;
	
	Timer t = new Timer(5, this);
	
	public Game(){
		super();
		
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
		this.base = new Base();
		this.ground = new Rectangle(0, 340, 300, 30);
		this.wall1 = new Wall(10);
		this.wall2 = new Wall(250);
		this.rocket = new Rocket(this.wall1.getLocation()+10, this.wall2.getLocation(), 10, 100);
	}
	
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fill(ground);
        g2d.fill(base.getShape());
        g2d.fill(wall1.getShape());
        g2d.fill(wall2.getShape());
        g2d.fill(rocket.getShape());
        System.out.println("" + rocket.getShape().getBounds());
        g2d.drawString(rocket.getString(), 150, 50);
    }
    
    public void keyPressed(KeyEvent e){
    	int code = e.getKeyCode();
    	if (code == KeyEvent.VK_RIGHT){
    		this.rocket.moveRight();
    	}
    	
    	if (code == KeyEvent.VK_LEFT){
    		this.rocket.moveLeft();
    	}
    	
    	if (code == KeyEvent.VK_P){
    		this.rocket.pause();
    	}
    }
    
    public void actionPerformed(ActionEvent e){
    	
    }
    
    public void keyTyped(KeyEvent e){}
    
    public void keyReleased(KeyEvent e){}
    
    
	private class Base{
		
		Random rand;
		
		public Base(){
			this.rand = new Random();
		}
		
		public int location = 150;
		
		public int getLocation(){
			return location;
		}
		
		public Shape getShape(){
			return new Rectangle(location, 330, 10, 10);
		}
		
		public void moveBase(){
			int i = rand.nextInt(40);
			location = location - (i-20);
		}
		
	}
	
	
	private class Wall{
		
		private int location;
		
		public Wall(int location){
			this.location = location;
		}
		
		public Shape getShape(){
			return new Rectangle(location, 10, 10, 500);
		}
		
		public int getLocation(){
			return this.location;
		}
		
	}

	private class Rocket{

		private RocketLanding2Statemachine sm;
		private String s;
		
		public Rocket(int wall1, int wall2, int width, int height){
			
			this.s = "";
			
			this.sm = new RocketLanding2Statemachine();
			sm.setTimer(new TimerService());
			sm.init();
			sm.getSCILeftWall().setX(wall1);
			sm.getSCIRightWall().setX(wall2);
			sm.getSCIRocket().setWidth(width);
			sm.getSCIRocket().setHeight(height);
			sm.getSCIGround().setLevel(340);
			sm.getSCIPlatform().setX(150);
			sm.getSCIGame().getListeners().add(myGameEventListener);
			sm.enter();
		}
		
		public void pause() {
			sm.getSCIGame().raisePausePressed();
			
		}

		
		SCIGameListener myGameEventListener = new SCIGameListener() {
			
			@Override
			public void onOverWonRaised() {
				s = "YOU WON!";				
			}
			
			@Override
			public void onOverLoseRaised() {
				s = "YOU LOSE!";				
			}
			
			@Override
			public void onCountDownRaised(long value) {
				s = "Count Down " + value;			
			}

			@Override
			public void onPausedRaised() {
				s = "Game Paused";
				
			}

			@Override
			public void onContinuedRaised() {
				s = "";
				
			}
		};
		
		
		public String getString() {
			return s;
		}

		public void moveLeft() {
			sm.getSCILeftButton().raisePressed();
			
		}

		public void moveRight() {
			sm.getSCIRightButton().raisePressed();
			
		}

		public void moveRocket(){
			
			sm.runCycle();
			base.location = (int) sm.getSCIPlatform().getX();
			//System.out.println(sm.getRocketY());
		}
		
		public Shape getShape(){
			return new Rectangle((int)sm.getSCIRocket().getX(), (int)sm.getSCIRocket().getY(), 10, 100);
		}
	}
	
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Sample Frame");
        Game game = new Game();
        
        frame.add(game);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
        	//game.base.moveBase();
        	game.rocket.moveRocket();
            game.repaint();
            Thread.sleep(100);
        }
    }


}